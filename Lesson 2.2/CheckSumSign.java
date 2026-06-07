class CheckSumSign {
    public static void main(String[] args) {
        CheckSumSign();
    }

    public static void CheckSumSign() {
        int a = 12;
        int b = -74;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
