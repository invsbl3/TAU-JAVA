package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class WindowManager {
    private final WebDriver driver;
    private final WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack() {
        navigate.back();
    }

    public void goForward() {
        navigate.forward();
    }

    public void refreshPage() {
        navigate.refresh();
    }

    public void goTo(String url) {
        navigate.to(url);
    }
    public void switchToNewWindow(){
        driver.switchTo().newWindow(WindowType.TAB);
    }
    public String getWindowCode(){
        return driver.getWindowHandle();
    }
    public void switchtoTabCode(String code){
        driver.switchTo().window(code);
    }

    public void switchToTab(String tab) {
        var windows = driver.getWindowHandles();
        System.out.println("Number of tabs: " + windows.size());
        System.out.println("Window Handles");
        windows.forEach(System.out::println);
        for (String window : windows) {
            System.out.println("Switching to window: +" + window);
            driver.switchTo().window(window);

            // in this site, the title is the same for all pages,
            // what changes is a //div[@id='example']/h3
            //System.out.println("current window title: " + driver.getTitle());
            //if (tab.equals(driver.getTitle())) {

            String pageTitle = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
            System.out.println("current window title: "+ pageTitle);
            if(pageTitle.contains(tab)){
                break;
            }
        }
    }
}
