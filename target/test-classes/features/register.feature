Feature: CP04- Validar creacion de nueva cuenta de usuario

  Scenario: 1 - Validar Registro exitoso
    Given el usuario navega a registro
    When completa el formulario con sus datos
    Then deberia llevar a la pagina de la cuenta

  Scenario: 2 - Registro fallido
    Given el usuario navega a registro
    When deja los campos obligatorio vacios
    Then deberia ver un mensaje de error
