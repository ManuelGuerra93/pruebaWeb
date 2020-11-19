package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.LogInPage;
import pageobjects.MenuPage;

import java.awt.*;

public class loginLogoutDefinition {
    MenuPage menu;
    LogInPage logIn;

    public loginLogoutDefinition() {
        menu = new MenuPage();
        logIn = new LogInPage();
    }

    @When("hago clic en la opción Log in de la pantalla principal")
    public void hagoClicEnLaOpciónLogInDeLaPantallaPrincipal() {
        menu.clicLogIn();
    }

    @And("escribo el usuario {string} en la ventana Log in")
    public void escriboElUsuarioEnLaVentanaLogIn(String usuario) {
        logIn.escribirUsuario(usuario);
    }

    @And("escribo el password {string} en la ventana Log in")
    public void escriboElPasswordEnLaVentanaLogIn(String password) {
        logIn.escribirPassword(password);
    }

    @And("hago clic en el botón Log in en la ventana Log in")
    public void hagoClicEnElBotónLogInEnLaVentanaLogIn() {
        logIn.clicLogIn();
    }

    @Then("se muestra {string} en la pantalla principal")
    public void seMuestraEnLaPantallaPrincipal(String usuario) {
        Assert.assertEquals("El nombre de usuario correcto es: "+usuario,true,menu.validarNombreUsuario(usuario));
    }

    @And("hago clic en la opción Log out en la pantalla principal")
    public void hagoClicEnLaOpciónLogOutEnLaPantallaPrincipal() {
        menu.clicLogOut();
    }
}
