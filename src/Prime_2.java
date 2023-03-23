

public class Prime_2 {
    public static boolean check(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (check(i)) {
                System.out.println(i);
            }
        }
    }
}
