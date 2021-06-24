package ua.kiev.prog.automation.UI.factory;

//public class LoginFactory extends BasePage {
////    static final private By EMAIL_LOCATOR_STRING = By.xpath("//div[@id='content']//input[@id='input-email']");
////    static final private By PASSWORD_LOCATOR_STRING = By.xpath("//div[@id='content']//input[@id='input-password']");
////    static final private By SUBMIT_BUTTON_LOCATOR_STRING = By.xpath("//div[@id='content']//input[@type='submit']");
//    static final private By ERROR_LOCATOR_STRING = By.xpath("//div[@id='account-login']//div[contains(@class, 'alert-danger')]");
//
//    @FindBy(xpath = "//div[@id='content']//input[@id='input-email']")
//    public WebElement email_element;
//
//    @FindBy(xpath = "//div[@id='content']//input[@id='input-password']")
//    public WebElement password_element;
//
//    @FindBy(xpath = "//div[@id='content']//input[@type='submit']")
//    public WebElement submitButton;
//
//    @FindBys(@FindBy(xpath = "//div[@id='account-login']//div[contains(@class, 'alert-danger')]"))
//    public List<WebElement> errorMessageList;
//
////    public LoginFactory(WebDriver driver) {
////        super(driver);
////    }
//
//    public AccountPage login(String email, String password) {
//        email_element.sendKeys(email);
//        password_element.sendKeys(password);
//        submitButton.click();
//        return page(AccountPage.class);
//    }
////    public List<WebElement> getErrorMessages() {
////        return driver.findElements(ERROR_LOCATOR_STRING);
////    }
//}
