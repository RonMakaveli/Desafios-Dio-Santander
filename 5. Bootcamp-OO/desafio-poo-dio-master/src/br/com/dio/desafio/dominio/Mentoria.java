package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    public static Mentoria criarMentoria(String titulo, String descricao) {
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(titulo);
        mentoria.setDescricao(descricao);
        mentoria.setData(LocalDate.now());
        return mentoria;
    }

    public static void exibirInformacoesMentoria(Mentoria mentoria) {
        System.out.println("\nInformações sobre a Mentoria:");
        System.out.println("Título: " + mentoria.getTitulo());
        System.out.println("Descrição: " + mentoria.getDescricao());
        System.out.println("Data: " + mentoria.getData());
    }
}