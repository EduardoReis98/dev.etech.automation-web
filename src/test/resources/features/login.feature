#language: pt
#enconding: UTF-8
#author: Eduardo Reis
#date: 28/06/2021
#version: 1.0

  @smoke_test @teste_login
  Funcionalidade: login
    Com essa funcionalidade iremos conseguir realizar
    o login de um usuario já cadastrado na plataforma

  Contexto: Entrar na tela de login
    Dado estiver na tela de login

  Cenário: Validar o login na aplicação
    Quando inserir os dados cadastrados do login
      | email                      | senha    |
      | eduardo.reis1509@gmail.com | teste123 |
    Então deve visualizar o nome do login "Eduardo Reis Da Silva"