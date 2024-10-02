import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class KeysClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/keypress.php");
        // find the text box
        WebElement inputBox=driver.findElement(By.xpath("//input[@type='text']"));
        inputBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        inputBox.sendKeys(Keys.TAB);



    }
}
