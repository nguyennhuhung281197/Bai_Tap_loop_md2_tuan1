import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("0.Exit");
        System.out.println("Enter the number ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.println("1.Print the rectangle");
                for (int i = 0; i <= 3; i++) {
                    for (int j = 0; j <= 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("2.Print the square triangle");
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" *");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("3.Print isosceles triangle");

                for (int i = 0; i <= 5; i++) {
                    for (int j = 5; j > i; j--) {
                        System.out.print(" *");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No menu");
        }

    }
}






