// INI UNTUK MENGHARGAI USAHA SAYA, MAKASIH

import java.util.Scanner;

public class uang {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== Jumlah Pecahan Uang =====");
        System.out.print("Masukkan jumlah uang : ");
        int uang = input.nextInt();

        System.out.println("Detail pecahan uang  :");
        cekPecahan(uang);

    }

    static void cekPecahan (int uang) {
        int sisa = uang;
        int lembar = 0;

        lembar = sisa / 100000;
        sisa %= 100000;
        if (lembar > 0) {
            System.out.println(lembar + " lembar 100.000");
        }

        lembar = sisa / 50000;
        sisa %= 50000;
        if (lembar > 0) {
            System.out.println(lembar + " lembar 50.000");
        }

        lembar = sisa / 20000;
        sisa %= 20000;
        if (lembar > 0) {
            System.out.println(lembar + " lembar 20.000");
        }

        lembar = sisa / 10000;
        sisa %= 10000;
        if (lembar > 0) {
            System.out.println(lembar + " lembar 10.000");
        }

        lembar = sisa / 5000;
        sisa %= 5000;
        if (lembar > 0) {
            System.out.println(lembar + " lembar 5.000");
        }

        lembar = sisa / 2000;
        sisa %= 2000;
        if (lembar > 0) {
            System.out.println(lembar + " lembar 2.000");
        }

        lembar = sisa / 1000;
        sisa %= 1000;
        if (lembar > 0) {
            System.out.println(lembar + " lembar 1.000");
        }

        lembar = sisa / 500;
        sisa %= 500;
        if (lembar > 0) {
            System.out.println(lembar + " keping 500");
        }

        lembar = sisa / 200;
        sisa %= 200;
        if (lembar > 0) {
            System.out.println(lembar + " keping 200");
        }

        lembar = sisa / 100;
        sisa %= 100;
        if (lembar > 0) {
            System.out.println(lembar + " keping 100");
        }
    }
}