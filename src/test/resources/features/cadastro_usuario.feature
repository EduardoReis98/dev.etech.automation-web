#language: pt
#enconding: UTF-8
#author: Eduardo Reis
#date: 28/06/2021
#version: 1.0

  @smoke_test @teste_cadastro_usuario
  Funcionalidade: Cadastro
    Com essa funcionalidade iremos conseguir realizar
    o cadastro de um novo usuario na plataforma

  Contexto: Entrar na tela de cadastro
  Dado estiver na tela de cadastro

  Cenario: Validar o cadastro na aplicação
    Quando inserir os dados cadastrais
    Então deve visualizar na tela de login "Quero criar uma conta"



