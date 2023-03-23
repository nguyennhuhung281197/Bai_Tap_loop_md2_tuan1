import java.util.Scanner;

public class Prime {
    public static boolean check(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int count = 0;
        for (int num = 2; count < n; num++) {
            if (check(num)) {
                System.out.println(num);
                count++;
            }
        }

    }

}



