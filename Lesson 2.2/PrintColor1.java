class PrintColor1 {
    public static void main(String[] args) {
        PrintColor();
    }

    public static void PrintColor() {
        int value = 167;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
