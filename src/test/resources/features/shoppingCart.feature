Feature: CP05 - Validar Producto Seleccionado

    Scenario: Agregar un producto al carrito de compras
      Given que el usuario ingresa a la pagina de inicio
      And el usuario se loguea en la aplicacion
      When se agrega un producto a carrito
      Then se valida que el producto se agregado
