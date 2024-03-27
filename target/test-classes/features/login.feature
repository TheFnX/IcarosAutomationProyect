
Feature: CP02 - Validar incio de sesion


      Scenario: 1 - Validar con credenciales correctas
        Given el usuario navega al login
        When el usuario ingresa credenciales validas
        Then el usuario navega a la pagina de su cuenta


      Scenario: 2 - Validar con credenciales incorrectas
        Given el usuario navega al login
        When el usuario ingresa credenciales invalidas
        Then se muestra un mensaje de error