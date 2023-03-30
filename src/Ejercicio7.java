
import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
 * toda secuencia distinta de FDE, que no respete el formato se considera
 * incorrecta. Al finalizar el proceso, se imprime un informe indicando la
 * cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
 * ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        String cad1, cadIni, cadFin;
        int corr1, inco1, aux1;
        corr1 = 0;
        inco1 = -1;
        Scanner leerC = new Scanner(System.in);

        do {
            System.out.println("Ingrese una cadena de 5 caracteres: ");
            System.out.println("El primer caracter debe ser 'x' y el ultimo deber ser 'o': ");
            cad1 = leerC.nextLine();
            aux1 = cad1.length();
            cadIni = cad1.substring(0, 1);
            cadFin = cad1.substring(4);

            if ((aux1 == 5) && (cadIni.equalsIgnoreCase("x")) && (cadFin.equalsIgnoreCase("o"))) {
                System.out.println("Correcto");
                corr1++;

            } else {
                System.out.println("Incorrecto");
                inco1++;
            }

        } while (!cad1.equals("&&&&&"));
        System.out.println("La cantidad de correctos es: " + corr1);
        System.out.println("La cantidad de correctos es: " + inco1);
    }
}
