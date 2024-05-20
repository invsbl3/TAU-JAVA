import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

// object model of google search page
public class GoogleSearchPage {
    public final static By searchInput = By.name("q");

    // check that these needs ~pt-br~ as language...
    // String buttonToSearch = "//input[@value[contains(.,'Pesquisa Google')]]";
    // String buttonToSearch = "//input[contains(.,'Pesquisa Google')]";

    // this one is more generic, I think `btnK` works for all languages.
    // as most of the element attributes are just encripted data
    // i could't find more consistent ways to get the button
    public final static By searchButton = By.xpath("//input[@name='btnK']");

    public final static String url = "https://www.google.com";
    private final WebDriver driver;
    private final WebDriverWait wait;

    public GoogleSearchPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebDriver getDriver(){
        return this.driver;
    }


    public WebDriverWait getWait(){
        return this.wait;
    }


    public void loadPage(){
        getDriver().get(url);
    }

    public void getSearchTexts(String query){
        // put query
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchInput));
        driver.findElement(searchInput).sendKeys(query);

        // find search button and click
        WebElement button = getDriver().findElement(searchButton);
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        executor.executeScript("arguments[0].click();", button);

        // in results page, find and store the `description` from the `results`
        String spanWithQueryResultText = "//div[@style[contains(.,'-webkit-line-clamp')]]/span";
        // wait.until(ExpectedConditions.titleContains(query));
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(spanWithQueryResultText)));
        List<WebElement> resultTexts = getDriver().findElements(By.xpath(spanWithQueryResultText));
        printResults(resultTexts);
    }

    public static void printResults(List<WebElement> resultTexts){
        System.out.printf("\nResults found: %s\n", resultTexts.size());
        for (WebElement text : resultTexts) {
            System.out.printf("\n%s\n", text.getText());
        }
    }
}
