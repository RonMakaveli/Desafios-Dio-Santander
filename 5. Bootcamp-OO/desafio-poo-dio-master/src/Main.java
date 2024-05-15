import br.com.dio.desafio.dominio.*;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        // Criação dos cursos e da mentoria
        Curso cursoJava = new Curso("Curso Java", "Descrição do Curso Java", 8);
        Curso cursoJS = new Curso("Curso JavaScript", "Descrição do Curso JavaScript", 4);
        Mentoria mentoriaJava = Mentoria.criarMentoria("Mentoria de Java", "Descrição da Mentoria de Java");

        // Criação do bootcamp e adição dos conteúdos
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");

        bootcamp.adicionarConteudo(cursoJava);
        bootcamp.adicionarConteudo(cursoJS);
        bootcamp.adicionarConteudo(mentoriaJava);

        // Definição dos devs inscritos no bootcamp
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        Set<Dev> devsInscritos = new HashSet<>();
        devsInscritos.add(devCamila);
        devsInscritos.add(devJoao);
        bootcamp.setDevsInscritos(devsInscritos);

        // Exibição das datas inicial e final do bootcamp
        System.out.println("Data Inicial do Bootcamp: " + bootcamp.getDataInicial());
        System.out.println("Data Final do Bootcamp: " + bootcamp.getDataFinal());

        // Exibição das informações do bootcamp
        bootcamp.exibirInformacoes();

        // Utilizando o método getDescricao
        String descricaoDoBootcamp = bootcamp.getDescricao();
        System.out.println("Descrição do Bootcamp: " + descricaoDoBootcamp);

        // Utilizando o método getCargaHoraria
        int cargaHorariaDoCursoJava = cursoJava.getCargaHoraria();
        System.out.println("Carga Horária do Curso Java: " + cargaHorariaDoCursoJava);

        // Utilizando o método setCargaHoraria
        cursoJS.setCargaHoraria(6);
        System.out.println("Nova Carga Horária do Curso JavaScript: " + cursoJS.getCargaHoraria());

        // Utilizando o método setConteudos
        Set<Conteudo> novosConteudos = new HashSet<>();
        novosConteudos.add(cursoJava);
        novosConteudos.add(cursoJS);
        bootcamp.setConteudos(novosConteudos);
        System.out.println("Conteúdos do Bootcamp: " + bootcamp.getConteudos());

        // Utilizando o método getNome
        String nomeDoBootcamp = bootcamp.getNome();
        System.out.println("Nome do Bootcamp: " + nomeDoBootcamp);

        // Utilizando o método exibirInformacoesMentoria
        Mentoria.exibirInformacoesMentoria(mentoriaJava);

        // Utilizando o método inscreverBootcamp
        devCamila.inscreverBootcamp(bootcamp);
        devJoao.inscreverBootcamp(bootcamp);

        // Utilizando o método progredir
        devCamila.progredir();
        devJoao.progredir();

        // Utilizando os métodos exibirProgresso, exibirConteudosInscritos e exibirConteudosConcluidos
        devCamila.exibirProgresso();
        devCamila.exibirConteudosInscritos();
        devCamila.exibirConteudosConcluidos();

        devJoao.exibirProgresso();
        devJoao.exibirConteudosInscritos();
        devJoao.exibirConteudosConcluidos();
    }
}