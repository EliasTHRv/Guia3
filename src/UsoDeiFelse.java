
import java.util.Scanner;

/**
 * Implementar un programa que le pida dos números enteros al usuario y
 * determine si ambos o alguno de ellos es mayor a 25.
 */
public class UsoDeiFelse {

    public static void main(String[] args) {

        int num1, num2;

        Scanner leerN = new Scanner(System.in);
        System.out.println("Ingrese dos numeros:");
        num1 = leerN.nextInt();
        num2 = leerN.nextInt();
        

        if (num1 >25) {
            System.out.println(num1 + " Es mayor a 25");
        } else {
            System.out.println(num1 + " No es mayor a 25");
        }
        if (num2 >25) {
            System.out.println(num2 + " Es mayor a 25");
        } else {
            System.out.println(num2 + " No es mayor a 25");
        }
        
      

    }
}
