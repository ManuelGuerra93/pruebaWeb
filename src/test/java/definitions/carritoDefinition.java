package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobjects.CarritoPage;
import pageobjects.DetalleProductoPage;
import pageobjects.MenuPage;

public class carritoDefinition {
    MenuPage menu;
    DetalleProductoPage detalleProducto;
    CarritoPage carrito;

    public carritoDefinition() {
        menu = new MenuPage();
        detalleProducto = new DetalleProductoPage();
        carrito = new CarritoPage();
    }

    @And("hago clic en la categoria {string} en la pantalla principal")
    public void hagoClicEnLaCategoriaEnLaPantallaPrincipal(String categoria) {
        menu.clicCategoria(categoria);
    }

    @And("hago clic en el producto {string} en la pantalla principal")
    public void hagoClicEnElProductoEnLaPantallaPrincipal(String producto) throws InterruptedException {
        menu.clicProducto(producto);
    }

    @Then("se muestra la pantalla Detalle del Producto")
    public void seMuestraLaPantallaDetalleDelProducto() {
        detalleProducto.validarPantallaDetalleProducto();
    }

    @And("hago clic en el botón Add to cart en la pantalla Detalle del Producto")
    public void hagoClicEnElBotónAddToCartEnLaPantallaDetalleDelProducto() {
        detalleProducto.clicAgregarProducto();
    }

    @And("hago clic en la opción Cart en la pantalla Detalle del Producto")
    public void hagoClicEnElBotónCartEnLaPantallaDetalleDelProducto() {
        menu.clicCart();
    }

    @Then("se muestra la pantalla Carrito de compra")
    public void seMuestraLaPantallaCarritoDeCompra() {
        Assert.assertEquals("El titulo correcto es: Products",true,carrito.validarTitulo());
    }

    @And("valido el producto agregado {string} en la pantalla Carrito de compra")
    public void validoElProductoAgregadoEnLaPantallaCarritoDeCompra(String producto) {
        Assert.assertEquals("El producto listado es incorrecto",true,carrito.validarProducto(producto));
    }
}
