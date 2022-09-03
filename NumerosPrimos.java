import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        System.out.print("\nO número ");
        String resultado = "não é primo";
        int i = 2;
        int contador = 0;
        while(i <= numero) {
            if (numero % i == 0) { contador++; }
            i++;
        }
        if(contador>1) {
            System.out.print(" não é primo.");
        } else {
            System.out.println(" é primo");
        }
    }
}