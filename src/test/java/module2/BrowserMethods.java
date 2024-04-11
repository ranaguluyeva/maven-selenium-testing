package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        // usually when we start the session of driver we want to maximize it
        driver.manage().window().maximize();
        String url="https://www.bestbuy.com/";
        //we have two similar ways to navigate to a web application
        //option 1; using get() method
        //driver.get(url);
        // option 2; using navigate().to();
        driver.navigate().to(url);

        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        // let's navigate tto another web application
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.quit();
    }
}
