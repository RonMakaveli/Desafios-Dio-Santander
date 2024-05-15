package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
        bootcamp.adicionarDev(this); // Adicionando o Dev atual à lista de Devs inscritos no Bootcamp
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void adicionarMentoria(Mentoria mentoria) {
        this.conteudosInscritos.add(mentoria);
    }

    // Método auxiliar para exibir o progresso de um desenvolvedor
    public void exibirProgresso() {
        System.out.println("Desenvolvedor: " + this.nome);
        System.out.println("Conteúdos Inscritos: " + this.conteudosInscritos);
        System.out.println("Conteúdos Concluídos: " + this.conteudosConcluidos);
        System.out.println("XP Total: " + this.calcularTotalXp());
        System.out.println();
    }

    // Método auxiliar para exibir os conteúdos inscritos de um desenvolvedor
    public void exibirConteudosInscritos() {
        System.out.println("Desenvolvedor: " + this.nome);
        System.out.println("Conteúdos Inscritos: " + this.conteudosInscritos);
        System.out.println();
    }

    // Método auxiliar para exibir os conteúdos concluídos de um desenvolvedor
    public void exibirConteudosConcluidos() {
        System.out.println("Desenvolvedor: " + this.nome);
        System.out.println("Conteúdos Concluídos: " + this.conteudosConcluidos);
        System.out.println();
    }
}