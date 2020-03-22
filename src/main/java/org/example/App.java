package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

    private static Scanner sc = new Scanner(System.in);
    private static Set<Aluno> listaAlunos = new HashSet<Aluno>();

    public static void main(String[] args) {

        String option;

        do {
            System.out.println("\n----- Menu -----");
            System.out.println("[1] - Inserir Aluno");
            System.out.println("[2] - Imprimir Lista\n");
            System.out.println("[0] - Sair\n");
            option = sc.nextLine();

            switch (option) {
                case "1":
                    inserirAluno();
                    break;
                case "2":
                    exibirLista();
                    break;
                case "0":
                    exibirLista();
                    break;
            }
        } while (!option.equals("0"));
    }

    private static void inserirAluno() {
        System.out.println("Insira o nome: ");
        String nome = sc.nextLine();
        if (listaAlunos.add(new Aluno(nome)) == false) {
            System.out.println("\n#### NOME JA CADASTRADO ####\n");
        }

        System.out.println("\n");
    }

    private static void exibirLista() {
        System.out.println("----- Lista de nomes -----");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno.getNome());
        }
    }
}