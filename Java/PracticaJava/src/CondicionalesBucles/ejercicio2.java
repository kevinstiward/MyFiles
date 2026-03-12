package CondicionalesBucles;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el precio del prodcuto");
        double precio = sc.nextInt();

        if (precio <= 500){
            System.out.println("precio total (no se aplica descuento): " + precio);

        } else if (precio > 500 && precio < 1000) {
            double precioDescuento = precio * 0.1;
            double precioTotal = precio - precioDescuento;

            System.out.println("precio original: " + precio);
            System.out.println("descuento aplicado: " + precioDescuento);
            System.out.println("precio final: " + precioTotal);

        } else if (precio >= 1000) {
            double precioDescuento = precio * 0.2;
            double precioTotal = precio - precioDescuento;

            System.out.println("precio original: " + precio);
            System.out.println("descuento aplicado: " + precioDescuento);
            System.out.println("precio final: " + precioTotal);

        }
    }
}
