import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstLesson {

    WebDriver wd;

    @BeforeMethod
    public void preCond(){
        //open www
        //open login form
        //fill login
        //submit login form
    }

     @Test
    public void testStart(){
         //open form new contact
         //fill form
         // submit form
    }
    @Test
    public void testSecond(){
        //open form new contact
        //fill form with wrong name format
        // submit form
}
    @AfterMethod
    public void postCond(){
        //logout
    }
}
