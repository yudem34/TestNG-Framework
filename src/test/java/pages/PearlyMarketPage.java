package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PearlyMarketPage {
    public PearlyMarketPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "[id='proceed-button']")
    public WebElement siteyeDevamEt;  // Guvenli degil uyarisini gecme

    @FindBy (xpath = "//span[text()='Sign In']")
    public WebElement signIn;  // Ana sayfa sign in bolumu

    @FindBy (css = "[id='username']")
    public  WebElement signUserNameOrEmail; // Giris yap ekranında mail adresi giris bolumu

    @FindBy (css = "[id='password']")
    public  WebElement signPassword; // Giris yap ekranında password giris bolumu

    @FindBy (css = "[name='login']")
    public WebElement singInButonu;  // Bilgiler girildikten sonra onay butonu

    @FindBy (xpath = "//a[text()='My Account']")
    public WebElement myAccount; // Ana sayfa en altta bulunan MyAccount bolumu

    @FindBy (xpath = "//div[@data-id='b1b2804']//div[@class='elementor-widget-container']")
    public WebElement enAltaInme; // Kartların resminin oldugu bolum

    @FindBy (xpath = "//a[contains(text(),'Store Manager')]")
    public WebElement storeManager; // menu

    @FindBy (xpath = "//span[contains(text(),'Customers')]")
    public WebElement customers;

    @FindBy (xpath = "//h2[text()='Manage Customers']")
    public WebElement manageCustomersYazısı;

    @FindBy (xpath = "//span[contains(text(),'Add New')]")
    public WebElement addNew; // Musteri ekleme butonu

    @FindBy (css = "[id='user_name']")
    public WebElement userName; // Musteri ekleme username kutusu

    @FindBy (css = "[id='wcfm_customer_submit_button']")
    public WebElement submitButonu; // Musteri bilgileri sonrası onaylama butonu

    @FindBy (xpath = "//tbody//tr//td")
    public List<WebElement> musteriBilgileri;

    @FindBy (xpath = "//span[text()='PDF']")
    public WebElement pdfDownload;

    @FindBy (xpath = "//span[text()='Excel']")
    public WebElement excelDownload;

    @FindBy (xpath = "//span[text()='CSV']")
    public WebElement csvDownload;

    @FindBy (xpath = "//tbody//tr//td[3]")
    public List<WebElement> emailList;

    @FindBy (css = "[id='user_email']")
    public WebElement sonEklenenEmail;

    @FindBy (css = "[id='bfirst_name']")
    public WebElement billingFirstName;

    @FindBy (css = "[id='same_as_billing']")
    public WebElement sameAsBilling;

    @FindBy (css = "[id='sfirst_name']")
    public WebElement shippingFirstName;

    @FindBy (css = "[class='wcfm-message wcfm-success']")
    public WebElement kaydedildiYazisi;

    @FindBy (css = "[class='register inline-type']")
    public WebElement register;

    @FindBy (xpath = "//*[text()='Become a Vendor']")
    public WebElement becomeAVendor;

    @FindBy (css = "[id='user_email']")
    public WebElement emailBox;

    @FindBy (xpath = "//input[@type='button']")
    public WebElement reSendCode;

    @FindBy (css = "[name='wcfm_email_verified_input']")
    public WebElement getReSendCodeBox;

    @FindBy (xpath = "//*[text()='Welcome to Pearly Market!']")
    public WebElement magazaDogrulama;

    @FindBy (css = "[class='wcfm-message wcfm-error']")
    public WebElement hataliCode;

    @FindBy (xpath = "//span[text()='PDF']")
    public WebElement pdfDownloadButton;

    @FindBy (xpath = "//span[text()='Excel']")
    public WebElement excelDownloadButton;

    @FindBy (xpath = "//span[text()='CSV']")
    public WebElement cvsDownloadButton;

    @FindBy (xpath = "//span[contains(text(),'Coupons')]")
    public WebElement couponsButtonu;















}
