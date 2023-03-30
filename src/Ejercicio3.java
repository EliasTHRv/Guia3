
import java.util.Scanner;


/**
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
 * el usuario ingresa una fr ase o palabra de 8 de largo se deberá de imprimir un mensaje
 * por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
 * “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 *
 * @author elias
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String fraSe;
        int longF;
        Scanner leerF=new Scanner(System.in);
        System.out.println("Ingrese una frase o palaba de 8 letras de largo: ");
        fraSe = leerF.nextLine();
        longF = fraSe.length();
        if (longF==8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
    }
}
