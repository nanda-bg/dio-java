import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        
        System.out.println(servicoContratado(partes, servico));

        scanner.close();
    }
    static String servicoContratado(String[] partes, String servico){
        boolean contratado = false;

        for (int i = 1; i < partes.length; i++){
            if (partes[i].equals(servico)){
                contratado = true;
            }
        }

        String resultado = contratado ? "Sim" : "Nao";

        return resultado;
    }
}