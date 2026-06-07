class CheckNumberSign {
    public static void main(String[] args) {
           CheckNumberSign(32);
        CheckNumberSign(0);
        CheckNumberSign(-122);
    }

    public static void CheckNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
