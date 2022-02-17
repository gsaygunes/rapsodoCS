import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;
import static org.junit.Assert.assertEquals;

public class ShopPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gsena\\Downloads\\RapsodoSC\\RapsodoSC\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String URL =  "https://rapsodo.com/golf/mlm/";
        String cartURL = "https://rapsodo.com/cart/";

        driver.get("https://rapsodo.com/golf/mlm/");
        driver.findElement(By.xpath("//*[@class='medium cli-plugin-button cli-plugin-main-button cookie_action_close_header cli_action_button']")).click();
        driver.findElement(By.xpath("//*[@class='ShopNow Desktop float-right']")).click();
        driver.getCurrentUrl().equals(URL);

        sleep(5000);
        driver.findElement(By.xpath("//*[@class='woocommerce-loop-product__title' and contains(., 'Mobile Launch')]")).click();
        sleep(5000);
        driver.findElement(By.xpath("//*[@class='plus']")).click();
        driver.findElement(By.xpath("//*[@class='single_add_to_cart_button button alt']")).click();

        driver.getCurrentUrl().equals(cartURL);

        sleep(5000);
        driver.findElement(By.xpath("//*[@class='button' and contains(., 'View Cart')]")).click();

        String price = driver.findElement(By.xpath("(//*[@class='woocommerce-Price-amount amount'])[3]")).getText();
        assertEquals(price, "$999.98");

        driver.findElement(By.xpath("//*[@id='coupon_code']")).sendKeys("GOLFTHEBEST");
        driver.findElement(By.xpath("//*[@class='button' and contains(.,'Apply coupon')]")).click();
        sleep(10000);

        String error = driver.findElement(By.xpath("//*[@class='woocommerce-error']")).getText();
        assertEquals(error, "Coupon \"golfthebest\" does not exist!");

        driver.quit();


    }


}