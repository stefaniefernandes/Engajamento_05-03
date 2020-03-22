package org.example;

public class Aluno implements Comparable<Aluno> {

    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }

    @Override
    public boolean equals(Object o) {
        Aluno a = (Aluno) o;
        return this.nome.equals(a.getNome());
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
