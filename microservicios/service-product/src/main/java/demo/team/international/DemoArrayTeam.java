package demo.team.international;
import java.util.Arrays;
public class DemoArrayTeam {
    //Given an array where every element occurs three times,
    //except one element which occurs only once. Find the element that occurs once.
    //Input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3} Output: 2
    // Cuenta cuántas veces aparece el valor y devuelve true si
    // aparece exactamente una vez
    public static boolean esValorUnico(int valor, int[] arreglo) {
        int contador = 0;
        for (int x = 0; x < arreglo.length; x++) {
            if (arreglo[x] == valor)
                contador++;
        }
        return contador == 1;
    }
    public static void main(String[] args) {
        int arreglo[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3};
        int arregloSinRepetidos = 0;
        int i = 0;
        for (int x = 0; x < arreglo.length; x++) {
            if (esValorUnico(arreglo[x], arreglo)) {
                arregloSinRepetidos = arreglo[x];
                i++;
            }
        }
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        System.out.println("valor único: " + arregloSinRepetidos);
    }
}
