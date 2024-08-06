// INI UNTUK MENGHARGAI USAHA SAYA, MAKASIH

import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== Input Data Parkir =====");
        System.out.print("Jenis kendaraan (mobil/motor) : ");
        String jenis = input.nextLine();
        System.out.print("Waktu masuk (00:00)  : ");
        String masuk = input.nextLine();
        System.out.print("Waktu keluar (00:00) : ");
        String keluar = input.nextLine();

        String[] waktuMasuk = masuk.split(":");
        int jamMasuk = Integer.parseInt(waktuMasuk[0]);
        int menitMasuk = Integer.parseInt(waktuMasuk[1]);

        String[] waktuKeluar = keluar.split(":");
        int jamKeluar = Integer.parseInt(waktuKeluar[0]);
        int menitKeluar = Integer.parseInt(waktuKeluar[1]);

        if (!jenis.toLowerCase().equals("mobil") || !jenis.toLowerCase().equals("motor")) {
            if (jamMasuk > 24 || jamKeluar > 24 || menitMasuk > 60 || menitKeluar > 60) {
                System.out.println("Inputan tidak valid");
            } else {
                int selisihJam = jamKeluar - jamMasuk;
                int selisihMenit = menitKeluar - menitMasuk;

                if (selisihMenit < 0) {
                    selisihJam = selisihJam - 1;
                    selisihMenit = selisihMenit + 60;
                }
                if (selisihJam < 0) {
                    selisihJam = selisihJam + 24;
                }

                int biaya = 0;
                int totalBiaya = 0;

                if (jenis.toLowerCase().equals("mobil")) {
                    biaya = 6000;
                    if ((selisihMenit % 60) != 0) {
                        totalBiaya = (biaya * selisihJam) + biaya;
                    } else {
                        totalBiaya = biaya * selisihJam;
                    }
                } else if (jenis.toLowerCase().equals("motor")) {
                    biaya = 3000;
                    if ((selisihMenit % 60) != 0) {
                        totalBiaya = (biaya * selisihJam) + biaya;
                    } else {
                        totalBiaya = biaya * selisihJam;
                    }
                }

                System.out.println("\n===== Total Biaya Parkir =====");
                System.out.println("Waktu parkir : " + selisihJam + " jam " + selisihMenit + " menit");
                System.out.println("Biaya parkir : " + totalBiaya);
            }
        } else {
            System.out.println("Inputan tidak valid");
        }
    }
}