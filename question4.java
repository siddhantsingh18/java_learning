package com.company;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter distance in km : ");
        int a = s.nextInt();

        double miles = a * 0.6213712;
        System.out.println("Distance in miles : "+miles);
    }

}
