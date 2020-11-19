package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class CarritoPage extends util {

    @FindBy(xpath = "//*[@class='col-lg-8']//child::h2") private WebElement lbltitulo;
    @FindBy(xpath = "//*[@class='table-responsive']//child::td[2]") private WebElement lblProducto;

    public CarritoPage() {
        PageFactory.initElements(driver,this);
    }

    public boolean validarTitulo(){
        wait.until(ExpectedConditions.visibilityOf(lbltitulo));
        if (lbltitulo.getText().equals("Products")){
            return true;
        } else {
            return false;
        }
    }

    public boolean validarProducto(String producto){
        wait.until(ExpectedConditions.visibilityOf(lblProducto));
        if (lblProducto.getText().equals(producto)){
            return true;
        } else {
            return false;
        }
    }
}
