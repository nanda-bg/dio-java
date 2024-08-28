import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner parametros = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = parametros.nextInt();
        System.out.println();
        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = parametros.nextInt();

        parametros.close();

        try{
            if (segundoParametro <= primeiroParametro) {
                throw new ParametrosInvalidosException();
            }

            contar(primeiroParametro, segundoParametro);

        } catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro precisa ser maior que o primeiro");
        }
    }

    static void contar(int primeiroParametro, int segundoParametro){
        int quantosNumeros = segundoParametro - primeiroParametro;

        for (int i = 1; i <= quantosNumeros; i++){
            System.out.println(i);
        }
    }
}
