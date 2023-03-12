import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Homework2 {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
       wd= new ChromeDriver();
       wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){
        //by name
        WebElement byn= wd.findElement(By.tagName("meta"));
        WebElement byn1=wd.findElement(By.cssSelector("meta"));
        WebElement byn2=wd.findElement(By.xpath("//button"));


        //by class
        WebElement byc = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement byc1= wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement clas = wd.findElement(By.className("login_login__3EHKB"));
        WebElement class1= wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement class2= wd.findElement(By.xpath("//*[@class='container']"));

        //by id
        WebElement byi= wd.findElement(By.id("root"));
        WebElement byi1= wd.findElement(By.cssSelector("#root"));

        //
        WebElement name= wd.findElement(By.cssSelector("[name]"));
        List<WebElement> list = wd.findElements(By.cssSelector("[name]"));
        WebElement type = wd.findElement(By.cssSelector("[type='submit']"));

        //
        WebElement name2= wd.findElement(By.cssSelector("[name$='il']"));
        WebElement name3= wd.findElement(By.cssSelector("[name*='il']"));
        WebElement name4= wd.findElement(By.cssSelector("[name^='il']"));
        WebElement name5= wd.findElement(By.xpath("//input[starts-with(@placeholder,'Pass')]"));

    }
}
