package CondicionalesBucles;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 7: ");
        int numero = sc.nextInt();

        switch (numero){
            case 1:
                System.out.println("lunes");
                System.out.println("dia laboral");
                break;
            case 2:
                System.out.println("martes");
                System.out.println("dia laboral");
                break;
            case 3:
                System.out.println("miercoles");
                System.out.println("dia laboral");
                break;
            case 4:
                System.out.println("jueves");
                System.out.println("dia laboral");
                break;
            case 5:
                System.out.println("viernes");
                System.out.println("dia laboral");
                break;
            case 6:
                System.out.println("sabado");
                System.out.println("fin de semana");
                break;
            case 7:
                System.out.println("domingo");
                System.out.println("fin de semana");
                break;
            default:
                System.out.println("error");
        }
    }
}
