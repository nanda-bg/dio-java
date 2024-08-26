import java.util.Random;

public class Conta {
    private String nome;
    private String agencia;
    private int numero;
    private double saldo;

    public Conta(String nome) {
        this.nome = nome;
        this.agencia = gerarAgencia();
        this.numero = gerarNumeroConta();
        this.saldo = 0.0;
    }

    private int gerarNumeroConta() {
        Random random = new Random();
        return random.nextInt(1000000);
    }

    private String gerarAgencia() {
        Random random = new Random();
        int parte1 = random.nextInt(10);
        int parte2 = random.nextInt(1000);
        return String.format("%d-%03d", parte1, parte2);
    }


    public String getNome() {
        return nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
            saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else{
            System.out.printf("Saldo indisponível, tente um valor até %.2f", saldo);
        }
    }

    public String contaCriada(){
        return String.format("""
            Olá %s, obrigado por criar uma conta em nosso banco!
            Seus dados são
            Agência: %s
            Conta: %d
            Você já pode estar realizando seu primeiro depósito.""",
            nome, agencia, numero);
    }

    public String exibirInformacoes() {
        return String.format("""
            Nome: %s
            Agência: %s
            Conta: %d
            Saldo: %.2f
            """,
            nome, agencia, numero, saldo);
    }
}
