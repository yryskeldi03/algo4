import java.util.Scanner;

public class EmptyTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nj = scanner.nextInt();
        System.out.println("___________________________________________________");
        int i, j, k, rows = nj;
        for (i = 1; i <= rows; i++) {
            for (j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == rows || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }

        calculate();

    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        int n, b,sum = 0;
        System.out.print("Armstrong numbers from 1 to...");
        int userInput = scanner.nextInt();
        for (int i = 1; i <= userInput; i++) {
            n = i;
            while (n > 0) {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
            sum = 0;
        }

    }
}


        /*
        int c = 0, a, temp;
        int n = scanner.nextInt();
        temp = n;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }
        if (temp == c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");

*/