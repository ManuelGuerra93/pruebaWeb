@Todo
Feature: Registro de Usuario
  Como usuario necesito poder registrarme

  @Registro
  Scenario Outline: Registro exitoso
    Given valido que la web este operativa
    When hago clic en la opción Sign up de la pantalla principal
    Then se muestra la ventana "Sign up"
    And escribo el usuario "<usuario>" en la ventana Sign up
    And escribo el password "<password>" en la ventana Sign up
    And hago clic en el botón Sign up en la ventana Sign up
    Then se muestra popUp con el mensaje "<mensaje>"
    And hago clic en el botón Aceptar
    Then se muestra la pantalla principal

    Examples:
      | usuario | password | mensaje             |
      | man100  | 123      | Sign up successful. |