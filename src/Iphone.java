public class Iphone implements AparelhoTelefonico, NavegadorInternet , ReprodutorMusical {

    //Aparelho
    public void ligar() {
        System.out.println("Ligando para o Telefone");
    }

    public void atender() {
        System.out.println("Atendendo o telefone ......");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Chamando o correio de voz....");
    }

    //Navegador
    public void exibirPagina(){
        System.out.println("Exibindo pagina");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

    //Reprodutor
    public void tocar(){
        System.out.println("Reproduzindo a musica....");
    }

    public void pausar() {
        System.out.println("Pausando a musica....");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando a musica.....");
    }
}