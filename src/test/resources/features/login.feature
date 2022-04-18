Feature: Inicio de sesion

  Como usuario
  Yo quiero una opcion de inicio de sesion
  Para poder ingresar con mis credenciales a la app

  Scenario: Inicio de sesion exitoso
    Given el esta en la pantalla de inicio de sesion
    When el ingresa el usuario "standard_user" y el password "secret_sauce"
    Then el deberia poder ingresar a la aplicacion
    And el agrega productos al carro de compras
    And el deberia poder validar que se agregaron
    And el cierra cesion en la aplicacion
