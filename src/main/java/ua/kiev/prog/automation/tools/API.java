package ua.kiev.prog.automation.tools;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.Cookie;
import ua.kiev.prog.automation.base.Session;

import java.util.Map;


public class API {

    public void loginIntoWebSite() {
        //http://zvisno.com/index.php?route=account/login

        //email
        //password


        Response response = RestAssured.given()
                .param("email", "yurii.voronenko@gmail.com")
                .param("password", "12345678")
                .post("http://zvisno.com/index.php?route=account/login")
                .then().extract().response();

        for(Map.Entry<String, String> cookie: response.getCookies().entrySet()) {
            String param = cookie.getKey();
            String value = cookie.getValue();
            Session.getInstance()
                    .driver()
                    .manage()
                    .addCookie(new Cookie(param, value));
        }

        Session.getInstance().driver().navigate().refresh();

    }

}
