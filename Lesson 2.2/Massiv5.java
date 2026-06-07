import java.util.Arrays;

class Massiv5 {
    public static void main(String[] args) {
        int[] myArr = createArray(14, 22);

        System.out.println(Arrays.toString(myArr));
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }

        return arr;
    }
}
