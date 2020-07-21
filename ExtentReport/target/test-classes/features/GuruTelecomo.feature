@tarea2

Feature: Flujo Guru
  Scenario: Test
    Given accedo a la pagina web de Guru
    When selecciono Add customer
    And selecciono el tipo de antecedente "Done"
    And ingreso mi nombre "York" y apellido "Correa"
    And ingreso mi email "test666@gmail.com" y mi direccion "Avenida Tomas Valle"
    And finalmente ingreso mi numero de celular "987451447" y envío
    And se genera un customer id el cual sera guardado y regresamos a Home
    And ingreso a Add Tariff Plan to Customer e ingreso el customer id generado para ser enviado
    And valido el mensaje con efecto agrego el Tariff Plan to Customer
    Then nos mostrara un mensaje de exito "Congratulation Tariff Plan assigned"