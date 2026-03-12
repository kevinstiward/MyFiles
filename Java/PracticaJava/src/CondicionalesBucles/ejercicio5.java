package CondicionalesBucles;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el numero : ");
        int num = sc.nextInt();

        boolean esPrimo = true;

        if (num <= 1) {
            esPrimo = false;

        } else {

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo) {
            System.out.println("El número " + num + " es primo.");
        } else {
            System.out.println("El número " + num + " no es primo.");
        }
    }
}
