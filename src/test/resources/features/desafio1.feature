#language: pt
#encoding: utf-8
#autor: Leonardo Nogueira
#Desafio: 1  
 
Funcionalidade:  Acessar Aplicacao adicionar novo cliente para Bootstrap

Contexto: 
@InluirCliente
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
   Entao verifico se vai apresentar a mensagem "Your data has been successfully stored into the database. Edit Customer or Go back to list"