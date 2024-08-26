import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.printf("""
            Olá %s, obrigado por criar uma conta em nosso banco!
            Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque. """, 
            nome, agencia, numero, saldo);
    }
}
