package pages;

import org.openqa.selenium.By;

public class AccountPage extends BasePage{

    public String my_account_page_url = "https://www.rokomari.com/my-section/profile";
    public String order_page_url = "https://www.rokomari.com/my-section/orders";
    public String wishlist_page_url = "https://www.rokomari.com/my-section/wish-list";
    public String success_msg_text = "Updated Successfully";


    public By my_profile = By.xpath("//a[normalize-space()='My Profile']");
    public By my_list = By.xpath("//a[normalize-space()='My List']");
    public By wish_list = By.xpath("//div[@id='js--desktop-header-container']//a[8]");
    public By following_author = By.xpath("//a[normalize-space()='Following Authors']");
    public By change_info_option = By.xpath("//span[@id='js--edit-personal']");
    public By gender_option = By.xpath("//label[@for='gender']");
    public By male_option = By.xpath("//label[@for='customRadioInline1']");
    public By female_option = By.xpath("//label[@for='customRadioInline2']");
    public By default_gender_dropdown = By.xpath("//option[normalize-space()='Select gender']");
    public By save_btn = By.xpath("//input[@id='personalInfo']");
    public By confirm_msg = By.xpath("//span[@id='userInfoChangeMsg']");

    public By set_add_password = By.xpath("//span[@id='js--edit-password']");
    public By set_new_password = By.xpath("//input[@id='newPwd']");
    public By set_confirm_password = By.xpath("//input[@id='renewPwd']");
    public By save_password_btn = By.xpath("//input[@id='js--change-social-pass']");
    public By password_confirm_msg = By.xpath("//p[contains(text(),'Your password changed successfully. Please login u')]");
    public By password_mismatch_validation_msg = By.xpath("//div[@class='error text-danger font-italic mt-3']");
    public By weak_password_validation_msg = By.xpath("//span[@id='editPassword']");

    public By order_option = By.xpath("//div[@class='dropdown user-menu']//a[2]");
    public By order_amount = By.xpath("//div[@class='row']//h4[1]");
    public By wishlist_option = By.xpath("//a[@class='dropdown-item dropdown-item-new'][normalize-space()='Wishlist']");
    public By wishlist_amount = By.xpath("//h4[normalize-space()='My Wishlist']");




}
