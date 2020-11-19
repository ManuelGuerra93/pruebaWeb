Feature: Login y LogOut de usuario
  Como usuario necesito poder Loguearme y desloguearme de la web

  @HappyPath @Hoy
  Scenario Outline: Loguin y logout exitoso
    Given valido que la web este operativa
    When hago clic en la opción Log in de la pantalla principal
    Then se muestra la ventana "Log in"
    And escribo el usuario "<usuario>" en la ventana Log in
    And escribo el password "<password>" en la ventana Log in
    And hago clic en el botón Log in en la ventana Log in
    Then se muestra "Welcome <usuario>" en la pantalla principal
    And hago clic en la opción Log out en la pantalla principal
    Then se muestra la pantalla principal

    Examples:
      | usuario | password |
      | man123  | 123      |