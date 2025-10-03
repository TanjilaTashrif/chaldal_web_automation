package testcases;

//import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.DriverSetup;

public class TestHomePage extends DriverSetup {

    HomePage homePage = new HomePage();
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void loadHomePageForTest(){
        homePage.loadHomePage();
//        homePage.clickOnElement(homePage.pop_up_btn);
    }

    @Test(description = "Test Home Page Title", priority = 0, groups = "Sanity, Regression")
//    @Description ("Allure - Test Home Page Title")
    public void TestHomePageTitle(){
//        homePage.addScreenshot("Home page");
        Assert.assertEquals(getDriver().getTitle(), homePage.title);
    }

    @Test(priority = 1, description = "Verify different types of books are displayed on the homepage.")
//    @Description("Test All types of books are displayed in the homepage.")
    public void TestBookTypesDisplayed(){
        Assert.assertTrue(homePage.isVisible(homePage.book_types1));
        Assert.assertTrue(homePage.isVisible(homePage.book_types2));
        Assert.assertTrue(homePage.isVisible(homePage.book_types3));
        Assert.assertTrue(homePage.isVisible(homePage.book_types4));
        Assert.assertFalse(homePage.isVisible(homePage.book_types5));
//        homePage.addScreenshot("Home page");
    }

    @Test(priority = 2, description = "Verify that any deals, discounts, or carousel banner are correctly displayed on the home page.")
//    @Description("Test Deals, discounts, or promotions should be displayed correctly.")
    public void TestCarouselDisplay(){
//        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Assert.assertTrue(homePage.isVisible(homePage.carousel_3));
        softAssert.assertTrue(homePage.isVisible(homePage.carousel_4));
    }

    @Test(priority = 3, description = "Verify that carousel banners are working perfectly.")
//    @Description("Should open a new page or same page after clicking the banner.")
    public void TestOpenCarousel(){
        homePage.clickOnElement(homePage.carousel_4th_bottom_icon);
        homePage.clickOnElement(homePage.carousel_4);
        Assert.assertTrue(homePage.isVisible(homePage.carousel_4th_related_all_books));
        Assert.assertFalse(getDriver().getCurrentUrl().equals(homePage.url));
        getDriver().navigate().back();
        Assert.assertTrue(getDriver().getCurrentUrl().equals(homePage.url));
        homePage.clickOnElement(homePage.carousel_right_side_option);
        Assert.assertTrue(homePage.isVisible(homePage.carousel_2));
        homePage.clickOnElement(homePage.carousel_left_side_option);
        Assert.assertTrue(homePage.isVisible(homePage.carousel_1));
    }

}
