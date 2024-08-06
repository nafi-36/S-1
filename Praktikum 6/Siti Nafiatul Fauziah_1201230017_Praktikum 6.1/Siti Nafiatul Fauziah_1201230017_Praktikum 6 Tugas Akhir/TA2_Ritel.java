import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class TA2_Ritel {
    public static void main(String[] args) {
        TA2_Ritel ritel = new TA2_Ritel();
        ritel.menu();
    }

    String kode;
    String nama;
    int stock;
    int hargaJual;

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    boolean next = true;

    public void menu() {
        do {
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
                        System.out.println();
                        break;
                    case 2:
                        jualBarang();
                        System.out.println();
                        break;
                    case 3:
                        beliBarang();
                        System.out.println();
                        break;
                    case 4:
                        tampilBarang();
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Keluar dari aplikasi...");
                        next = false;
                        break;
                    default:
                        System.out.println("Inputan yang And masukkan tidak valid");
                        System.out.println();
                }
            } catch (IOException e) {
                System.out.print("Error bagian menu");
            }
        } while (next);

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

    // void pressEnter() {
    //     try {
    //         System.out.println("Tekan enter untuk melanjutkan");
    //         input.readLine();
    //         menu();
    //     } catch (Exception e) {
    //         System.out.println(e);
    //     }
    // }
}