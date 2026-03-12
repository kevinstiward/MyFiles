package CondicionalesBucles;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa la temperatura en grados celcius: ");
        int temperatura = sc.nextInt();

        if (temperatura < 10 ){
            System.out.println("hace frio");
        } else if (temperatura > 10 && temperatura < 25) {
            System.out.println("clima agradable");
        } else if (temperatura > 25 ){
            System.out.println("hace calor");
        }
    }
}
