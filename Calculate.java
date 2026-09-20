package noxtool;

import java.util.Scanner;
public class Calculate {
    public int a,b,sum,diff,pro,div,choice;
    public void logic() {
        sum = a+b;
        diff = a-b;
        pro = a*b;
        div = a/b;
    }
    public void display() {
              if ( choice == 1 ) {
            System.out.println("Sum of the numbers is = " +sum);
        } else if ( choice == 2 ) {
            System.out.println("Difference of the numbers is = " +diff);
        } else if ( choice == 3 ) {
            System.out.println("product of the numbers is = " +pro);
        } else if ( choice == 4 ) {
            System.out.println("Quotient of the numbers is = " +div);
        } else {
            System.out.println("⚠ invalid choice");
        }
    }
    public void chDisplay(){
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
    }
    public void num1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number = ");
        a = sc.nextInt();
    }
    public void num2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your second number = ");
        b = sc.nextInt();
    }
    public void ch(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice = ");
        choice = sc.nextInt();
    }
}
