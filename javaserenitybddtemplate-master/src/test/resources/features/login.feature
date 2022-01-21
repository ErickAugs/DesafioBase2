Feature: Login

  Background:
    Given Esteja logado no Mantis

  @RealizarLogin
  Scenario: Efetuar login com sucesso

    And informo o usuario 'administrador'
    And informo a senha '123456'
    When acessar o sistema
    Then o usuário deve ser autenticado com sucesso
