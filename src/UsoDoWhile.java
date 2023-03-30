
import java.util.Scanner;

/**
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se
 * debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
 * programa deberá calcular y mostrar el resultado de la suma de los números
 * leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
 * de la sentencia break.
 */
public class UsoDoWhile {

    public static void main(String[] args) {
        Scanner leerN = new Scanner(System.in);
        int aux, nuM, nuM2, i;
        aux = 0;
        i = 1;
        do {
            System.out.println("Ingrese 20 numeros: ");
            nuM = leerN.nextInt();
            i++;

            if ((nuM > 0)) {

                aux = aux + nuM;

            } else if (nuM==0) {
                System.out.println("Se capturo el 0");
                break;

            }
        } while ((nuM<0)||(nuM>0) && (i <= 20));
        System.out.println("La suma de los numeros es: " + aux);

    }
}
