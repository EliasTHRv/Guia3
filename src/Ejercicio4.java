
import java.util.Scanner;


/**
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
 * Si la primera letra es una ‘A’,se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
 * en caso contrariom se deberá imprimir “INCORRECTO”. 
 * Nota: investigar la función Substring y equals() de Java.
 * @author elias
 */
public class Ejercicio4 {
    public static void main(String[] args){
    
        String letra0, fraSe;
        Scanner leerF= new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra: ");
        fraSe = leerF.nextLine();
        letra0 = fraSe.substring(0,1);
       
        if (letra0.equalsIgnoreCase("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
    }
}
