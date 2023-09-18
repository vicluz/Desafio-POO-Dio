public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Aparelho
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();

        //Navegador

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        //reprodutor

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
