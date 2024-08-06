// INI UNTUK MENGHARGAI USAHA KAK ZIDAN, SEMANGAT! MAKASIH KAK :3

import java.util.Scanner;

public class uangPunyaKakZidan {
    public static void main(String[] args) {
        aplikasiUang app = new aplikasiUang();
        app.menu();
    }
}

class aplikasiUang {

    Scanner input = new Scanner(System.in);

    void menu() {
        System.out.println("<<-- Pecahan Uang -->>");
        System.out.print("Input Jumlah Uang : ");
        int uang = input.nextInt();

        pecahUang(uang);
    }

    void pecahUang(int uang) {
        int uangAsli = uang;
        // 100000
        int seratusribu = uang / 100000;
        uang = uang % 100000;
        // 50000
        int limapuluh = uang / 50000;
        uang = uang % 50000;
        // 20000
        int duapuluh = uang / 20000;
        uang = uang % 20000;
        // 10000
        int sepuluh = uang / 10000;
        uang = uang % 10000;
        // 5000
        int lima = uang / 5000;
        uang = uang % 5000;
        // 2000
        int dua = uang / 2000;
        uang = uang % 2000;
        // 1000
        int seribu = uang / 1000;
        uang = uang % 1000;
        // 500
        int limakoin = uang / 500;
        uang = uang % 500;
        // 200
        int duakoin = uang / 200;
        uang = uang % 200;
        // 100
        int satukoin = uang / 100;
        uang = uang % 100;

        showAkhir(uangAsli, seratusribu, limapuluh, duapuluh, sepuluh, lima, dua, seribu, limakoin, duakoin, satukoin);
    }

    void showAkhir(int uangAsli, int seratusribu, int limapuluh, int duapuluh,
            int sepuluh, int lima, int dua, int seribu, int limakoin, int duakoin, int satukoin) {
        System.out.println("Besar Uang : " + uangAsli);
        if (seratusribu != 0) {
            System.out.println(seratusribu + " Lembar Rp 100.000,-");
        }
        if (limapuluh != 0) {
            System.out.println(limapuluh + " Lembar Rp 50.000,-");
        }
        if (duapuluh != 0) {
            System.out.println(duapuluh + " Lembar Rp 20.000,-");
        }
        if (sepuluh != 0) {
            System.out.println(sepuluh + " Lembar Rp 10.000,-");
        }
        if (lima != 0) {
            System.out.println(lima + " Lembar Rp 5.000,-");
        }
        if (dua != 0) {
            System.out.println(dua + " Lembar Rp 2.000,-");
        }
        if (seribu != 0) {
            System.out.println(seribu + " Lembar Rp 1.000,-");
        }
        if (limakoin != 0) {
            System.out.println(limakoin + " Koin Rp 500,-");
        }
        if (duakoin != 0) {
            System.out.println(duakoin + " Koin Rp 200,-");
        }
        if (satukoin != 0) {
            System.out.println(satukoin + " Koin Rp 100,-");
        }

    }
}
