import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
    @Test
    public void pesquisarGoogle() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();

        driver.get("http://sistema.novagne.com.br/novagne/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]/form/table/tbody/tr[1]/td/font/font/input[1]"));
        element.sendKeys("gabriel");
    }
}