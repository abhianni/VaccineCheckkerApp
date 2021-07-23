import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.ws.WebServiceFeature;

public class CoWinScheduer {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://selfregistration.cowin.gov.in/dashboard");
        for(int i = 2;i<12 ; i=i+2)
        {
            if(null!=driver.findElement(By.xpath("//*[@id=\"mat-checkbox-"+i+"\"]")))
            {
                WebElement vaccinator = driver.findElement(By.xpath("//*[@id=\"mat-checkbox-" + i + "\"]"));
                vaccinator.click();
            }
        }
        driver.findElement(By.xpath("//*[text=\" Schedule Now \"]")).click();
        try {
            driver.wait(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
