import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
    @Test
    public void pesquisarGoogle() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();

        driver.get("https://google.com");

        driver.quit();
    }
}