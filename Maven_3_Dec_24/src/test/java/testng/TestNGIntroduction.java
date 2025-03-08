package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGIntroduction {

    public static WebDriver driver;

    @BeforeMethod
    public void preRequisite(){
        driver = new ChromeDriver();
    }

    @Test
    public void EdsoServices(){
        driver.get("https://edso.in/");
        driver.close();
    }

    @Test
    public void tataConsultancyServices(){
        driver.get("https://tcs.com/");
        driver.close();
    }

    @AfterMethod
    public void closedBrowser(){
        driver.close();
    }
}
