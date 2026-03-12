package PracticaClase;

import java.util.Scanner;

public class ejercicio1 {

    public static void main (String [] args) {

        Scanner cantidad = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de nombres: ");
        int n = cantidad.nextInt();

        String [] nombres = new String[n];

        for  (int i = 0; i <= n; i++) {

            Scanner nombre = new Scanner(System.in);
            System.out.println("Ingrese el nombre de la posicion: " + (i + 1));
            nombres [i] = nombre.nextLine();
        }



    }
}
