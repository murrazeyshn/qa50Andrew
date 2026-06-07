class CheckSumRange {
    public static void main(String[] args) {
        // Примеры для проверки работы метода
        System.out.println(CheckSumRange(3, 6));
        System.out.println(CheckSumRange(1, 19));
        System.out.println(CheckSumRange(44, 32));
        System.out.println(CheckSumRange(2, 17));
    }

    public static boolean CheckSumRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
