package testcases;

import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.HomePage;
import utilities.DriverSetup;

import java.time.Duration;

public class TestHeaderPage extends DriverSetup {

    HeaderPage headerPage = new HeaderPage();
    HomePage homePage = new HomePage();

    @BeforeMethod
    public void loadHeaderPageForTest(){
        homePage.loadHomePage();
    }

    @Test(priority = 0, description = "Verify that the header option is displayed.")
    public void TestheaderoptionDisplay(){
        Assert.assertTrue(headerPage.isVisible(headerPage.log_in_option));
        Assert.assertTrue(headerPage.isEnable(headerPage.log_in_option));

        Assert.assertTrue(headerPage.isVisible(headerPage.website_logo));
        Assert.assertTrue(headerPage.isEnable(headerPage.website_logo));

        Assert.assertTrue(headerPage.isVisible(headerPage.navbar_items));

        Assert.assertTrue(headerPage.isVisible(headerPage.menu_icon));
    }

   /* @Test(priority = 1, description = "Verify logo of the website")
    public void TestWebsiteLogoDisplay(){
        Assert.assertTrue(headerPage.isVisible(headerPage.website_logo));
        Assert.assertTrue(headerPage.isEnable(headerPage.website_logo));
    }


    @Test(priority = 2, description = "Verify that all navbar items are visible.")
    public void TestNavbarItemsDisplay(){
        Assert.assertTrue(headerPage.isVisible(headerPage.navbar_items));

    }


    @Test(priority = 3, description = "Verify Menu Icon is added to header")
    public void TestMenuIconDisplay(){
        Assert.assertTrue(headerPage.isVisible(headerPage.menu_icon));

    }*/

    @Test(priority = 4, description = "Verify Menu Items are added")
    public void TestMenuItemsDisplay(){
        Assert.assertTrue(headerPage.isVisible(headerPage.menuitems));
        Assert.assertTrue(headerPage.isEnable(headerPage.menuitems));
    }

    @Test(priority = 5, description = "Verify Menu Items are Clickable")
    public void MenuItems1stClickable() throws InterruptedException {
        headerPage.clickOnElement(headerPage.menuitems_2nd);
        Thread.sleep(3000);
        Assert.assertTrue(headerPage.isVisible(headerPage.menuicon_2nd_items_1st_page));
        Assert.assertEquals(getDriver().getCurrentUrl(), headerPage.menuitem_2nd_url);

        getDriver().navigate().back();
        Thread.sleep(6000);

        headerPage.clickAndSwitchToNewTab(headerPage.menuitems_3rd);
        Thread.sleep(3000);
        Assert.assertEquals(getDriver().getCurrentUrl(), headerPage.menuitems_3rd_items_url);
    }

//    @Test(priority = 6, description = "Verify that the \"Log in\" button should be clickable")
//    public void TestSignInButton(){
//        headerPage.clickOnElement(headerPage.log_in_option);
//       // Assert.assertEquals(headerPage.getElement(headerPage.sign_in_page_msg).getText(),"সাইন ইন করুন");
//    }

//    @Test(priority = 7, description = "Verify the Search bar functionality")
//    public void TestSearchBarFunctionality(){
//        headerPage.writeOnElement(headerPage.search_bar, "History");
//        Assert.assertTrue(headerPage.isEnable(headerPage.search_bar));
//    }

    @Test(priority = 8, description = "Verify the home page should be open by clicking on the logo on all pages.")
    public void TestOpenHomePage() throws InterruptedException {
        headerPage.scrollToAElement(headerPage.academic_book_1, -50);
//        Thread.sleep(5000);
        headerPage.clickOnElement(headerPage.academic_book_1);
//        Thread.sleep(6000);
        headerPage.clickOnElement(headerPage.website_logo);
//        Thread.sleep(6000);
        Assert.assertEquals(getDriver().getCurrentUrl(), homePage.url);
    }

    @Test(priority = 9, description = "Verify that the Menu bar all items are clickable.")
    public void TestMenuBarClickable() throws InterruptedException {
        headerPage.clickOnElement(headerPage.menubar_electronics);
//        Thread.sleep(6000);
        headerPage.clickOnElement(headerPage.menubar_best_seller);
//        Thread.sleep(6000);
        headerPage.clickOnElement(headerPage.menubar_order);
//        Thread.sleep(6000);
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
        Assert.assertFalse(getDriver().getCurrentUrl().equals(homePage.url));
        Assert.assertEquals(getDriver().getCurrentUrl(), headerPage.order_page_url);
    }
}
