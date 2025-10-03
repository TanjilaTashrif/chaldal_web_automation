package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public By sign_in_btn = By.xpath("//a[@class='logged-out-user-menu-btn']");
    public By sign_out_btn = By.xpath("//a[@class='dropdown-item dropdown-item-new js--logout-button']");
    public By email_input_box = By.xpath("//input[@placeholder='Email or phone']");
    public  By password_input_box = By.xpath("//input[@name='password']");
    public  By next_btn = By.xpath("//button[@id='js--btn-next']");
    public By login_btn = By.xpath("//form[@id='otp-login-form']//button[@type='submit'][normalize-space()='Login']");
    public By otp_shown_msg = By.xpath("//p[@class='text-red-500 text-sm text-']");
    public By user_icon = By.xpath("//span[@class='user-name']");
    public  By error_msg = By.xpath("//input[@name='password']/following-sibling::p");

    public By sign_in_page_title = By.xpath("//h1[@class='text-start w-fit text-[24px] font-medium']");
    public By blank_input_msg = By.xpath("//p[@class='text-red-500 text-sm text-']");
    public By invalid_email_msg = By.xpath("//p[@class='text-red-500 text-sm text-']");

    public String user_email = "feciwe6718@anlocc.com";
    public String user_password = "1234567Aa";
}
