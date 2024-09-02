package funcionalidades.aparelhoTelefonico;

public class Phone implements AparelhoTelefonico{
    public void iniciarCorreioVoz(){
        System.out.println("A ligação está sendo encaminhada para a caixa postal");
    }

    public void atender(){
        System.out.println("Ligação atendida");
    }
    
    public void ligar(int numero){
        System.out.printf("Ligando para %d%n", numero);
    }
}
