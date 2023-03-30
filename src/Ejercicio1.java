
import java.util.Scanner;

/**
 * Crear un programa que dado un número determine si es par o impar.
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int nuM;
        Scanner leerN = new Scanner(System.in);
           
        do {
            System.out.println(" ");System.out.println("Ingrese un numero para determinar si es par o impar: ");

            nuM = leerN.nextInt();
            
            if (nuM % 2 == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
        } while (nuM!=0);

    }
}
