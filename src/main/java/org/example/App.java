package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Aluno> listaAlunos = new ArrayList<Aluno>();

        int i = 0;
        int option = 0;
        while(1 != 0) {
            System.out.println("Insira do nome: ");
            String nome = sc.nextLine();
            listaAlunos.add(new Aluno(nome));
            System.out.println(i + " Nome cadastrado: " + listaAlunos.get(i).getNome());
            i++;
        }
    }
}
