import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.next();

        scanner.close();

        Conta conta = new Conta(nome);
        System.out.println(conta.contaCriada());
    }

}
