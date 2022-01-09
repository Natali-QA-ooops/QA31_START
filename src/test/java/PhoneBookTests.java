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
    public void loginCss(){
        WebElement inputEmail = wd.findElement(By.cssSelector("input:first-child"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("Tomy123456@mail.com");

        WebElement inputPass = wd.findElement(By.cssSelector("input:nth-child(2)"));
        inputPass.click();
        inputPass.clear();
        inputPass.sendKeys("Qq123666$45");

        WebElement buttonLog = wd.findElement(By.cssSelector("button:nth-child(4)"));
        buttonLog.click();
    }

    @Test
    public void loginXPath(){
        WebElement inputEmail = wd.findElement(By.xpath("//input[1]"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("Tomy123456@mail.com");

        WebElement inputPass = wd.findElement(By.xpath("//input[2]"));
        inputPass.click();
        inputPass.clear();
        inputPass.sendKeys("Qq123666$45");

        WebElement buttonLog = wd.findElement(By.xpath("//button[1]"));
        buttonLog.click();
    }

    @Test
    public void registrationXpath(){
        WebElement inputEmail = wd.findElement(By.xpath("//input[1]"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("Momzy123456@mail.com");

        WebElement inputPass = wd.findElement(By.xpath("//input[2]"));
        inputPass.click();
        inputPass.clear();
        inputPass.sendKeys("Yy123666$45");

        WebElement buttonReg = wd.findElement(By.xpath("//button[last()]"));
        buttonReg.click();
    }

    @Test
    public void registrationCss(){
        WebElement inputEmail = wd.findElement(By.cssSelector("input:first-child"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("Rose123@mail.com");

        WebElement inputPass = wd.findElement(By.cssSelector("input:nth-child(2)"));
        inputPass.click();
        inputPass.clear();
        inputPass.sendKeys("Mm123666$48");

        WebElement buttonReg = wd.findElement(By.cssSelector("button:last-child"));
        buttonReg.click();
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
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath("//a"));
        el.click();
        el.clear();
        el.sendKeys("Hello");

       List <WebElement> list = wd.findElements(By.tagName("a"));

       WebElement elId = wd.findElement(By.id("root"));
       wd.findElement(By.cssSelector("#root"));
       wd.findElement(By.xpath("//*[@id='root']"));

       WebElement elClass = wd.findElement(By.className("container"));
       wd.findElement(By.cssSelector(".container"));
       wd.findElement(By.xpath("//*[@class='container']"));

       WebElement elName = wd.findElement(By.name("nameEx"));
       wd.findElement(By.cssSelector("[name ='nameEx']"));
       wd.findElement(By.xpath("//*[@name = 'nameEx']"));

       WebElement elLink = wd.findElement(By.linkText("HOME"));
       WebElement elLink1 = wd.findElement(By.partialLinkText("HO"));

       wd.findElement(By.cssSelector("[href = '/home']"));
       wd.findElement(By.xpath("//*[@href = '/home']"));

       wd.findElement(By.cssSelector("a[href = '/home']"));
       wd.findElement(By.xpath("//a[@href = '/home']"));

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
