package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class MenuPage extends util {

    @FindBy(xpath = "//*[contains(text(),'Home')]") private WebElement lnkHome;
    @FindBy(xpath = "//*[@class='navbar-nav ml-auto']//child::li[4]") private WebElement lnkCart;
    @FindBy(id = "login2") private WebElement lnkLogIn;
    @FindBy(id = "signin2") private WebElement lnkSingUp;
    @FindBy(xpath = "//*[@class='navbar-collapse']//child::a[@id='nameofuser']") private WebElement lblNombreUsuario;
    @FindBy(id = "narvbarx") private WebElement logo;
    @FindBy(xpath = "//*[@class='navbar-collapse']//child::a[@id='logout2']") private WebElement lnkLogOut;
    @FindBy(xpath = "//*[@class='list-group']//child::a[3]") private WebElement lnkLaptops;
    @FindBy(xpath = "//*[@class='list-group']//child::a[2]") private WebElement lnkPhone;
    @FindBy(xpath = "//*[@class='list-group']//child::a[4]") private WebElement lnkMonitors;

    public MenuPage() {
        PageFactory.initElements(driver,this);
    }

    public boolean visualizarLogo(){
        wait.until(ExpectedConditions.elementToBeClickable(logo));
        if (logo.isDisplayed()){
            return true;
        } else {
            return false;
        }
    }

    public void clickHome(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkHome));
        lnkHome.click();
    }

    public void clicCart(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkCart));
        lnkCart.click();
    }

    public void clicLogIn(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkLogIn));
        lnkLogIn.click();
    }

    public void clicSignUp(){
        wait.until(ExpectedConditions.elementToBeClickable(lnkSingUp));
        lnkSingUp.click();
    }

    public boolean validarNombreUsuario(String usuario){
        wait.until(ExpectedConditions.visibilityOf(lblNombreUsuario));
        if (usuario.equals(lblNombreUsuario.getText())){
            return true;
        } else {
            return false;
        }
    }

    public void clicLogOut(){
        lnkLogOut.click();
    }

    public void clicCategoria(String categoria){
        if (categoria.equals("Phones")) {
            wait.until(ExpectedConditions.elementToBeClickable(lnkPhone));
            lnkPhone.click();
        } else if (categoria.equals("Laptops")) {
            wait.until(ExpectedConditions.elementToBeClickable(lnkLaptops));
            lnkLaptops.click();
        } else if (categoria.equals("Monitors")){
            wait.until(ExpectedConditions.elementToBeClickable(lnkMonitors));
            lnkMonitors.click();
        } else {
            System.out.println("Las categorias validas son: Phones, Laptops y Monitors");
        }
    }

    public void clicProducto(String prod) throws InterruptedException {
        Thread.sleep(1000);
        WebElement producto = driver.findElement(By.xpath("//*[@id='tbodyid']//child::a[contains(text(),'"+prod+"')]"));
        wait.until(ExpectedConditions.elementToBeClickable(producto));
        producto.click();
    }
}
