/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arraysmuch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Arraysmuch {

    public static void main(String[] args) {
        
       
          Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int number1 = scanner.nextInt();
        System.out.print("Znak: ");
        scanner.nextLine();
        String znak = scanner.nextLine();
        System.out.print("Second number: ");
        int number2 = scanner.nextInt();
        switch (znak) {
            case "+":
                System.out.printf("%d + %d = %d%n ", number1,number2, number1+number2);
                break;
            case "-":
                System.out.printf("%d - %d = %d%n ", number1,number2, number1-number2);
                break;
            case "*":
                System.out.printf("%d * %d = %d%n ", number1,number2, number1*number2);
                break;
            case "/":
                System.out.printf("%d / %d = %-5.2f%n ", number1,number2, (double)number1/number2);
                break;
            default:
                break;
        }
    }
}
