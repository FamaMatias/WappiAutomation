package com.speedup.qa.interacion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Variable {

   protected static WebDriver driver;
   private static WebDriverWait wait;

   static {
       ChromeOptions chromeOptions = new ChromeOptions();
       driver = new ChromeDriver(chromeOptions);
       wait = new WebDriverWait(driver,10);
   }

    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public WebElement textForElement(String locator){
        return Find(locator);
    }

    public void clickElement(String locator){
       Find(locator).click();
    }

    public static void DismisAlert(Target closePopup){
       driver.switchTo().alert();
   }
}
