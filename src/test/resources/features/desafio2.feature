#language: pt
#encoding: utf-8
#autor: Leonardo Nogueira
#Desafio: 2  
 
Funcionalidade:  Acessar Aplicacao e deletar Bootstrap

Contexto: 
@DeletarCliente
Cenario: acessar Url
	 Dado que acessei o site do desafio
   E seleciono a versao do Bootstraper
   E clico no botao "Add Customer"
   E preencho Nome "Teste Sicredi"
   E preencho SobreNome "Teste"
   E preencho Contato do Primeiro nome "Leonardo"
   E preencho Telefone "51 9999-9999"
   E preencho primeiro endereco "Av Assis Brasil, 3970"
   E preencho Segundo endereco "Torre D"
   E preencho Cidade "Porto Alegre"
   E preencho Codigo Postal "91000-000"
   E preencho Estado "RS"
   E preencho Pais "Brasil"
   E preencho Limite de Credito "200"
   E Seleciono o empregador "Fixter"
   E clico no botao de Salvar
   E clico no link Go back to list
   E faco a pesquisa com o texto "Teste Sicredi" 
   E Clicar no checkbox abaixo da palavra Actions
   E clico no botao "Delete"
   E Valido a pergunta de exclusao 
   E clico no botao Delete do popup
   Entao verifico a mensagem "Your data has been successfully deleted from the database."