
@tag2
Feature:  Teste

  @Tag1
  Scenario Outline: Fazer pesquisa de video no youtube
    Given Que entro na url "<url>"
    And pesquiso "<pesquisa>" na barra de pesquisa
    When Clico no botão de confirmar a pesquisa
    And Clico no botão do canal
    Then Deverá aparecer os videos do canal "<resultado retornado>"

    Examples:
      | url                  | pesquisa                   |resultado retornado|
      | http://youtube.com   |Whinderson Nunes            |  Whinderson Nunes |

