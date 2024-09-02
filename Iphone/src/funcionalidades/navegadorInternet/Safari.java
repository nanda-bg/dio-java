package funcionalidades.navegadorInternet;

public class Safari implements NavegadorInternet{
    @Override
    public void exibirPagina(String url) {
        System.out.printf("Exibindo %s%n", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova guia");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }
}