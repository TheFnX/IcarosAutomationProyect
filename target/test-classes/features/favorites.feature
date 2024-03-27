Feature: CP03 - Favoritos
  Scenario: Agregar producto a favoritos
    Given que el usuario ingresa a la pagina de inicio
    And el usuario se loguea en la aplicacion
    #Given el usuario se encuentra logueado
    When se agrega un producto a favoritos
    Then se valida que el producto sea agregado correctamente