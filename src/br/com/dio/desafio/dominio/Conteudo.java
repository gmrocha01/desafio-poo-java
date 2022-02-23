package br.com.dio.desafio.dominio;

public abstract class Conteudo { //Se a classe é abstrata, não pode ser instanciada.
    protected static final double XP_Padrao = 10; //final significa q é constant
    private String titulo, descricao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXp();
}
