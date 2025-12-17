Feature: Flujo completo de DemoWebShop
        Ir a demo web shop y hacer login
        En a appareal y shoes, seleccionar 5 productos
        Completar la compra y cerrar sesion

  Scenario: Compra End to End
    Given Ir a DemoWebShop e iniciar sesion
    When completar compra y validar datos
    Then Compra exitosa y cierra la pagina actual


  Scenario: Borrar Direccion
    Given Ir a DemoWebShop e iniciar sesion
    When Borrar datos de direccion
    Then Compra exitosa y cierra pagina Web