
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elias
 */
public class Prueba {
     public static void main(String[] args) {
     String cad1,cadFin;
     
         Scanner leerC = new Scanner(System.in);
         cad1 = leerC.nextLine();
         cadFin=cad1.substring(4);
         
         System.out.println(cadFin);
     }
}
