Feature: Carrito de compra
  Como usuario necesito poder agregar productos a mis carrito y en otra sección poder visualiza el producto
  que fue agregado

  @HappyPath
  Scenario Outline: Agregar productos al carrito
    Given valido que la web este operativa
    When hago clic en la opción Log in de la pantalla principal
    Then se muestra la ventana "Log in"
    And escribo el usuario "<usuario>" en la ventana Log in
    And escribo el password "<password>" en la ventana Log in
    And hago clic en el botón Log in en la ventana Log in
    Then se muestra "Welcome <usuario>" en la pantalla principal
    And hago clic en la categoria "<categoria>" en la pantalla principal
    And hago clic en el producto "<nombreProducto>" en la pantalla principal
    Then se muestra la pantalla Detalle del Producto
    And hago clic en el botón Add to cart en la pantalla Detalle del Producto
    Then se muestra popUp con el mensaje "<mensaje>"
    And hago clic en el botón Aceptar
    And hago clic en la opción Cart en la pantalla Detalle del Producto
    Then se muestra la pantalla Carrito de compra
    And valido el producto agregado "<nombreProducto>" en la pantalla Carrito de compra

    Examples:
      | usuario | password | categoria | nombreProducto | mensaje        |
      | man123  | 123      | Laptops   | Sony vaio i7   | Product added. |