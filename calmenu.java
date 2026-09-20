package noxtool;

import java.util.Scanner;

public class calmenu {

    // Only function you need to call
    public static void start() {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== SMART MENU ==========");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square");
        System.out.println("6. Cube");
        System.out.println("7. Factorial");
        System.out.println("8. Check Prime");
        System.out.println("9. Celsius to Fahrenheit");
        System.out.println("10. Generate Random Number");
        System.out.println("================================");

        System.out.print("Choose an option (1-10): ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter two numbers: ");
                double a1 = sc.nextDouble();
                double b1 = sc.nextDouble();
                System.out.println("Result = " + (a1 + b1));
                break;

            case 2:
                System.out.print("Enter two numbers: ");
                double a2 = sc.nextDouble();
                double b2 = sc.nextDouble();
                System.out.println("Result = " + (a2 - b2));
                break;

            case 3:
                System.out.print("Enter two numbers: ");
                double a3 = sc.nextDouble();
                double b3 = sc.nextDouble();
                System.out.println("Result = " + (a3 * b3));
                break;

            case 4:
                System.out.print("Enter two numbers: ");
                double a4 = sc.nextDouble();
                double b4 = sc.nextDouble();
                if (b4 == 0)
                    System.out.println("Cannot divide by zero!");
                else
                    System.out.println("Result = " + (a4 / b4));
                break;

            case 5:
                System.out.print("Enter a number: ");
                double n5 = sc.nextDouble();
                System.out.println("Square = " + (n5 * n5));
                break;

            case 6:
                System.out.print("Enter a number: ");
                double n6 = sc.nextDouble();
                System.out.println("Cube = " + (n6 * n6 * n6));
                break;

            case 7:
                System.out.print("Enter a number: ");
                int n7 = sc.nextInt();
                long fact = 1;
                for (int i = 1; i <= n7; i++)
                    fact *= i;
                System.out.println("Factorial = " + fact);
                break;

            case 8:
                System.out.print("Enter a number: ");
                int n8 = sc.nextInt();
                boolean prime = true;
                if (n8 < 2)
                    prime = false;
                else {
                    for (int i = 2; i <= Math.sqrt(n8); i++) {
                        if (n8 % i == 0) {
                            prime = false;
                            break;
                        }
                    }
                }
                System.out.println(prime ? "Prime Number" : "Not a Prime Number");
                break;

            case 9:
                System.out.print("Enter Celsius: ");
                double c = sc.nextDouble();
                System.out.println("Fahrenheit = " + ((c * 9 / 5) + 32));
                break;

            case 10:
                int random = (int) (Math.random() * 100) + 1;
                System.out.println("Random Number = " + random);
                break;

            default:
                System.out.println("Invalid Choice!");
        }
    }
}
