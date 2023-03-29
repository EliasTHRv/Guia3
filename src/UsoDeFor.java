
import java.util.Scanner;

/**
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
 * el número ingresado seguido de tantos asteriscos como indique su valor. Por
 * ejemplo:
 */
public class UsoDeFor {

    public static void main(String[] args) {

        int n, contador;
        Scanner leerN = new Scanner(System.in);
        contador = 1;
        do {
            contador = contador + 1;
            System.out.println(" ");
            System.out.println("Ingrese un numero: ");
            
            n = leerN.nextInt();

            if (n >= 1 && n <= 20) {
                System.out.print(n);
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("El numero ingresado en invalido");
            }

        } while (contador <= 4);

    }
}
