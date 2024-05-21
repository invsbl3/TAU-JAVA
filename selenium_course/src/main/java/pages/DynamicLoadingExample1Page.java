package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.time.Duration;

public class DynamicLoadingExample1Page {
    protected WebDriver driver;
    protected By startButton = By.cssSelector("#start button");
    protected By loadingIndicator = By.id("loading");
    protected By finishText = By.id("finish");


    public DynamicLoadingExample1Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);


        WebElement invsbl3 = driver.findElement(loadingIndicator);
        wait.until(ExpectedConditions.invisibilityOf(invsbl3));
    }
    public String getLoadedText(){
        return driver.findElement(finishText).getText();
    }

}
