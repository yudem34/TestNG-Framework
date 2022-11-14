package tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MailPage;
import pages.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;


public class MailOnaylama {
    PearlyMarketPage pearlyMarket = new PearlyMarketPage();
    MailPage mailPage = new MailPage();
    Actions actions = new Actions(Driver.getDriver());
    String marketHandle;
    String mailHandle;
    String kod;

    @Test
    public void testName() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket"));
        marketHandle = Driver.getDriver().getWindowHandle();
        pearlyMarket.register.click();
        actions.moveToElement(pearlyMarket.becomeAVendor).click().perform();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get(ConfigReader.getProperty("mail"));
        mailHandle = Driver.getDriver().getWindowHandle();
        actions.moveToElement(mailPage.mailCopy).click().perform();
        Thread.sleep(5000);
        Driver.getDriver().switchTo().window(marketHandle);
        actions.moveToElement(pearlyMarket.emailBox).click().perform();
        pearlyMarket.emailBox.sendKeys(Keys.CONTROL + "v");
        Thread.sleep(5000);
        Driver.getDriver().switchTo().window(mailHandle);
        Thread.sleep(6000);
        Driver.getDriver().navigate().refresh();
        Thread.sleep(5000);
        mailPage.codeAlma1.click();
        Thread.sleep(3000);
        Driver.getDriver().switchTo().frame(mailPage.iframe);
        kod = mailPage.code.getText();
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().switchTo().window(marketHandle);
        Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys(kod).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("Batch89").sendKeys(Keys.TAB).sendKeys("Batch89", Keys.ENTER).perform();
        Thread.sleep(3000);
        Assert.assertTrue(pearlyMarket.magazaDogrulama.isDisplayed());
        Thread.sleep(2000);

    }
}

