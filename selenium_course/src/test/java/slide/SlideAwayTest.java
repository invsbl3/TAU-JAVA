package slide;

import base.BaseTest;
import org.testng.annotations.Test;

public class SlideAwayTest extends BaseTest {
    @Test
    public void slideAway() {
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        int maxIter = 10;
        for (int i = 0; i < maxIter; i++) {
            double tellMeWhatYouGot = Math.round(Math.random() * 10) / 2;
            horizontalSliderPage.slideAway(tellMeWhatYouGot);
        }
    }
}
