package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet();
        Scanner read = new Scanner(System.in);
        String option;

        do {
            System.out.println("\n----- Menu -----");
            System.out.println("[1] - Inserir Aluno");
            System.out.println("[2] - Imprimir Lista\n");
            System.out.println("[0] - Sair\n");
            System.out.print("Opção: ");
            option = read.nextLine();

            switch (option) {
                case "1":
                    inserirAluno(alunos, read);
                    break;
                case "2":
                    exibirLista(alunos);
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (!option.equals("0"));
    }

    private static void inserirAluno(Set<String> listaAlunos, Scanner read) {
        System.out.print("Insira o nome: ");
        if (!listaAlunos.add(read.nextLine())) {
            System.out.println("\n#### NOME JA CADASTRADO! ####\n");
        } else {
            System.out.println("\n#### ALUNO CADASTRADO COM SUCESSO! ####");
        }
    }

    private static void exibirLista(Set<String> listaAlunos) {
        System.out.println("----- Lista de nomes -----");
         listaAlunos.forEach(System.out::println);
    }
}
