package br.com.dio.desafio.dominio;

public class Curso {
     private String titulo;
    private String descricao;
    private int Cargahoraria;

    public Curso() {
    }

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

    public int getCargahoraria() {
        return Cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", Cargahoraria=" + Cargahoraria +
                '}';
    }

    public void setCargahoraria(int cargahoraria) {
        Cargahoraria = cargahoraria;

    }
}

