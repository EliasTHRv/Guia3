
import java.util.Scanner;

/*
Escriba un programa que valide si una nota está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
public class UsoWhile {
    public static void main(String[] args){
    
        int noTa;
        Scanner leerNota = new Scanner(System.in);
        noTa=0;
        
        
        while((noTa <= 0)||(noTa >= 10)){
        System.out.println("Ingrese una nota entre 0 y 10: ");
        noTa = leerNota.nextInt();
        }
        
    }
    
}
