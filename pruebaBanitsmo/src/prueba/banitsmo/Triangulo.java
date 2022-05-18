package prueba.banitsmo;

public class Triangulo {

    // Tiene que recibir la cantidad máxima de valores a mostrar
    // Siempre sera un valor impar
    public static void main(String[] args) {
        // obtenemos el valor recibido
        int max = new Integer(args[0]);
        int i = 0, j = 0;
        for (i = 1; i <= max; i = i + 1) {
            // Mostramos los asteriscos en cada fila
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
