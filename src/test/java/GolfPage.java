import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GolfPage {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gsena\\Downloads\\RapsodoSC\\RapsodoSC\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String title =  "Golf Swing Analyzer | Improve Your Swing | Rapsodo";
        driver.get( "https://rapsodo.com");

        driver.findElement(By.xpath("//*[@class='Item MainMenuHover' and contains(., 'GOLF')]")).click();
        driver.getTitle().equals(title);
        System.out.println(driver.getTitle());


        driver.quit();

    }
}