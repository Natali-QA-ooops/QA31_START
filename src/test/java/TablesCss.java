import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TablesCss {
    WebDriver wd;

    @BeforeMethod
    public void creCond(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void tableTest(){
        //найти таблицу
        wd.findElement(By.cssSelector("table"));

        // tr9 - one element
        wd.findElement(By.cssSelector("tr:last-child"));

        //Maria Anders - one element
        wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));

        // last column  -all elements
        wd.findElements(By.cssSelector("td:last-child"));

        // th elements
        wd.findElements(By.cssSelector("th"));

        //Centro comercial Moctezuma	Francisco Chang	Mexico -  one element
        wd.findElement(By.cssSelector("tr:nth-child(4)"));

        //	Giovanni Rovelli  = one element
        wd.findElement(By.cssSelector("tr:last-child td:nth-child(2)"));

        // найти все элементы первой колонки -   // first column - all element
        wd.findElements(By.cssSelector("td:first-child"));

    }
}
