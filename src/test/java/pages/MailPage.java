package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MailPage {
    public MailPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy (css = "[class='email']")
    public WebElement mailCopy;

    @FindBy (xpath = "(//tr[@class='unseen'])[1]")
    public WebElement codeAlma1;

    @FindBy (xpath = "(//tr[@class='unseen'])[2]")
    public WebElement codeAlma2;

    @FindBy (xpath = "//b")
    public WebElement code;

    @FindBy (xpath = "//div[@class='body']//iframe")
    public WebElement iframe;
}
