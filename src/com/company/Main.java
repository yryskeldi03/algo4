package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колво рядов");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //2
        System.out.println();
        System.out.println("_________________________________________________");

        for (int i = n; i>= 0; i--){
            System.out.println();
            for (int j = 0; j<i; j++){
                System.out.print("* ");
            }
        }
        System.out.println("_________________________________________________");



        //3
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("___________________________________________________");


        //4
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
