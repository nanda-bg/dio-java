import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        Map<String, Double> salarios = new HashMap<>();

        salarios.put("Alice", 1950.0);
        salarios.put("Bob", 2000.0);
        salarios.put("Carlos", 2400.0);
        salarios.put("João", 1800.0);
        salarios.put("Maria", 2100.0);
        salarios.put("Joelma", 1650.0);

        List<String> aprovados = new ArrayList<>();

        for (Map.Entry<String, Double> candidato : salarios.entrySet()) {
            if (analisarCandidato(candidato.getValue()).equals("Aprovado")) {
                aprovados.add(candidato.getKey());
            }
        }

        imprimirAprovados(aprovados);
        System.out.println();
        ligarAprovados(aprovados);
    }

    static String analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            return "Aprovado";
        } else if (salarioBase == salarioPretendido) {
            return "Em análise";
        } else {
            return "Reprovado";
        }
    }

    static void imprimirAprovados(List<String> aprovados) {
        for (String candidato : aprovados) {
            System.out.println(candidato + " foi aprovado(a) para a vaga!");
        }
    }

    static void ligarAprovados(List<String> aprovados){
        for (String candidato : aprovados){
            entrarEmContato(candidato);
        }
    }

    static void entrarEmContato(String candidato){
        Boolean atendeu = false;
        int tentativas = 1;
        do{
            atendeu = atender();
            if (atendeu == false){
                tentativas++;
            }
        } while (tentativas <= 3 && atendeu == false);

        if (tentativas == 4){
            System.out.println("Não conseguimos contato com o(a) candidato(a) " + candidato);
        } else{
            System.out.println("Conseguimos contato com o(a) candidato(a) " + candidato + " na " + tentativas + " tentativa ");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }
}
