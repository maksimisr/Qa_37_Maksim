import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork {
    WebDriver wd;
    @Test
    public void start(){
        wd= new ChromeDriver();
        wd.get("https://www.google.az/");
        wd.close();
    }
@Test
    public void succesRegistr(){

    }
    @Test
    public void unsuccsesRegistr(){

    }
    @Test
    public void succsesLogin(){

    }
@Test
    public void unsuccsesLogin(){

    }
}
