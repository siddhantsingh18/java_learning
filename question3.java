package com.company;

import java.util.Scanner;

public class question3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = s.next();

        System.out.println("Hello "+name+", Have a good day");
        s.close();
    }
}
