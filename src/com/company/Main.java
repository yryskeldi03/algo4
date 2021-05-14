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

        for (int i = n; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j < i; j++) {
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

    public static void printHeart() {
        final int N = 5;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= 4 * N; j++) {
                double d1 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - N, 2));
                double d2 = Math.sqrt(Math.pow(i - N, 2) + Math.pow(j - 3 * N, 2));

                if (d1 < N + 0.5 || d2 < N + 0.5) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print(System.lineSeparator());
        }

        for (int i = 1; i < 2 * N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }

            for (int j = 0; j < 4 * N + 1 - 2 * i; j++) {
                System.out.print('*');
            }

            System.out.print(System.lineSeparator());
        }
    }

    public static void print() {
        final String message = " I love You ";
        final int n = 10;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 4 * n; j++) {
                double d1 = Math.sqrt(Math.pow(i - n, 2) + Math.pow(j - n, 2));
                double d2 = Math.sqrt(Math.pow(i - n, 2) + Math.pow(j - 3 * n, 2));

                if (d1 < n + 0.5 || d2 < n + 0.5) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print(System.lineSeparator());
        }

        for (int i = 1; i < 2 * n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }

            for (int j = 0; j < 4 * n + 1 - 2 * i; j++) {
                if (i >= 2 && i <= 4) {
                    int idx = j - (4 * n - 2 * i - message.length()) / 2;
                    if (idx < message.length() && idx >= 0) {
                        if (i == 3) {
                            System.out.print(message.charAt(idx));
                        } else {
                            System.out.print(' ');
                        }
                    } else {
                        System.out.print('*');
                    }
                } else {
                    System.out.print('*');
                }
            }
            System.out.print(System.lineSeparator());
        }
    }
}
