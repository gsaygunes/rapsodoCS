import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class MlmPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gsena\\Downloads\\RapsodoSC\\RapsodoSC\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get( "https://rapsodo.com");
        driver.findElement(By.xpath("//*[@class='Item MainMenuHover' and contains(., 'GOLF')]")).click();
        driver.get("https://rapsodo.com/golf/mlm/");

        String description = driver.findElement(By.xpath("//*[@class='Description']")).getText();
        assertEquals(description, "0 items - $0.00");

        driver.quit();
    }
}