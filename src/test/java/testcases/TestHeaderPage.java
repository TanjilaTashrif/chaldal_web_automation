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
    public void loadHeaderPageForTest() {
        homePage.loadHomePage();
    }

    @Test(priority = 0, description = "Verify that the header option is displayed.")
    public void TestheaderoptionDisplay() {
        Assert.assertTrue(headerPage.isVisible(headerPage.log_in_option));
        Assert.assertTrue(headerPage.isEnable(headerPage.log_in_option));

        Assert.assertTrue(headerPage.isVisible(headerPage.website_logo));
        Assert.assertTrue(headerPage.isEnable(headerPage.website_logo));

        Assert.assertTrue(headerPage.isVisible(headerPage.navbar_items));

        Assert.assertTrue(headerPage.isVisible(headerPage.menu_icon));
    }



    @Test(priority = 1, description = "Verify Menu Items are added")
    public void TestMenuItemsDisplay() {
        Assert.assertTrue(headerPage.isVisible(headerPage.menuitems));
        Assert.assertTrue(headerPage.isEnable(headerPage.menuitems));
    }

    @Test(priority = 2, description = "Verify Menu Items are Clickable")
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

    @Test(priority = 3, description = "Verify offer button should be clickable")
    public void TestofferButton() {
        headerPage.clickOnElement(headerPage.offer_button);
        Assert.assertTrue(headerPage.isVisible(headerPage.offer_button));
        headerPage.clickOnElement(headerPage.offer_button_page);
        Assert.assertTrue(headerPage.isVisible(headerPage.offer_button_page));

    }

    @Test(priority = 4, description = "Verify offer button flash page functionality")
    public void Testofferbuttonflashsale() throws InterruptedException {
        headerPage.clickOnElement(headerPage.offer_button);
        Thread.sleep(3000);
        headerPage.clickOnElement(headerPage.flashsale_button);
        Thread.sleep(5000);
        Assert.assertTrue(headerPage.isVisible(headerPage.flashsale_button_page));

    }

    @Test(priority = 5, description = "Verify menu items functionality")
    public void menuitemsfunctionality() throws InterruptedException {
//        Assert.assertTrue(headerPage.isVisible(headerPage.menuItems_all_button));
//        Assert.assertTrue(headerPage.isEnable(headerPage.menuItems_all_button));

        headerPage.clickOnElement(headerPage.food_button);
//        Thread.sleep(3000);
        headerPage.clickOnElement(headerPage.fruits_button);
//        Thread.sleep(5000);

//        Assert.assertTrue(headerPage.isVisible(headerPage.fruits_button_page));

        headerPage.clickOnElement(headerPage.fresh_vegetable_button);
//        Thread.sleep(3000);
//        Assert.assertTrue(headerPage.isVisible(headerPage.fresh_vegetable_button_page));
        Thread.sleep(3000);
//        headerPage.scrollAndHover(headerPage.kacha_morich);
        headerPage.waitForElementPresence(headerPage.kacha_morich);
        headerPage.scrollToAElement(headerPage.kacha_morich, 200);
//        Thread.sleep(5000);

//        headerPage.hoverOnElement(headerPage.kacha_morich_hover);
        Thread.sleep(2000);

//        headerPage.safeClick(headerPage.kacha_morich);
//        Thread.sleep(2000);
//        Thread.sleep(3000);

    }

    @Test(priority = 6, description = "Verify offer button flash page functionality")
    public void TestPaginationBar() throws InterruptedException {

        headerPage.safeClick(headerPage.right_pagination_bar);
//        Thread.sleep(3000);
        Assert.assertTrue(headerPage.isVisible(headerPage.stationery_product));
        Assert.assertEquals(headerPage.getElementText(headerPage.stationery_product),"Stationery & Office");
    }

    @Test(priority = 7, description = "Verify offer button flash page functionality")
    public void TestBodyLastPart() throws InterruptedException {

//        headerPage.safeClick(headerPage.corporate_option);
        headerPage.scrollToAElement(headerPage.corporate_option, 100);
        Thread.sleep(3000);

        headerPage.clickOnElement(headerPage.corporate_option);
        Thread.sleep(3000);
        Assert.assertEquals(getDriver().getCurrentUrl(), headerPage.corporate_url);

    }

    @Test(priority = 8, description = "Verify offer button flash page functionality")
    public void TestIconClick() throws InterruptedException {
        headerPage.scrollToAElement(headerPage.deliver_cost_section, 200);
        Assert.assertTrue(headerPage.isVisible(headerPage.delivery_cost_text));

        headerPage.clickOnElement(headerPage.minus_icon);
//        Assert.assertTrue(headerPage.isVisible(headerPage.whole_section_text));
        Assert.assertTrue(headerPage.isVisible(headerPage.delivery_cost_text));

    }





}
