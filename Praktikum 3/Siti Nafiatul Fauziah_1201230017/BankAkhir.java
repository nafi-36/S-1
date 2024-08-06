import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BankAkhir {
    public static void main(String[] args) {
        BankAkhir bnk = new BankAkhir();
        bnk.menu();
    }
    
    String noRek;
    String nasabah;
    int saldo;
    int saldoMinimal = 100000;
    boolean access = false;

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public void menu() {
        try {
            System.out.println("===== APLIKASI BANK =====");
            System.out.println("Menu Utama");
            System.out.println("1. Penambahan rekening baru");
            System.out.println("2. Lihat saldo");
            System.out.println("3. Tambah saldo");
            System.out.println("4. Tarik saldo");
            System.out.println("5. Keluar dari aplikasi");
            System.out.print("Masukkan pilihan anda [1-5] : ");

            String temp = input.readLine();
            int pilihan = Integer.parseInt(temp);

            switch (pilihan) {
                case 1:
                    buatRekening();
                    pressEnter();
                    break;
                case 2:
                    if (access) {
                        lihatSaldo();
                        pressEnter();
                    } else {
                        System.out.println("Silakan membuat akun terlebih dahulu");
                        pressEnter();
                    }
                    break;
                case 3:
                    if (access) {
                        inSaldo();
                        pressEnter();
                    } else {
                        System.out.println("Silakan membuat akun terlebih dahulu");
                        pressEnter();
                    }
                    break;
                case 4:
                    if (access) {
                        outSaldo();
                        pressEnter();
                    } else {
                        System.out.println("Silakan membuat akun terlebih dahulu");
                        pressEnter();
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi...");
                    break;
                default:
                    System.out.println("Inputan yang And masukkan tidak valid");
                    pressEnter();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void buatRekening() {
        try {
            String temp = "";
            System.out.println("===== Menu Pembuatan Rekening =====");
            System.out.print("No. Rekening : ");
            noRek = input.readLine();
            System.out.print("Nama Nasabah : ");
            nasabah = input.readLine();
            System.out.print("Masukkan saldo awal (minimal 100k) : ");
            temp = input.readLine();
            saldo = Integer.parseInt(temp);

            if (saldo < saldoMinimal) {
                System.out.println("Saldo kurang dari saldo minimal");
                System.out.println("Gagal membuat rekening baru");
            } else {
                System.out.println("Berhasil membuat rekening baru");
                access = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void lihatSaldo() {
        System.out.println("===== Menampilkan Saldo =====");
        System.out.println("No. Rekening : " + noRek);
        System.out.println("Nama Nasabah : " + nasabah);
        System.out.println("Total Saldo  : " + saldo);
    }

    public void tambahSaldo(int plusSaldo) { // parameter formal
        System.out.println("==============================");
        System.out.println("Saldo sebelumnya    : " + saldo);
        System.out.println("Saldo yang ditambah : " + plusSaldo);
        this.saldo = this.saldo + plusSaldo;
        System.out.println("Total Saldo         : " + saldo);
        System.out.println("Berhasil menambah saldo");

        if (plusSaldo < 1000000) {
            System.out.println("Anda mendapatkan bolpoint cantik");
        } else if (plusSaldo < 10000000) {
            System.out.println("Anda mendapatkan voucher belanja 50k");
        } else if (plusSaldo > 10000000) {
            int kelipatan = plusSaldo / 10000000;
            int voucher = 50000 * kelipatan;
            System.out.println("Anda mendapatkan voucher belanja " + voucher);
        }
    }

    public void inSaldo() {
        String temp = "";
        int newSaldo = 0;
        System.out.println("===== Menu Tambah Saldo =====");
        System.out.println("No. Rekening : " + noRek);
        System.out.println("Nama Nasabah : " + nasabah);
        System.out.println("Total Saldo  : " + saldo);
        System.out.print("Masukkan saldo yang ditambah : ");
        try {
            temp = input.readLine();
            newSaldo = Integer.parseInt(temp);
        } catch (IOException e) {
            System.out.println(e);
        }
        tambahSaldo(newSaldo); // parameter aktual
    }

    public void tarikSaldo(int minSaldo) { // parameter formal
        System.out.println("==============================");
        System.out.println("Saldo sebelumnya   : " + saldo);
        System.out.println("Saldo yang ditarik : " + minSaldo);
        this.saldo = this.saldo - minSaldo;

        if (this.saldo < this.saldoMinimal) {
            this.saldo = this.saldo + minSaldo;
            System.out.println("Transaksi gagal");
        } else {
            System.out.println("Total Saldo   : " + saldo);
            System.out.println("Berhasil menarik saldo");
        }
    }

    public void outSaldo() {
        String temp = "";
        int newSaldo = 0;
        System.out.println("===== Menu Tarik Saldo =====");
        System.out.println("No. Rekening : " + noRek);
        System.out.println("Nama Nasabah : " + nasabah);
        System.out.println("Total Saldo  : " + saldo);
        System.out.print("Masukkan saldo yang ditarik : ");
        try {
            temp = input.readLine();
            newSaldo = Integer.parseInt(temp);
        } catch (IOException e) {
            System.out.println(e);
        }
        tarikSaldo(newSaldo); // parameter aktual
    }

    void pressEnter() {
        try {
            System.out.println("Tekan enter untuk melanjutkan");
            input.readLine();
            menu();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}