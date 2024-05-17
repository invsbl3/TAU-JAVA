package data_driven;

import org.testng.annotations.DataProvider;

public class DataForTest {

    @DataProvider
    public static Object[][] loginDataPractice() {
        int dataSize = 10;
        Object[][] data = new Object[dataSize][2];

        String correctUser = "student";
        String correctPassword = "Password123";

        for (int i = 0; i < data.length; i++) {
            data[i][0] = Math.round(Math.random()) == 0 ? correctUser : "------------";
            data[i][1] = Math.round(Math.random()) != 0 ? correctPassword : "------------";
        }
        return data;
    }

    @DataProvider
    public static Object[][] loginData() {
        int dataSize = 100;
        Object[][] data = new Object[dataSize][3];

        for (int i = 0; i < data.length; i++) {
            data[i][0] = "email" + i + "@mail.com";
            data[i][1] = "userName" + i;
            data[i][2] = Math.round(Math.random()) != 0;
        }
        return data;
    }


}
