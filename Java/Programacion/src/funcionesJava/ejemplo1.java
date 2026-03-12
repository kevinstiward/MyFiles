package funcionesJava;

public class ejemplo1 {

    public static int sumar(int a, int b) {

        int suma = a + b;

        return suma ;
    }

    public static void main(String[] args) {

        int [] a = {9,8,7,6,5,4};

        int total =  a[0];

        for ( int i = 0 ; i < a.length; i++){

            total = sumar(total, a[i]);

        }
        System.out.print("el total es : " + total);
    }

}
