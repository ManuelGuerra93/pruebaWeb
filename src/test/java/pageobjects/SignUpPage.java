package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class SignUpPage extends util {
    @FindBy(xpath = "//*[@class='modal fade show']//child::h5") private WebElement lblTitulo;
    @FindBy(xpath = "//*[@class='modal fade show']//child::input[@id='sign-username']") private WebElement txtUsuario;
    @FindBy(xpath = "//*[@class='modal fade show']//child::input[@id='sign-password']") private WebElement txtPassword;
    @FindBy(xpath = "//*[@class='modal fade show']//child::button[1]") private WebElement btnClose;
    @FindBy(xpath = "//*[@class='modal fade show']//child::button[2]") private WebElement btnSignUp;

    public SignUpPage() {
        PageFactory.initElements(driver,this);
    }

    public boolean validarTitulo(String titulo){
        wait.until(ExpectedConditions.visibilityOf(lblTitulo));
        if (titulo.equals(lblTitulo.getText())){
            return true;
        } else {
            return false;
        }
    }

    public void escribirUsuario(String usuario){
        txtUsuario.sendKeys(usuario);
    }

    public void escribirPassword(String password){
        txtPassword.sendKeys(password);
    }

    public void clicClose(){
        btnClose.click();
    }

    public void clicSignUp(){
        btnSignUp.click();
    }


}
