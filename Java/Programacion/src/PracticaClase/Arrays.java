package PracticaClase;

public class Arrays {

    public static void main(String[] args) {

        int[] a = {3, 0, 5, 1, 7, 2};

        for (int j = 1; j < a.length; j++) {
            for (int i = 0; i < a.length - 1; i++) {

                if (a[i] > a[i + 1]) {
                    int aux = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = aux;
                }
            }
        }

        for (int i : a) {
            System.out.print(i + " - ");
        }
    }
}
