package module2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageInformation {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "http://dev-hrm.yoll.io/";
        driver.get(url);

        // Next we can get useful information about the web page we are currently interacting with
        String title = driver.getTitle();
        driver.quit();
    }
}
