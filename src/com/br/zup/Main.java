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
//Entrega média
//
//O sistema permite adicionar mais de um contato e apresenta
// um menu para decidir se deve adicionar mais usuários ou encerrar o programa

//Entrega máxima
//
//O sistema permite excluir um contato usando como parâmetro o e-mail
// e não permite inserir um contato com o e-mail repetido.
public class Main {

    public static void main(String[] args) {
        List<String> cadastroControle = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite \n1 para cadastrar \n2 para pesquisar lista\n3 para excluir contato \n4 para sair");
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

            } else if (resposta == 2) {
                System.out.println("Digite o nome do contato, para retorna-lo ");
                String nome = entradaDeDados().nextLine();
                System.out.println(cadastroControle + nome);}

                else if (resposta == 3) {
                    System.out.println("Digite o email de um contato para exlui-lo ");
                    String email = entradaDeDados().nextLine();
                if (email) {
                    email.remove;
                    System.out.println("Contato removido.");
                } else {
                    System.out.println("O e-mail do contato não foi achado na lista.");
                   

                } else if (resposta == 4) {
                    continuar = false;
                    System.out.println("Adeus");
                }

            }

        }


    }

    public static Scanner entradaDeDados() {
        return new Scanner(System.in);
    }
}


