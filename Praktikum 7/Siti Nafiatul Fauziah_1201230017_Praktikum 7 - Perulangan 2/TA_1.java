import java.util.Scanner;

public class TA_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Looping Silang =====");
        System.out.print("Masukkan luas : ");
        int x = input.nextInt();
        if (x >= 1) {
            loopFor(x);
            loopWhile(x);
            loopDoWhile(x);
        } else {
            System.out.println("Inputan tidak valid");
        }
    }

    static void loopFor(int x) {
        System.out.println("\n===== For Loop =====\n");
        for (int brs = 0; brs <= x; brs++) {
            for (int klm = 0; klm <= x; klm++) {
                if (klm == brs || klm == x - brs) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void loopWhile(int x) {
        System.out.println("\n===== While Loop =====\n");
        int brs = 0;
        while (brs <= x) {
            int klm = 0;
            while (klm <= x) {
                if (klm == brs || klm == x - brs) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                klm++;
            }
            System.out.println();
            brs++;
        }
    }

    static void loopDoWhile(int x) {
        System.out.println("\n===== Do While Loop =====");
        int brs = 0;
        do {
            System.out.println();
            int klm = 0;
            do {
                if (klm == brs || klm == x - brs) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                klm++;
            } while (klm <= x);
            brs++;
        } while (brs <= x);
    }
}