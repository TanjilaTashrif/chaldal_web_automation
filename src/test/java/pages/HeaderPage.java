package pages;

import org.openqa.selenium.By;


public class HeaderPage extends BasePage{

    public By log_in_option = By.xpath("//button[@class='signInBtn']");
    public By menu_icon = By.xpath("//button[@class='hamburgerMenu hidden-xs']//*[name()='svg']");
    public By website_logo = By.xpath("//img[@class='egg chaldal_logo']");

    public By navbar_items = By.xpath("//body/div[@id='page']/div[@class='app catalog navOpen chaldal-theme']/div[@class='headerWrapper']/div[@class='headerWrapperWrapper']/div[1]");
    public By navbar_items_2nd = By.xpath("//span[contains(text(),'রকমারি কুইজ')]");
    public By navbar_items_3rd = By.xpath("//span[contains(text(),'রকমারি উদ্যোক্তা')]");
    public By navbar_items_4th = By.xpath("//span[contains(text(),'ঘরে বসে আয় করুন')]");
    public By navbar_items_5th = By.xpath("//span[contains(text(),'বই ডোনেশন')]");

    public By menuItems_1 = By.xpath("//h5[normalize-space()='Grocery']");
    public By menuitems = By.xpath("//div[@class='menu-container']");
    public By menuitems_2nd = By.xpath("//div[@class='menu']//div[2]//*[name()='svg']");
    public By menuicon_2nd_items_1st_page = By.xpath("//div[@class='catalogBrowser']");
    public By menuitems_3rd = By.xpath("//div[@class='menu-container']//div[3]");
    public By menuicon_3rd_items_1st_page = By.xpath("//body/div[@class='app-container']/div[@role='none']/div[@role='none']/div[@dir='auto']/div[@role='none']/div[@role='none']/div[@role='none']/div[@role='none']/div[@role='none']/div[@role='none']/div[@role='none']/div[3]/div[2]/button[1]");








    public String menuitems_3rd_items_url = "https://cookups.app/";
    public String menuitem_2nd_url = "https://chaldal.com/pharmacy";

    public By offer_button = By.xpath("//span[normalize-space()='Offers']");
    public By offer_button_page = By.xpath("//h1[normalize-space()='Special Offers']");
    

    public By flashsale_button = By.xpath("//span[normalize-space()='Flash Sales']");
    public By flashsale_button_page = By.xpath("//ul[@class='offer-container']");
    public By menuItems_all_button = By.xpath("//div[@class='menu']");

    public By food_button = By.xpath("//div[contains(text(),'Food')]");
    public By fruits_button = By.xpath("//div[@class='name']//div//div//div[contains(text(),'Fruits & Vegetables')]");
    public By fruits_button_page = By.xpath("//img[@alt='Fresh Vegetables']");
    public By fresh_vegetable_button = By.xpath("//div[@class='category']//div//div[@class='name'][normalize-space()='Fresh Vegetables']");
    public By fresh_vegetable_button_page = By.xpath("//div[@class='fade-carousel-container']//img");








    public By search_bar = By.xpath("//input[@id='desktop_search_field']");
    public By academic_book_1 = By.xpath("//img[@alt='বিজ্ঞান প্রথম বর্ষ category image']");

    public By menubar_electronics = By.xpath("//span[contains(text(),'ইলেক্ট্রনিক্স')]");
    public By menubar_best_seller = By.xpath("//span[contains(text(),'বেস্টসেলার অ্যাওয়ার্ড, ২৪')]");
    public By menubar_order = By.xpath("//span[contains(text(),'প্রাতিষ্ঠানিক অর্ডার')]");
    public String order_page_url = "https://www.rokomari.com/corporate?ref=nmm";



}
