class Visokosniy1 {
    public static void main(String[] args) {
        // Примеры для проверки работы метода
        System.out.println(Visokosniy(1920));
        System.out.println(Visokosniy(2100));
        System.out.println(Visokosniy(1600));
        System.out.println(Visokosniy(1932));
    }

    public static boolean Visokosniy(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
