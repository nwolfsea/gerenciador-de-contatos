package com.br.zup;
//Cadastro de contatos

//Os alunos devem criar um programa para gerenciar uma lista de contatos,
// cada contato tem nome, telefone e email.
// Nenhum programa final deve ser aplicado a uma lista de contatos cadastrados

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Entrega mínima
//
//sistema permite, via terminal, inserir pelo menos 1 contato em uma lista e retorno o mesmo na tela

//SE inserir contato
//Então retorna o mesmo na tela
public class Main {

    public static void main(String[] args) {
        List<String> cadastroControle = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite \n1 para cadastrar \n2 para pesquisar lista\n3 para sair");
            int resposta = entradaDeDados().nextInt();


            if (resposta == 1) {
                System.out.println("Digite o nome");
                String nome = entradaDeDados().nextLine();
                List<String> cadastro = new ArrayList<>();

                System.out.println("Digite o email");
                String email = entradaDeDados().nextLine();
                cadastro = new ArrayList<>();

                System.out.println("Digite o telefone");
                int telefone = entradaDeDados().nextInt();
                cadastro = new ArrayList<>();

            }
        }
    }


    public static Scanner entradaDeDados() {
        return new Scanner(System.in);
    }
}


