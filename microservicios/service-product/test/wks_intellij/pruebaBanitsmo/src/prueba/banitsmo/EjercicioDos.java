package prueba.banitsmo;

public class EjercicioDos {

    public static void main(String[] args) {
        int[] myArray = { 13, 2, 4, 35, 1 };
        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println(max);
    }
}
