import java.util.Scanner;

public class pajak {
    public static void main(String[] args) {
        aplikasi app = new aplikasi();
        app.menu();
    }
}

class aplikasi {
    int jenis;
    int cc;
    double tahun;
    double pjPokok;
    double pjTahun;
    double pjTotal;

    void menu() {
        String quit;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Perhitungan Pajak Kendaraan di Kantor Samsat");
            System.out.println("1. Motor");
            System.out.println("2. Mobil");
            System.out.print("Jenis kendaraan : ");
            jenis = input.nextInt();
            System.out.print("Kapasitas mesin (cc) kendaraan : ");
            cc = input.nextInt();
            System.out.print("Tahun produksi kendaraan : ");
            tahun = input.nextDouble();

            if (2023 - tahun > 0) {
                switch (jenis) {
                    case 1:
                        if (cc < 100) {
                            pjPokok = 200000;
                            pjTahun = 0.01;
                        } else if (cc >= 100 && cc < 250) {
                            pjPokok = 1000000;
                            pjTahun = 0.03;
                        } else if (cc >= 250) {
                            pjPokok = 4000000;
                            pjTahun = 0.05;
                        }
                        break;
                    case 2:
                        if (cc < 1000) {
                            pjPokok = 2000000;
                            pjTahun = 0.01;
                        } else if (cc >= 1000 && cc < 1500) {
                            pjPokok = 3000000;
                            pjTahun = 0.02;
                        } else if (cc >= 1500 && cc < 2500) {
                            pjPokok = 6000000;
                            pjTahun = 0.04;
                        } else if (cc >= 2500) {
                            pjPokok = 12000000;
                            pjTahun = 0.08;
                        }
                        break;
                    default:
                        System.out.println("Inputan tidak valid");
                        pjPokok = 0;
                        pjTahun = 0;
                        break;
                }
                tahun = 2023 - tahun;
                System.out.println("========================================");
                System.out.println("Pajak pokok : " + cc + "cc" + " >>> " + (int) pjPokok);
                System.out.println("Total penambahan pajak : " + (pjTahun * 100) + "% x " + tahun);
                System.out.println("Total pajak : ");
                System.out.println("a. Pokok pajak : " + (int) pjPokok);
                System.out.println("b. Penambahan pokok : " + (int) pjPokok + " x " + ((tahun * pjTahun) * 100) + "%");
                System.out.println("                    : " + (int) (tahun * pjTahun * pjPokok));
                pjTotal = (int) pjPokok + (tahun * pjTahun * pjPokok);
                System.out.println("c. Total pajak : " + (int) pjTotal);
            } else {
                System.out.println("Tidak kena pajak");
            }
            System.out.print("Quit? y/n :");
            quit = input.next();
        } while (!quit.equals("y"));
    }
}