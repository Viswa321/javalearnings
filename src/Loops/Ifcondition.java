package Loops;

import java.util.Scanner;

public class Ifcondition {
    public static void main(String[] args) {
      Scanner sc1 = new Scanner(System.in);//if you enter your inputs use Scanner condition
        System.out.println("Enter a,b,c");
      int a = sc1.nextInt();
      int b = sc1.nextInt();
      int c = sc1.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (a > b) {
            System.out.println("print a");
        }
        else if (b>c) {
            System.out.println("Print c");
        }
        else {
            System.out.println("Print c");

        }
    }
}