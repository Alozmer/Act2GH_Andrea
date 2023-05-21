import java.util.Random;

public class array20 {
    public static void main(String[] args) {
        int[] array = generateArray20(20, 1, 10);

        // Imprimir el array generado
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] generateArray20(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }
}
