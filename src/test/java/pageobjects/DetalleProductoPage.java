package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class DetalleProductoPage extends util {

    @FindBy(xpath = "//*[@class='row']//child::h2") private WebElement lblNombreProducto;
    @FindBy(xpath = "//*[@class='row']//child::a[contains(text(),'Add to cart')]") private WebElement btnAgregar;

    public DetalleProductoPage() {
        PageFactory.initElements(driver,this);
    }

    public void validarPantallaDetalleProducto(){
        wait.until(ExpectedConditions.visibilityOf(lblNombreProducto));
        if (lblNombreProducto.isDisplayed()){
            System.out.println("Estas viendo el detalle del producto "+lblNombreProducto.getText());
        } else {
            System.out.println("Ventana incorrecta");
        }
    }

    public void clicAgregarProducto(){
        wait.until(ExpectedConditions.elementToBeClickable(btnAgregar));
        btnAgregar.click();
    }
}
