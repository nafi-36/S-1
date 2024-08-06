import java.util.Scanner;

public class Jurnal {
    int tinggi;
    int counterBaris;
    int counterKolom;

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Jurnal jn = new Jurnal();
        jn.loopWhile();
        jn.loopFor();
        jn.loopDoWhile();
        jn.diagonal();
    }

    void loopWhile() {
        System.out.println("===== While Loop =====");
        System.out.print("Ketinggian : ");
        tinggi = input.nextInt();

        if (tinggi >= 1) {
            counterBaris = 1;
            while (counterBaris <= tinggi) {
                counterKolom = 1;
                while (counterKolom <= counterBaris) {
                    System.out.print(counterKolom + " ");
                    counterKolom++;
                }
                System.out.println();
                counterBaris++;
            }
        } else {
            System.out.println("Tinggi harus bilangan asli");
        }
    }

    void loopFor() {
        System.out.println("\n===== For Loop =====");
        System.out.print("Ketinggian : ");
        tinggi = input.nextInt();

        if (tinggi >= 1) {
            for (counterBaris = 1; counterBaris <= tinggi; counterBaris++) {
                for (counterKolom = 1; counterKolom <= counterBaris; counterKolom++) {
                    System.out.print(counterKolom + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Tinggi harus bilangan asli");
        }
    }

    void loopDoWhile() {
        System.out.println("\n===== Do While Loop =====");
        System.out.print("Ketinggian : ");
        tinggi = input.nextInt();

        if (tinggi >= 1) {
            counterBaris = 1;
            do {
                System.out.println();
                counterKolom = 1;
                do {
                    System.out.print(counterKolom + " ");
                    counterKolom++;
                } while (counterKolom <= counterBaris);
                counterBaris++;
            } while (counterKolom <= tinggi);
        } else {
            System.out.println("Tinggi harus bilangan asli");
        }
    }

    void diagonal() {
        System.out.println("\n\n===== Diagonal =====");
        System.out.print("Masukkan tinggi diagonal : ");
        int n = input.nextInt();

        System.out.println("\nDiagonal 1");
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }

        System.out.println("\nDiagonal 2");
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
    }
}