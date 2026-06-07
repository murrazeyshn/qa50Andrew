class Negative1 {
    public static void main(String[] args) {
        // Примеры для проверки работы метода
        System.out.println(Negative(-53));
        System.out.println(Negative(0));
        System.out.println(Negative(160));
    }

    public static boolean Negative(int number) {
        return number < 0;
    }
}
