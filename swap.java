package org.learn;
 
import java.util.Scanner;
 
public class DemoSwapNumbers {
 
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
             
            System.out.printf("1. Enter first number : ");
            int x = scanner.nextInt();
             
            System.out.printf("2. Enter second number : ");
            int y = scanner.nextInt();
             
            System.out.printf("3. Numbers before swapping: x = %d, y = %d \n", x, y);
 
            int temp = x;
            x = y;
            y = temp;
 
            System.out.printf("4. Numbers after swapping: x = %d, y = %d \n", x, y);
 
        }
    }
 
}