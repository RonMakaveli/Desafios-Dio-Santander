public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Exemplo de utilização dos métodos
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarConversaVoz();

        iphone.selecionarMusica("MusicName.mp3");
        iphone.tocar();
        iphone.pausar();

        iphone.exibirPagina("www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}