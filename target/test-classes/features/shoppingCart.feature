Feature: CP05 - Validar Producto Seleccionado

  Scenario: Agregar un producto al carrito de compras
    Given el usuario se loguea en la aplicacion
    When selecciona un producto
    And se agrega al carrito de compras
    Then se valida que el producto se encuentra en el carrito