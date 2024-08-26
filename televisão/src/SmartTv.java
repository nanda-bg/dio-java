public class SmartTv {
    boolean ligada = false;
    int canal = ligada ? 1 : 0;
    int volume = ligada ? 25 : 0;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    private void executarSeLigada(Runnable acao) {
        if (ligada) {
            acao.run();
        } else {
            System.out.println("Para fazer alterações a televisão precisa estar ligada.");
        }
    }

    public void aumentarVolume(){
        executarSeLigada(() -> volume++);
    }

    public void diminuirVolume(){
        executarSeLigada(() -> volume--);
    }

    public void mudarCanal(int novoCanal){
        executarSeLigada(() -> canal = novoCanal);
    }

    public void aumentarCanal(){
        executarSeLigada(() -> canal++);
    }

    public void diminuirCanal(){
        executarSeLigada(() -> canal--);
    }
}
