import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        contar(primeiroNumero, segundoNumero);


    }

    public static void contar(final Integer primeiroNumero, final Integer segundoNumero) throws ParametrosInvalidosException{
        if(primeiroNumero > segundoNumero){
            throw new ParametrosInvalidosException();
        }

        int contador = segundoNumero - primeiroNumero;

        for (int i = 0; i < contador; i++){
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }

}