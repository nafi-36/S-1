import java.util.Scanner;

public class permutasi {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("PERHITUNGAN PERMUTASI");
        apkPermutasi app = new apkPermutasi();
        app.menu();
    }
}

class apkPermutasi {
    void menu() {
        String quit;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("========================================");
            System.out.print("Masukkan bilangan pertama (n) : ");
            int bil1 = input.nextInt();
            System.out.print("Masukkan bilangan kedua (r) : ");
            int bil2 = input.nextInt();

            int hasil1 = faktorial(bil1);
            int hasil2 = faktorial(bil1 - bil2);

            if (bil1 >= bil2) {
                int permutasi = hasil1 / hasil2;
                System.out.println("Permutasi dari " + bil1 + " dan " + bil2 + " adalah " + bil1 + "! / (" + bil1 + "-"
                        + bil2 + ")! = " + permutasi);
            } else {
                System.out.println("Bilangan pertama harus lebih besar dari atau sama dengan bilangan kedua");
            }

            System.out.print("Quit? y/n : ");
            quit = input.next();
        } while (!quit.equals("y"));
    }

    static int faktorial(int bil) {
        int faktorial = 1;

        while (bil > 0) {
            faktorial = faktorial * bil;
            bil--;
        }

        return faktorial;
    }
}