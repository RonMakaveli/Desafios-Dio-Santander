public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean emChamada = false;
    private boolean reproduzindo = false;
    private String musicaAtual;

    @Override
    public void tocar() {
        if (reproduzindo) {
            System.out.println("Já está reproduzindo.");
        } else {
            System.out.println("Tocando música: " + musicaAtual);
            reproduzindo = true;
        }
    }

    @Override
    public void pausar() {
        if (reproduzindo) {
            System.out.println("Música pausada.");
            reproduzindo = false;
        } else {
            System.out.println("Não há música reproduzindo para pausar.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        if (!reproduzindo) {
            System.out.println("Selecionando música: " + musica);
            this.musicaAtual = musica;
        } else {
            System.out.println("Pare a música atual antes de selecionar outra.");
        }
    }

    @Override
    public void ligar(String numero) {
        if (!emChamada) {
            System.out.println("Ligando para " + numero + "...");
            emChamada = true;
        } else {
            System.out.println("Já está em uma chamada. Finalize antes de ligar para outro número.");
        }
    }

    @Override
    public void atender() {
        if (emChamada) {
            System.out.println("Atendendo chamada...");
        } else {
            System.out.println("Não há chamada para atender.");
        }
    }

    @Override
    public void iniciarConversaVoz() {
        if (emChamada) {
            System.out.println("Conversa por voz iniciada.");
        } else {
            System.out.println("Não há chamada para iniciar conversa por voz.");
        }
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página atual...");
    }
}
