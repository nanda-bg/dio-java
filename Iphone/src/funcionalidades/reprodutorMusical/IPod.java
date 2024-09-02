package funcionalidades.reprodutorMusical;

public class IPod implements ReprodutorMusical{
    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Tocando %s%n", musica);
    }

    @Override
    public void tocar() {
        System.out.println("Música tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }
}
