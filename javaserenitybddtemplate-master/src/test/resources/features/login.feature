Feature: Login

  Scenario: Efetuar login com sucesso

    Given informo o usuario 'erick123'
    And informo a senha '1324656'
    When acessar o sistema
    Then o usuário deve ser autenticado com sucesso
