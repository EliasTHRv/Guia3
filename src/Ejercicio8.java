
import java.util.Scanner;

/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado 
se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 * @author elias
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        int lado1;
        Scanner leerN = new Scanner(System.in);
        lado1 = leerN.nextInt();

        for (int i = 0; i < lado1; i++) {
            for (int j = 0; j < lado1; j++) {
                if (i == 0 || i == lado1 - 1 || j == 0 || j == lado1 - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

}
