import java.util.Scanner;

public class TA_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Sigma Faktorial =====");
        System.out.print("Masukkan sebuah nilai : ");
        int number = input.nextInt();
        if (number >= 1) {
            loopFor(number);
            loopWhile(number);
            loopDoWhile(number);
        } else {
            System.out.println("Inputan tidak valid");
        }
    }

    static void loopFor(int num) {
        System.out.println("\n===== For Loop =====");
        System.out.print("Sigma dari ");
        int sigma = 0;
        for (int i = num; i >= 1; i--) {
            sigma += faktorial(i);
            System.out.print(faktorial(i));
            if (i != 1) {
                System.out.print(" + ");
            }
        }
        System.out.println("\nAdalah " + sigma);
    }

    static void loopWhile(int num) {
        System.out.println("\n===== While Loop =====");
        System.out.print("Sigma dari ");
        int sigma = 0;
        int i = num;
        while (i >= 1) {
            sigma += faktorial(i);
            System.out.print(faktorial(i));
            if (i != 1) {
                System.out.print(" + ");
            }
            i--;
        }
        System.out.println("\nAdalah " + sigma);
    }

    static void loopDoWhile(int num) {
        System.out.println("\n===== Do While Loop =====");
        System.out.print("Sigma dari ");
        int sigma = 0;
        int i = num;
        do {
            sigma += faktorial(i);
            System.out.print(faktorial(i));
            if (i != 1) {
                System.out.print(" + ");
            }
            i--;
        } while (i >= 1);
        System.out.println("\nAdalah " + sigma);
    }

    static int faktorial(int num) {
        int sum = 1;
        for (int i = num; i >= 1; i--) {
            sum *= i;
        }
        return sum;
    }
}
