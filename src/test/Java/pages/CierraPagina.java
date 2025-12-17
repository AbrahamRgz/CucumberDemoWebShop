package pages;

public class CierraPagina extends BasePage {

    public CierraPagina() {
        super(driver);
    }

    public void ClosePage(){
        CloseBroser();
    }
    public  void CloseNavegador(){
        CierraTodoElNavegador();
    }
}
