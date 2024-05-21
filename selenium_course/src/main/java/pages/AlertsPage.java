package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[contains(.,'JS Alert')]");

    private By triggerConfirmButton = By.xpath("//button[contains(.,'JS Confirm')]");

    private By triggerPromptButton = By.xpath("//button[contains(.,'JS Prompt')]");


    private By result = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void triggerConfirm() {
        driver.findElement(triggerConfirmButton).click();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void acceptConfirm() {
        driver.switchTo().alert().accept();
    }

    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }
    public void putTextAndConfirmPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }

}

