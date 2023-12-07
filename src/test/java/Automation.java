import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.Keys;

public class Automation {
    @Test
    public void pesquisarGoogle() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.kaggle.com/datasets");
        driver.manage().window().maximize();

        waitAndHandleException();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[2]/div[4]/div/div/div[1]/div/input"));
        element.sendKeys("nintendo 64 games");
        element.sendKeys(Keys.ENTER);

        waitAndHandleException();

        WebElement table = driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[2]/div[5]/div/div/div/ul/li[1]/div[1]/a/div[2]/div"));
        table.click();

        waitAndHandleException();

        List<WebElement> datasets = driver.findElements(By.cssSelector(".sc-cCYyox, .sc-cjERFW, .jxeAHX, .fWvmCS"));

        try (FileWriter writer = new FileWriter("output.txt", true)) {
            for (WebElement dataset : datasets) {
                String text = dataset.getText();
                /*System.out.println(text);*/
                writer.write(text + System.lineSeparator() + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public void waitAndHandleException() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}