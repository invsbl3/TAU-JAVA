package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver oasis;

    By slider = By.xpath("//div[@class='sliderContainer']/input");
    By sliderValue = By.id("range");


    public HorizontalSliderPage(WebDriver driver) {
        this.oasis = driver;
    }

    public void slideAway(double desired) {
        double value = Integer.parseInt(oasis.findElement(sliderValue).getText());

        desired = insideSliderRange(desired);

        int iter = 0;
        int maxIter = 10;
        while (value != desired || iter < maxIter) {
            value = Double.parseDouble(oasis.findElement(sliderValue).getText());
            if (value < desired) {
                oasis.findElement(slider).sendKeys(Keys.RIGHT);
            }
            if (value > desired) {
                oasis.findElement(slider).sendKeys(Keys.LEFT);
            }
            iter++;
        }
        System.out.println("Slider changed to:" + value);
    }

    public double insideSliderRange(double desired) {
        double max = Double.parseDouble(oasis.findElements(slider).getFirst().getAttribute("max"));

        double min = Double.parseDouble(oasis.findElements(slider).getFirst().getAttribute("min"));

        double value = Math.max(desired, min);
        value = Math.min(value, max);
        return value;
    }

}
