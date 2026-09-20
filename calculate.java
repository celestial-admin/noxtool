package noxtool;

import java.util.Scanner;

public class calculate {
   public int a;
   public int b;
   public int sum;
   public int diff;
   public int pro;
   public int div;
   public int choice;

   public void logic() {
      this.sum = this.a + this.b;
      this.diff = this.a - this.b;
      this.pro = this.a * this.b;
      this.div = this.a / this.b;
   }

   public void display() {
      if (this.choice == 1) {
         System.out.println("Sum of the numbers is = " + this.sum);
      } else if (this.choice == 2) {
         System.out.println("Difference of the numbers is = " + this.diff);
      } else if (this.choice == 3) {
         System.out.println("product of the numbers is = " + this.pro);
      } else if (this.choice == 4) {
         System.out.println("Quotient of the numbers is = " + this.div);
      } else {
         System.out.println("⚠ invalid choice");
      }

   }

   public void chDisplay() {
      System.out.println("1. Addition");
      System.out.println("2. Substraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
   }

   public void num1() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your first number = ");
      this.a = sc.nextInt();
   }

   public void num2() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your second number = ");
      this.b = sc.nextInt();
   }

   public void ch() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your choice = ");
      this.choice = sc.nextInt();
   }
}
