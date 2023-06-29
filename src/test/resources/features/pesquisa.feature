#language: pt
#enconding: UTF-8
#author: Eduardo Reis
#date: 29/06/2021
#version: 1.0

@smoke_test @teste_pesquisa
Funcionalidade: uso do submenu
  Com essa funcionalidade iremos realizar
  a validação do uso do submenu

  Contexto: login realizado
    Dado estiver na tela de login
    E inserir os dados cadastrados do login
      | email                      | senha    |
      | eduardo.reis1509@gmail.com | teste123 |

  Esquema do Cenário: validar o uso do submenu
    Quando selecionar o <genero> no submenu
    Então deve visualizar o <genero-selecionado> do <genero>
    Quando inserir "vingadores" no campo de pesquisa do <genero>
    Então  deve visualizar uma imagem na tela da pesquisa

    Exemplos:
      | genero   | genero-selecionado |
      | "Home"   | "Filmes"           |
      | "Filmes" | "Todos os Filmes"  |
      | "Series" | "Todos as Séries"  |