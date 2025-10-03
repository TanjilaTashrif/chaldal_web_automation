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

    public By menuitems = By.xpath("//div[@class='menu-container']");
    public By menuitems_2nd = By.xpath("//div[@class='menu']//div[2]//*[name()='svg']");
    public By menuicon_2nd_items_1st_page = By.xpath("//div[@class='catalogBrowser']");
    public By menuitems_3rd = By.xpath("//div[@class='menu-container']//div[3]");
    public By menuicon_3rd_items_1st_page = By.xpath("//input[@placeholder='Search']");


    public By search_bar = By.xpath("//input[@id='desktop_search_field']");
    public By academic_book_1 = By.xpath("//img[@alt='বিজ্ঞান প্রথম বর্ষ category image']");

    public By menubar_electronics = By.xpath("//span[contains(text(),'ইলেক্ট্রনিক্স')]");
    public By menubar_best_seller = By.xpath("//span[contains(text(),'বেস্টসেলার অ্যাওয়ার্ড, ২৪')]");
    public By menubar_order = By.xpath("//span[contains(text(),'প্রাতিষ্ঠানিক অর্ডার')]");
    public String order_page_url = "https://www.rokomari.com/corporate?ref=nmm";



}
