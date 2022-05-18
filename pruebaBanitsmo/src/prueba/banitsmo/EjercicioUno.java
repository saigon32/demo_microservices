package prueba.banitsmo;

import java.util.Arrays;

public class EjercicioUno {

    public static void main(String[] args) {
        double arreglo[] = { 0, 0, 0.55, 2, 2 };
        int i = 0;
        for (int x = 0; x < arreglo.length; x++) {
            if (esValorUnico(arreglo[x], arreglo)) {
                System.out.println(arreglo[x]);
                i++;
            }
        }
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
    }

    // Cuenta cuántas veces aparece el valor y devuelve true si
    // aparece exactamente una vez
    public static boolean esValorUnico(double valor, double[] arreglo) {
        int contador = 0;
        for (int x = 0; x < arreglo.length; x++) {
            if (arreglo[x] == valor)
                contador++;
        }
        return contador == 1;
    }
}


