/*Como não é necesseário persistir os dados e a lista é só do nome dos alunos,
criar uma classe Aluno só aumenta o número de linhas do código.
Essa refatoração de código seria interessante se posteriormente fossem adicionados mais campos
em alunos e se outras classes também usufluissem desta classe.*/

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
