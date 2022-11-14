package utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Methodlar {
    static Faker faker;
    static Actions actions;
    static SoftAssert softAssert;
    static Select select;
    static WebElement ddm;
    //====== Faker ======//
    public static Faker getFaker() { // getFaker method
        return faker = new Faker();
    }
    //====== Actions ======//
    public static Actions getActions() { //getActions method
        return actions = new Actions(Driver.getDriver());
    }
    //====== Soft Assert ======//
    public static SoftAssert getSoftAssert() { //getSoftAssert method
        return softAssert = new SoftAssert();
    }
    //====== Select ======//
    public static Select select(WebElement ddm){
        return select = new Select(ddm);
    }
    //====== js ======//
    public static void jsclick(WebElement webElement){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", webElement);
        try {
            webElement.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
            executor.executeScript("arguments[0].click();", webElement);
        }
    }
}
