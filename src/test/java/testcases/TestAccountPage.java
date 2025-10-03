package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HeaderPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverSetup;

public class TestAccountPage extends DriverSetup {

    HomePage homePage = new HomePage();
    HeaderPage headerPage = new HeaderPage();
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    @BeforeMethod
    public  void setup_class(){
        homePage.loadHomePage();
        homePage.clickOnElement(homePage.pop_up_btn);
        loginPage.clickOnElement(loginPage.sign_in_btn);
    }

    @Test(priority = 0, description = "Verify hover menu appears")
    public void TestHoverMenu(){
        loginPage.writeOnElement(loginPage.email_input_box, "redwanparvez200@gmail.com");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
        Assert.assertTrue(accountPage.isVisible(accountPage.my_profile));
    }

    @Test(priority = 1, description = "Verify hover menu options list")
    public void TestHoverMenuList(){
        loginPage.writeOnElement(loginPage.email_input_box, "redwanparvez200@gmail.com");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
        Assert.assertTrue(accountPage.isVisible(accountPage.my_list));
        Assert.assertTrue(accountPage.isVisible(accountPage.wish_list));
        Assert.assertTrue(accountPage.isVisible(accountPage.following_author));
    }

    @Test(priority = 2, description = "Verify hover menu disappears on mouse out")
    public void TestHoverMenuDisappears(){
        loginPage.writeOnElement(loginPage.email_input_box, "redwanparvez200@gmail.com");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
       // headerPage.hoverOnElement(headerPage.menubar_items_last);
       // Assert.assertTrue(headerPage.isVisible(headerPage.menubar_items_last));
    }

    @Test(priority = 3, description = "Verify My Profile navigation")
    public void TestProfileNavigation() throws InterruptedException {
        loginPage.writeOnElement(loginPage.email_input_box, "redwanparvez200@gmail.com");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
        Thread.sleep(2000);
        accountPage.clickOnElement(accountPage.my_profile);
        Thread.sleep(2000);
        Assert.assertEquals(getDriver().getCurrentUrl(), accountPage.my_account_page_url);
        Assert.assertFalse(getDriver().getCurrentUrl().equals(homePage.url));
    }

    @Test(priority = 4, description = "Verify Gender dropdown presence")
    public void TestGenderOptionDisplay() throws InterruptedException {
        loginPage.writeOnElement(loginPage.email_input_box, "redwanparvez200@gmail.com");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
        Thread.sleep(2000);
        accountPage.clickOnElement(accountPage.my_profile);
        Assert.assertTrue(accountPage.isVisible(accountPage.gender_option));
    }

    @Test(priority = 5, description = "Verify Gender options")
    public void TestGenderOptions() throws InterruptedException {
        loginPage.writeOnElement(loginPage.email_input_box, "redwanparvez100@gmail.com");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
        accountPage.clickOnElement(accountPage.my_profile);
        accountPage.clickOnElement(accountPage.change_info_option);
//        accountPage.clickOnElement(accountPage.gender_dropdown);
        Assert.assertTrue(accountPage.isVisible(accountPage.male_option));
        Assert.assertTrue(accountPage.isVisible(accountPage.female_option));
    }

    @Test(priority = 6, description = "Verify selecting a gender")
    public void TestSelectingGender() throws InterruptedException {
        loginPage.writeOnElement(loginPage.email_input_box, "redwanparvez100@gmail.com");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
        accountPage.clickOnElement(accountPage.my_profile);
        accountPage.clickOnElement(accountPage.change_info_option);
//        accountPage.clickOnElement(accountPage.gender_option);
        accountPage.clickOnElement(accountPage.male_option);
        accountPage.clickOnElement(accountPage.save_btn);
        accountPage.waitForElementPresence(accountPage.confirm_msg);
        Assert.assertTrue(accountPage.isVisible(accountPage.male_option));
        Assert.assertEquals(accountPage.getElement(accountPage.male_option).getText(),"Male");
        Assert.assertTrue(accountPage.isVisible(accountPage.confirm_msg));
        Assert.assertEquals(accountPage.getElement(accountPage.confirm_msg).getText(),"Updated Successfully");
//        Assert.assertEquals(accountPage.getElement(accountPage.confirm_msg).getText(),accountPage.success_msg_text);

    }

    @Test(priority = 7, description = "Verify empty gender field")
    public void TestEmptyGenderField() throws InterruptedException {
        loginPage.writeOnElement(loginPage.email_input_box, "redwanparvez100@gmail.com");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
        accountPage.clickOnElement(accountPage.my_profile);
        accountPage.clickOnElement(accountPage.change_info_option);
        accountPage.clickOnElement(accountPage.save_btn);
        accountPage.waitForElementVisible(accountPage.confirm_msg, 10);
        Assert.assertTrue(accountPage.isVisible(accountPage.confirm_msg));
        Assert.assertEquals(accountPage.getElement(accountPage.confirm_msg).getText(),"Updated Successfully");
    }

    @Test(priority = 8, description = "Verify persistence of the gender field")
    public void TestPersistenceGenderField() throws InterruptedException {
        loginPage.writeOnElement(loginPage.email_input_box, "redwanparvez100@gmail.com");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
        accountPage.clickOnElement(accountPage.my_profile);
        accountPage.clickOnElement(accountPage.change_info_option);
        accountPage.clickOnElement(accountPage.female_option);
        accountPage.clickOnElement(accountPage.save_btn);
//        Thread.sleep(5000);
        getDriver().navigate().refresh();
//        Thread.sleep(5000);
        Assert.assertTrue(accountPage.isVisible(accountPage.female_option));
    }

    @Test(priority = 9, description = "Verify Sign Out option")
    public void TestSignOut() throws InterruptedException {
        loginPage.writeOnElement(loginPage.email_input_box, "redwanparvez100@gmail.com");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
        accountPage.clickOnElement(loginPage.sign_out_btn);
        Assert.assertTrue(loginPage.isVisible(loginPage.sign_in_btn));
        Assert.assertEquals(getDriver().getCurrentUrl(), homePage.url);
    }

    @Test(priority = 10, description = "Verify password mismatch validation")
    public void TestPasswordMismatch() throws InterruptedException {
        loginPage.writeOnElement(loginPage.email_input_box, "19202103100@cse.bubt.edu.bd");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
        accountPage.clickOnElement(accountPage.my_profile);
        accountPage.clickOnElement(accountPage.change_info_option);
        accountPage.safeClick(accountPage.set_add_password);
        accountPage.writeOnElement(accountPage.set_new_password,"redwan100");
        accountPage.writeOnElement(accountPage.set_confirm_password,"redwan1001");
        Assert.assertEquals(accountPage.getElement(accountPage.password_mismatch_validation_msg).getText(),"* Password doesn't match");
        Assert.assertFalse(accountPage.isEnable(accountPage.save_password_btn));
    }

    @Test(priority = 11, description = "Verify weak password validation")
    public void TestWeakPassword() throws InterruptedException {
        loginPage.writeOnElement(loginPage.email_input_box, "19202103100@cse.bubt.edu.bd");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
        accountPage.clickOnElement(accountPage.my_profile);
        accountPage.clickOnElement(accountPage.change_info_option);
        accountPage.safeClick(accountPage.set_add_password);
        accountPage.writeOnElement(accountPage.set_new_password,"123456");
        accountPage.writeOnElement(accountPage.set_confirm_password,"123456");
        accountPage.safeClick(accountPage.save_password_btn);
        Assert.assertTrue(accountPage.isEnable(accountPage.save_password_btn));
        Assert.assertEquals(accountPage.getElement(accountPage.weak_password_validation_msg).getText(),"New Password length can't be less than 8 characters!");
    }

    @Test(priority = 12, description = "Verify Orders navigation")
    public void TestOrdersNavigation() throws InterruptedException {
        loginPage.writeOnElement(loginPage.email_input_box, "19202103100@cse.bubt.edu.bd");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
        accountPage.clickOnElement(accountPage.order_option);
        Assert.assertTrue(accountPage.isVisible(accountPage.order_amount));
        Assert.assertEquals(getDriver().getCurrentUrl(), accountPage.order_page_url);
    }

    @Test(priority = 13, description = "Verify Wishlist navigation")
    public void TestWishlistNavigation() throws InterruptedException {
        loginPage.writeOnElement(loginPage.email_input_box, "19202103100@cse.bubt.edu.bd");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
        accountPage.clickOnElement(accountPage.wishlist_option);
        Assert.assertTrue(accountPage.isVisible(accountPage.wishlist_amount));
        Assert.assertEquals(getDriver().getCurrentUrl(), accountPage.wishlist_page_url);
    }

    @Test(priority = 14, description = "Verify set password functionality")
    public void TestSetPasswordFunctionality() throws InterruptedException {
        loginPage.writeOnElement(loginPage.email_input_box, "19202103100@cse.bubt.edu.bd");
        loginPage.clickOnElement(loginPage.next_btn);
        loginPage.WaitAndAutoClick(loginPage.login_btn);
        loginPage.hoverOnElement(loginPage.user_icon);
        accountPage.clickOnElement(accountPage.my_profile);
        accountPage.safeClick(accountPage.set_add_password);
        accountPage.writeOnElement(accountPage.set_new_password,"redwan100");
        accountPage.writeOnElement(accountPage.set_confirm_password,"redwan100");
        accountPage.safeClick(accountPage.save_password_btn);
        Assert.assertTrue(accountPage.isVisible(accountPage.password_confirm_msg));
        Assert.assertEquals(accountPage.getElement(accountPage.password_confirm_msg).getText(),"Your password changed successfully. Please login using your new password.");
    }

}
