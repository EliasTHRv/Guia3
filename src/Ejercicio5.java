
import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, a
 * continuación solicite números al usuario hasta que la suma de los números
 * introducidos supere el límite inicial.
 *
 * @author elias
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        int suMa, nuM, numL;
        Scanner leerN = new Scanner(System.in);
        System.out.println("Ingrese un numero limite positivo: ");
        numL= leerN.nextInt();
        suMa=0;
        do {            
             System.out.println("Ingrese numeros: ");
             nuM=leerN.nextInt();
             
             suMa=suMa+nuM;
             
        } while (suMa<=numL);
        System.out.println("La suma total es: "+ suMa);
    }

}
