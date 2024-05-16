public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone1 = new Iphone();

        iphone1.adicionarNovaAba();
        iphone1.exibirPagina();
        iphone1.atualizarPagina();

        iphone1.tocar();
        iphone1.pausar();
        iphone1.selecionarMusica();

        iphone1.ligar();
        iphone1.atender();
        iphone1.iniciarCorreioVoz();
    }
}
