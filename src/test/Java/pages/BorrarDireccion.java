package pages;

import org.openqa.selenium.WebDriver;

public class BorrarDireccion extends BasePage{
    public BorrarDireccion() {
        super(driver);
    }

    public void DeleteAdress() throws InterruptedException {
        //eliminar direccion guardada
        clickElemnt("(//a[@class='account'])[1]");
        clickElemnt("//a[@class='inactive'][normalize-space()='Addresses']");
        clickElemnt("//input[@value='Delete']");

        driver.switchTo().alert().accept();
        Thread.sleep(5000);
    }
}
