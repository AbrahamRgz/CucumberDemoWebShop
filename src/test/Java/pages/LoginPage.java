package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage{



    public LoginPage() {
        super(driver);
    }

    public void LoginDemoWeb(){
        navigateTo("https://demowebshop.tricentis.com/");
        MaxiWindow();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2-ingresar el email, pass y dar click en el boton log in
        String email= "harcorrs@gmail.com";
        String pass ="jamon157";
        clickElemnt("//a[@class='ico-login']");
        Write("//input[@id='Email']",email);
        Write("//input[@id='Password']",pass);
        clickElemnt("//input[@class='button-1 login-button']");
    }
}
