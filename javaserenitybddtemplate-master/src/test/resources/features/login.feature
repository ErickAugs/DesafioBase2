Feature: Login

  Background:
    Given Esteja logado no Mantis

  @RealizarLogin
  Scenario: Efetuar login com sucesso
    Then o usuário deve ser autenticado com sucesso
