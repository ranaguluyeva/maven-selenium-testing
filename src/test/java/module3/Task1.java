package module3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
driver.get("http://demo.guru99.com/test/newtours/");
        /*test dat*/
        String username ="test@mail.com";
        String password = "test";

        /* locate the elements for login form */
        WebElement userNameInput = driver.findElement(By.name("userName"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.name("submit"));

        /* Perform actions on these elements*/
        userNameInput.sendKeys(username);
        Thread.sleep(5000);
        passwordInput.sendKeys(password);
        Thread.sleep(5000);
        submitButton.click();
        Thread.sleep(5000);

        /* Interact with vacation link */

WebElement vacationsLink = driver.findElement(By.partialLinkText("Vacations"));
vacationsLink.click();
Thread.sleep(100);

/* Interact with register link */
        WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
        registerLink.click();
        Thread.sleep(100);

        /* Verify successfully landed on Register Page */
String expectedUrlPostFix = "/register.php";
        String actualUrl = driver.getCurrentUrl();

        // https://demo.guru99.com/test/newtours/register.php/success
        // contains -> true
        // /register.php

        if(actualUrl.endsWith(expectedUrlPostFix)){
            System.out.println("Registration Page Test: PASSED");
        } else {
            System.err.println("Registration Page Test: FAILED");
        }
        driver.quit();
    }
}

