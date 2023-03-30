
import java.util.Scanner;

/**
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el
 * programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
 * Incorrecto. Nota: investigar la función equals() en Java.
 *
 * @author elias
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String fraSe1;
        Scanner leerF = new Scanner(System.in);
        System.out.println("Ingresar una frase: ");

        fraSe1 = leerF.nextLine();
        if (fraSe1.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
    }
}
