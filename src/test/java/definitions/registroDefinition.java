package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.MenuPage;
import pageobjects.SignUpPage;

public class registroDefinition {
    MenuPage menu;
    SignUpPage signup;

    public registroDefinition() {
        menu = new MenuPage();
        signup = new SignUpPage();
    }

    @Given("valido que la web este operativa")
    public void validoQueLaWebEsteOperativa() {
        hooks.driver.get("https://www.demoblaze.com/index.html");
    }

    @When("hago clic en la opción Sign up de la pantalla principal")
    public void hagoClicEnLaOpciónSignUpDeLaPantallaPrincipal() {
        menu.clicSignUp();
    }

    @Then("se muestra la ventana {string}")
    public void seMuestraLaVentana(String titulo) {
        Assert.assertEquals("El título correcto es: "+titulo,true,signup.validarTitulo(titulo));
    }

    @And("escribo el usuario {string} en la ventana Sign up")
    public void escriboElUsuarioEnLaVentanaSignUp(String usuario) {
        signup.escribirUsuario(usuario);
    }

    @And("escribo el password {string} en la ventana Sign up")
    public void escriboElPasswordEnLaVentanaSignUp(String password) {
        signup.escribirPassword(password);
    }

    @And("hago clic en el botón Sign up en la ventana Sign up")
    public void hagoClicEnElBotónSignUpEnLaVentanaSignUp() {
        signup.clicSignUp();
    }

    @Then("se muestra popUp con el mensaje {string}")
    public void seMuestraPopUpConElMensaje(String mensaje) {
        Assert.assertEquals("El mensaje correcto es: "+mensaje,true,signup.validarPopUp(mensaje));
    }

    @And("hago clic en el botón Aceptar")
    public void hagoClicEnElBotónAceptar() {
        signup.clicAceptarPopUp();
    }

    @Then("se muestra la pantalla principal")
    public void seMuestraLaPantallaPrincipal() {
        menu.visualizarLogo();
    }
}
