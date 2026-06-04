package com.company;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter marks of subject1 : ");
        int a = s.nextInt();
        System.out.println("Enter marks of subject2 : ");
        int b = s.nextInt();
        System.out.println("Enter marks of subject3 : ");
        int c = s.nextInt();

        int sum = a + b + c;
        int percentage = sum * 100 / 300;
        double cgpa = percentage / 9.5;

        System.out.println("Total marks out of 300 : "+sum);
        System.out.println("Percentage : "+percentage);
        System.out.println("CGPA : "+cgpa);

        s.close();
    }
}
