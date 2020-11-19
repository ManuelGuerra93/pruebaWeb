package support;

import definitions.hooks;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class util extends hooks {
    public static WebDriverWait wait;

    public util() {
        wait = new WebDriverWait(driver,10);
    }

    public boolean validarPopUp(String mensaje){
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alerta = driver.switchTo().alert();
        if (mensaje.equals(alerta.getText())) {
            return true;
        } else {
            return false;
        }
    }

    public void clicAceptarPopUp(){
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alerta = driver.switchTo().alert();
        alerta.accept();
    }
}
