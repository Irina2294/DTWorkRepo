import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class SeleniumW12D5WebDriverComAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        String title= driver.getTitle();
        System.out.println("the current title of the page is : " +title);
        driver.navigate().to("https://www.syntaxprojects.com/");
        String title1= driver.getTitle();

    }
}
