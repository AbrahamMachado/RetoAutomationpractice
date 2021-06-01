
@tag
Feature: HU-001 El usuario desea buscar
en la pagina de AutomationPractice una
lista de 5 productos

  @tag1
  Scenario: Buscar los diferentes productos en la pagina AutomationPractice exitosamente
    Given Se ubica en la pagina AutomationPractice
    When busco los productos registrados en el excel
    Then se valida que el nombre seleccionado en la pagina concuerde con el del archivo excel
