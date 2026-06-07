import java.util.Arrays;

class Massiv4 {
    public static void main(String[] args) {
        int size = 7;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;        }


        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
