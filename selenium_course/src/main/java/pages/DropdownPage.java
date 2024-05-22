package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.addAll;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropDown(String option) {
        findDropdownElement().selectByVisibleText(option);
    }

    public ArrayList<String> getSelectedOptions() {
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();

        ArrayList<String> selectedOptions = new ArrayList<>();
        selectedOptions.addAll(selectedElements.stream().map(e -> e.getText()).collect(Collectors.toList()));
        return selectedOptions;
    }

    private Select findDropdownElement() {
        return new Select(driver.findElement(dropdown));
    }

    public void changeDropDownToMultipleWithJavaScript() {
        WebElement dropdownElement = driver.findElement(dropdown);
        String javaScript = "document.querySelector('#dropdown').setAttribute('multiple', '')";
        //String javaScript = "arguments[0].setAttribute('multiple','')";
        ((JavascriptExecutor) driver).executeScript(javaScript, dropdownElement);
    }

}
