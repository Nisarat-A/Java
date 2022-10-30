package com.nisar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER YOUR YEAR OF BIRTH : ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle  next line characters ENTER KEY ISSUE;
        //after read number need scanner.nextLine() to handle  next line characters enter key issues;

        System.out.println("ENTER YOUR NAME : ");
        String name = scanner.nextLine();

        int age = 2022-yearOfBirth;

        System.out.println("your name  is " + name + " , and you are "+age  +" years old");
        scanner.close();
    }
}