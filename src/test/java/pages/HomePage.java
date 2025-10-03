package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public String url= "https://www.chaldal.com/";
    public String title = "Rokomari.com - Online Book, Electronics & Super Shop in Bangladesh";
    public By pop_up_btn = By.xpath("//button[@class='popup-modal__close-btn close-btn-outside js--popup-modal__close-btn']");
    public By login_signup_btn = By.xpath("//a[@class='logged-out-user-menu-btn']");
    public By sign_out_btn = By.xpath("//a[normalize-space()='Sign Out']");

    public By book_types1 = By.xpath("//h1[contains(text(),'একাডেমিক বই')]");
    public By book_types2 = By.xpath("//h1[contains(text(),'ইসলামি বই')]");
    public By book_types3 = By.xpath("//h1[contains(text(),'ভাষা ও অভিধান বই')]");
    public By book_types4 = By.xpath("//h1[contains(text(),'উপন্যাসের বই')]");
    public By book_types5 = By.xpath("//h1[contains(text(),'শিশু-কিশোর বই')]");

    public By carousel_1 = By.xpath("//a[@id='slick-slide30']//img[@alt='Admission Carnival, 2025 banner image']");
    public By carousel_2 = By.xpath("//a[@id='slick-slide31']//img[@alt='এক নজরে কুরআন চাবির রিং অফার banner image']");
    public By carousel_3 = By.xpath("//a[@id='slick-slide32']//img[@alt='Super September banner image']");
    public By carousel_3rd = By.xpath("//button[@id='slick-slide-control32']");
    public By carousel_4 = By.xpath("//a[@id='slick-slide33']//img[@alt='সিরাত গ্রন্থমেলা-২৫ banner image']");
    public By carousel_4th_bottom_icon = By.xpath("//button[@id='slick-slide-control33']");
    public By carousel_4th_related_all_books = By.xpath("//h1[contains(text(),'Seerat Granthamela 2025')]");
    public By carousel_5 = By.xpath("//a[@id='slick-slide34']//img[@alt='Casio Calculator center banner image']");

    public By carousel_right_side_option = By.xpath("//section[@class='main-banner js--main-banner slick-initialized slick-slider slick-dotted']//button[@aria-label='Next'][normalize-space()='Next']");
    public By carousel_left_side_option = By.xpath("//button[@class='slick-prev slick-arrow']");


    public void loadHomePage(){
        loadAPage(url);
    }
}
