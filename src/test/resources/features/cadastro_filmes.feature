#language: pt
#enconding: UTF-8
#author: Eduardo Reis
#date: 28/06/2021
#version: 1.0

  @smoke_test @teste_cadastro_filmes
  Funcionalidade: Cadastrar filme
    Com essa funcionalidade iremos realizar
    O cadastro de novos filmes

  Contexto: login realizado
    Dado estiver na tela de login
    E inserir os dados cadastrados do login
      | email                      | senha    |
      | eduardo.reis1509@gmail.com | teste123 |

  Cenário: Validar cadastro de filme
    Quando inserir os dados do filme
    Então deve visualizar na tela "Filme criado com sucesso."