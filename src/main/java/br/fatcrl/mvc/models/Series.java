package br.fatcrl.mvc.models;

public class Series {
    private String nome;
    private int ano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Series(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }
}
