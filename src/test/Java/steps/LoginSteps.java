package steps;

import io.cucumber.java.en.*;
import pages.BorrarDireccion;
import pages.CierraPagina;
import pages.CompraCarrito;
import pages.LoginPage;



public class LoginSteps  {

        LoginPage loginPage = new LoginPage();
        CompraCarrito compra = new CompraCarrito();
        BorrarDireccion DeleteAdrees = new BorrarDireccion();
        CierraPagina CloseBrowser = new CierraPagina();


    @Given("Ir a DemoWebShop e iniciar sesion")
    public void LoginDemoWeb() {
     loginPage.LoginDemoWeb();
    }

    @When("completar compra y validar datos")
    public void CompraCarrito() throws InterruptedException {
    compra.CompraCarritoDemoWeb();
    }

    @When("Borrar datos de direccion")
    public void BorrarDireccion() throws InterruptedException {
    DeleteAdrees.DeleteAdress();
    }

    @Then("Compra exitosa y cierra la pagina actual")
    public void CierraPagina(){
        CloseBrowser.ClosePage();

    }

    @Then("Compra exitosa y cierra pagina Web")
    public void ClosePage() throws InterruptedException {
        CloseBrowser.CloseNavegador();
    }

}
