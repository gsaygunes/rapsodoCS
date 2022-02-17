import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gsena\\Downloads\\RapsodoSC\\RapsodoSC\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String URL =  "https://rapsodo.com";

        driver.get( "https://rapsodo.com");
        driver.getCurrentUrl().equals(URL);

        System.out.println(driver.getTitle());


        driver.quit();
    }
}
