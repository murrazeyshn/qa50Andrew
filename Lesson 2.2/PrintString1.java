class PrintString1 {
    public static void main(String[] args) {
        // Пример вызова: выведет строку "Привет" 3 раза
        PrintString("Alloha my friend", 3);
    }

    public static void PrintString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
}
