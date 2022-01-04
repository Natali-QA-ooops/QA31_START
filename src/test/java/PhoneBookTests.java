import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
import java.util.List;

public class PhoneBookTests {
    WebDriver wd;
    @BeforeMethod
    public void openSite(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
      // wd.get(""); //without history
       wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login"); //with history ---> back forward refresh
    }

    @Test
    public void fillRegistrationForm(){
        List <WebElement> list = wd.findElements(By.tagName("input"));
        WebElement inputEmail = list.get(0);
        WebElement inputPass = list.get(1);

        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("Mamy183456@mail.com");

        inputPass.click();
        inputPass.clear();
        inputPass.sendKeys("Ww12345$");

        List <WebElement> buttonReg = wd.findElements(By.tagName("button"));
        WebElement reg = buttonReg.get(1);
        reg.click();
    }

    @Test
    public void phonebookStart(){
        WebElement el = wd.findElement(By.tagName("a"));
        el.click();
        el.clear();
        el.sendKeys("Hello");

       List <WebElement> list = wd.findElements(By.tagName("a"));

       WebElement elId = wd.findElement(By.id("root"));
       WebElement elClass = wd.findElement(By.className("container"));

       WebElement elLink = wd.findElement(By.linkText("HOME"));
       WebElement elLink1 = wd.findElement(By.partialLinkText("HO"));
    }

    @Test
    public void fillFormLogin(){

        List <WebElement> list = wd.findElements(By.tagName("input"));
        WebElement inputEmail = list.get(0);
        WebElement inputPass = list.get(1);

        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("Tomy123456@mail.com");

        inputPass.click();
        inputPass.clear();
        inputPass.sendKeys("Qq123666$45");

        WebElement buttonLog = wd.findElement(By.tagName("button"));
        buttonLog.click();
    }

    @AfterMethod
    public void close(){
       //wd.quit();  // all tabs
       // wd.close(); //focus wd
    }
}
