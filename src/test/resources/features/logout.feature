#language: pt
#enconding: UTF-8
#author: Eduardo Reis
#date: 29/06/2021
#version: 1.0

@smoke_test @teste_logout
Funcionalidade: logout
  Com essa funcionalidade iremos realizar
  a validação do uso do logout

  Contexto: login realizado
    Dado estiver na tela de login
    E inserir os dados cadastrados do login
      | email                      | senha    |
      | eduardo.reis1509@gmail.com | teste123 |

  Cenário: Validar o logout da aplicação
    Quando selecionar a opção sair
    Então deve visualizar a tela de login
