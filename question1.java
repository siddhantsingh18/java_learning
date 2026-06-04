package  com.company;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = s.nextInt();
        System.out.println("Enter second number : ");
        int b = s.nextInt();
        System.out.println("Enter third number : ");
        int c = s.nextInt();

        int sum = a + b + c;
        System.out.println("Total Sum : " +sum);
        s.close();
    }
}
