import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TA2_Gabungan {
    public static void main(String[] args) {
        TA2_Gabungan apk = new TA2_Gabungan();
        apk.menu();
    }

    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    void menu() {
        RitelAkhir rta = new RitelAkhir();
        BankAkhir baa = new BankAkhir();
        boolean next = true;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        do {
            cls();
            try {
                System.out.println("===== APLIKASI UTAMA =====");
                System.out.println("Menu Utama");
                System.out.println("1. Aplikasi Ritel");
                System.out.println("2. Aplikasi Bank");
                System.out.println("3. Keluar dari aplikasi");
                System.out.print("Masukkan pilihan anda [1-3] : ");

                String temp = input.readLine();
                int pilihan = Integer.parseInt(temp);

                switch (pilihan) {
                    case 1:
                        cls();
                        rta.menu();
                        break;
                    case 2:
                        cls();
                        baa.menu();
                        break;
                    case 3:
                        cls();
                        System.out.println("Keluar dari aplikasi...");
                        next = false;
                        break;
                    default:
                        System.out.println("Inputan yang And masukkan tidak valid");
                        pressEnter();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (next);
    }

    static void pressEnter() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Tekan enter untuk melanjutkan");
            input.readLine();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class RitelAkhir extends TA2_Gabungan {
    String kode;
    String nama;
    int stock;
    int hargaJual;

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    void menu() {
        try {
            System.out.println("===== APLIKASI RITEL =====");
            System.out.println("Menu Utama");
            System.out.println("1. Penambahan barang");
            System.out.println("2. Penjualan (pengurangan) stock barang");
            System.out.println("3. Pembelian (penambahan) stock barang");
            System.out.println("4. Tampilkan data barang");
            System.out.println("5. Keluar dari aplikasi");
            System.out.print("Masukkan pilihan anda [1-5] : ");

            String temp = input.readLine();
            int pilihan = Integer.parseInt(temp);

            switch (pilihan) {
                case 1:
                    tambahBarang();
                    pressEnter1();
                    break;
                case 2:
                    jualBarang();
                    pressEnter1();
                    break;
                case 3:
                    beliBarang();
                    pressEnter1();
                    break;
                case 4:
                    tampilBarang();
                    pressEnter1();
                    break;
                case 5:
                    super.menu();
                    break;
                default:
                    System.out.println("Inputan yang And masukkan tidak valid");
                    pressEnter1();
            }
        } catch (IOException e) {
            System.out.print("Error bagian menu");
        }
    }

    public void tambahBarang() {
        try {
            String temp = "";
            System.out.println("===== Menu Penambahan Barang =====");
            System.out.print("Kode Barang : ");
            kode = input.readLine();
            System.out.print("Nama Barang : ");
            nama = input.readLine();
            System.out.print("Stock Awal  : ");
            temp = input.readLine();
            stock = Integer.parseInt(temp);
            System.out.print("Harga Jual  : ");
            temp = input.readLine();
            hargaJual = Integer.parseInt(temp);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void tampilBarang() {
        System.out.println("===== Menampilkan Data Barang =====");
        System.out.println("Kode Barang  : " + kode);
        System.out.println("Nama Barang  : " + nama);
        System.out.println("Jumlah Stok  : " + stock);
        System.out.println("Harga Jual   : " + hargaJual);
        warning(this.stock); // penambahan method warning
    }

    public void outBarang(int jual) {
        System.out.println("==============================");
        System.out.println("Stok awal   : " + stock);
        System.out.println("Pengurangan : " + jual);

        if ((stock - jual) < 0) {
            System.out.println("Jumlah stock tidak mencukupi");
            System.out.println("Transaksi dibatalkan");
        } else {
            this.stock = this.stock - jual;
            System.out.println("Stok akhir  : " + stock);
            System.out.println("Data telah diubah");
        }
    }

    public void jualBarang() {
        String temp = "";
        int minStock = 0;
        System.out.println("===== Menu Penjualan Barang =====");
        System.out.println("Kode Barang  : " + kode);
        System.out.println("Nama Barang  : " + nama);
        System.out.println("Jumlah Stok  : " + stock);
        System.out.print("Masukkan stock barang yang dijual (dikurangi) : ");
        try {
            temp = input.readLine();
            minStock = Integer.parseInt(temp);
        } catch (IOException e) {
            System.out.println(e);
        }
        outBarang(minStock); // parameter aktual
    }

    public void addBarang(int beli) {
        System.out.println("==============================");
        System.out.println("Stok awal  : " + stock);
        System.out.println("Penambahan : " + beli);
        this.stock = this.stock + beli;
        System.out.println("Stok akhir : " + stock);
        System.out.println("Data telah diubah");
    }

    public void beliBarang() {
        String temp = "";
        int addStock = 0;
        System.out.println("===== Menu Pembelian Barang =====");
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + nama);
        System.out.println("Jumlah Stok : " + stock);
        System.out.print("Masukkan stock barang yang dibeli (ditambah) : ");
        try {
            temp = input.readLine();
            addStock = Integer.parseInt(temp);
        } catch (IOException e) {
            System.out.println(e);
        }
        addBarang(addStock); // parameter aktual
    }

    // deklarasi method warning
    void warning(int stock) {
        if (stock > 5) {

        } else if (stock <= 5) {
            System.out.println("Barang sudah hampir habis, segera lakukan penambahan stok");
        }
    }

    void pressEnter1() {
        try {
            System.out.println("Tekan enter untuk melanjutkan");
            input.readLine();
            menu();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class BankAkhir extends TA2_Gabungan {
    String noRek;
    String nasabah;
    int saldo;
    int saldoMinimal = 100000;
    boolean access = false;

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    void menu() {
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
                    pressEnter2();
                    break;
                case 2:
                    if (access) {
                        lihatSaldo();
                        pressEnter2();
                    } else {
                        System.out.println("Silakan membuat akun terlebih dahulu");
                        pressEnter2();
                    }
                    break;
                case 3:
                    if (access) {
                        inSaldo();
                        pressEnter2();
                    } else {
                        System.out.println("Silakan membuat akun terlebih dahulu");
                        pressEnter2();
                    }
                    break;
                case 4:
                    if (access) {
                        outSaldo();
                        pressEnter2();
                    } else {
                        System.out.println("Silakan membuat akun terlebih dahulu");
                        pressEnter2();
                    }
                    break;
                case 5:
                    super.menu();
                    break;
                default:
                    System.out.println("Inputan yang And masukkan tidak valid");
                    pressEnter2();
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

    void pressEnter2() {
        try {
            System.out.println("Tekan enter untuk melanjutkan");
            input.readLine();
            menu();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}