package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTablesPractice {
    public static void main(String[] args) throws InterruptedException {
        // Create a web driver instance

        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();

        // navigate to the targeted web page
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);

        // Get the data  from product table
        // 2 row 2 cell
        // WebElement secondCellData = driver.findElement(By.xpath("//*[@id = 'productTable' ] /tbody/tr[2]/td[2]"));
        // Extract the content text from the element  - getText() - returns a string
        // String secondCellText = secondCellData.getText();
      //  System.out.println(" The data in the second row and second cell is: " + secondCellText);
        getDataByRowAndColumn(driver, 2,2);
        getDataByRowAndColumn(driver, 2,3);

        // get the data from the second column
        // We can make rresuable method for all columns
       // List<WebElement> columnData = driver.findElements(By.xpath("//*[@id = 'productTable' ] /tbody/tr/td[2]"));
       // for (WebElement eachElement : columnData){
          //  String eachCellData = eachElement.getText();
          //  System.out.println(eachCellData);}
        getDataByColumnNumber(driver,"2");

       driver.quit();
    }
    // If we want to find all texts in the cell so it is easy to create a method rather than every time write repetitive codes
    // The rule of static method: we cannot call directly any non static members, so we will do our method static
public static void getDataByColumnNumber(WebDriver driver, String columnNumber){
        String dynamicXpath = "//*[@id = 'productTable' ] /tbody/tr/td["+columnNumber+"]";
    List<WebElement> columnData = driver.findElements(By.xpath(dynamicXpath));
    for (WebElement eachElement : columnData){
     String eachCellData = eachElement.getText();
    System.out.println(eachCellData);
    }
}
    public static  void getDataByRowAndColumn(WebDriver driver, int row, int column){
        String dynamicXpath = "//*[@id = 'productTable' ] /tbody/tr["+ row +"]/td["+ column +"]";

    WebElement cellData = driver.findElement(By.xpath(dynamicXpath));

    String cellText = cellData.getText();
    System.out.println(" The data in the row "+row+" and "+column+" cell is: " + cellText);
}
}