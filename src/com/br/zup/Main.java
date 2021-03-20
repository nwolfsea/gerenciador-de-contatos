package com.br.zup;
//Cadastro de contatos

//Os alunos devem criar um programa para gerenciar uma lista de contatos,
// cada contato tem nome, telefone e email.
// Nenhum programa final deve ser aplicado a uma lista de contatos cadastrados

import java.util.Scanner;

//Entrega mínima
//
//sistema permite, via terminal, inserir pelo menos 1 contato em uma lista e retorno o mesmo na tela
public class Main {

    public static void main(String[] args) {
        IO entradaESaida = new IO();
        entradaESaida.pedirUmDado("Digite um nome").nextLine();
        entradaESaida.pedirUmDado("Digite um email").nextLine();
        entradaESaida.pedirUmDado("Digite um telefone").nextInt();
    }
}
