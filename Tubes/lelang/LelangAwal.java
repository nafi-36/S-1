package lelang;

import java.util.ArrayList;
import java.util.Scanner;

class Admin {
    private String username;
    private String password;

    public Admin() {
        this.username = "admin";
        this.password = "admin";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Pembeli {
    private int id;
    private String nama;

    public Pembeli(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }
}

class Barang {
    private int idBarang;
    private String namaBarang;
    private double hargaTawar;
    private String status;

    public Barang(int idBarang, String namaBarang, double hargaTawar, String status) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.hargaTawar = hargaTawar;
        this.status = status;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void sethargaTawar(double hargaTawar) {
        this.hargaTawar = hargaTawar;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double gethargaTawar() {
        return hargaTawar;
    }

    public String getStatus() {
        return status;
    }
}

class Penawaran {
    private int id;
    private String nama;
    private String barang;
    private double hargaTawar;

    public Penawaran(int id, String nama, String barang, double hargaTawar) {
        this.id = id;
        this.nama = nama;
        this.barang = barang;
        this.hargaTawar = hargaTawar;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getBarang() {
        return barang;
    }

    public double getHargaTawar() {
        return hargaTawar;
    }
}

class Lelang {
    Scanner input = new Scanner(System.in);
    // deklarasi arrayList
    ArrayList<Barang> arrBarang = new ArrayList<>();
    ArrayList<Pembeli> arrPembeli = new ArrayList<>();
    ArrayList<Penawaran> arrPenawaran = new ArrayList<>();
    ArrayList<Penawaran> arrPenawaran2 = new ArrayList<>();
    ArrayList<Penawaran> arrPemenang = new ArrayList<>();

    public static void main(String[] args) {
        Lelang l = new Lelang();
        l.menu();
    }

    private void menu() {
        int pilihan = 0;
        while (pilihan != 2) {
            System.out.println("===== SELAMAT DATANG DI APLIKASI LELANG =====");
            System.out.println("1. Login Admin");
            System.out.println("2. Keluar Aplikasi");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    loginAdmin();
                    menuUtama();
                    break;
                case 2:
                    System.out.println("Keluar dari aplikasi lelang...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Inputan tidak valid\n");
                    break;
            }
        }
    }

    public void loginAdmin() {
        System.out.println("===== Login Admin =====");
        System.out.print("Masukkan username : ");
        String un = input.next();
        System.out.print("Masukkan password : ");
        String pw = input.next();

        Admin a = new Admin();

        if (un.equals(a.getUsername()) && pw.equals(a.getPassword())) {
            System.out.println("Login berhasil");
            System.out.println("Selamat datang admin\n");
        } else {
            System.out.println("Username atau password tidak sesuai\n");
            menu();
        }
    }

    public void menuUtama() {
        int pilihan = 0;
        while (pilihan != 6) {
            System.out.println("\n===== Aplikasi Lelang =====");
            System.out.println("Menu Utama :");
            System.out.println("1. Menu barang");
            System.out.println("2. Menu pembeli");
            System.out.println("3. Mulai lelang");
            System.out.println("4. Lihat transaksi lelang");
            System.out.println("5. Lihat pemenang lelang");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    menuBarang();
                    break;
                case 2:
                    menuPembeli();
                    break;
                case 3:
                    if (!arrBarang.isEmpty() && !arrPembeli.isEmpty()) {
                        prosesLelang();
                    } else {
                        System.out.println("Data barang atau pembeli masih kosong");
                        menuUtama();
                    }
                    break;
                case 4:
                    if (!arrPenawaran2.isEmpty()) {
                        sortPenawaran();
                    } else {
                        System.out.println("Belum ada transaksi lelang");
                        menuUtama();
                    }
                    break;
                case 5:
                    if (!arrPemenang.isEmpty()) {
                        pemenangLelang();
                    } else {
                        System.out.println("Belum ada data pemenang");
                        menuUtama();
                    }
                    break;
                case 6:
                    System.out.println("Kembali ke menu awal...");
                    menu();
                    break;
                default:
                    break;
            }
        }
    }

    public void menuBarang() {
        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("\n===== Aplikasi Lelang =====");
            System.out.println("Menu Barang :");
            System.out.println("1. Tambahkan Barang Lelang");
            System.out.println("2. Lihat Data Barang Lelang");
            System.out.println("3. Edit Barang Lelang");
            System.out.println("4. Kembali");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    tambahBarang();
                    break;
                case 2:
                    if (!arrBarang.isEmpty()) {
                        lihatBarang();
                    } else {
                        System.out.println("Belum ada data yang ditambahkan");
                    }
                    break;
                case 3:
                    editBarang();
                    break;
                case 4:
                    System.out.println("Kembali ke menu utama...");
                    menuUtama();
                    break;
                default:
                    System.out.println("Inputan tidak valid");
                    break;
            }
        }
    }

    public void menuPembeli() {
        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("\n===== Aplikasi Lelang =====");
            System.out.println("Menu Pembeli :");
            System.out.println("1. Tambahkan Pembeli");
            System.out.println("2. Lihat Data Pembeli");
            System.out.println("3. Edit Pembeli");
            System.out.println("4. Kembali");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    tambahPembeli();
                    break;
                case 2:
                    if (!arrPembeli.isEmpty()) {
                        lihatPembeli();
                    } else {
                        System.out.println("Belum ada data yang ditambahkan");
                    }
                    break;
                case 3:
                    editPembeli();
                    break;
                case 4:
                    System.out.println("Kembali ke menu utama...");
                    menuUtama();
                    break;
                default:
                    System.out.println("Inputan tidak valid");
                    break;
            }
        }
    }

    public void tambahBarang() {
        System.out.println("\n===== Input Barang Lelang =====");
        System.out.print("Nama barang : ");
        String nama = input.next();
        System.out.print("Harga awal : ");
        double harga = input.nextDouble();
        System.out.print("Apakah barang bisa ditawar? [yes/no] : ");
        String status = input.next().toLowerCase();
        int id;
        if (!arrBarang.isEmpty()) {
            id = arrBarang.get(arrBarang.size() - 1).getIdBarang() + 1;
        } else {
            id = 1;
        }
        Barang b = new Barang(id, nama, harga, status);
        arrBarang.add(b);
        System.out.println("Barang berhasil ditambahkan");
    }

    public void tambahPembeli() {
        System.out.println("\n===== Input Pembeli =====");
        System.out.print("Nama : ");
        String nama = input.next();
        int id;
        if (!arrPembeli.isEmpty()) {
            id = arrPembeli.get(arrPembeli.size() - 1).getId() + 1;
        } else {
            id = 1;
        }
        Pembeli p = new Pembeli(id, nama);
        arrPembeli.add(p);
        System.out.println("Pembeli berhasil ditambahkan");
    }

    public void lihatBarang() {
        System.out.println("\n===== Daftar Barang Lelang =====");
        System.out.println("ID \tNama Barang \tHarga Awal \tStatus");
        for (int i = 0; i < arrBarang.size(); i++) {
            System.out.println(arrBarang.get(i).getIdBarang() + "\t" + arrBarang.get(i).getNamaBarang() + "\t\t" + "Rp."
                    + arrBarang.get(i).gethargaTawar() + "\t" + arrBarang.get(i).getStatus());
        }
    }

    public void lihatPembeli() {
        System.out.println("\n===== Daftar Pembeli =====");
        System.out.println("ID \tNama");
        for (int i = 0; i < arrPembeli.size(); i++) {
            System.out.println(arrPembeli.get(i).getId() + "\t" + arrPembeli.get(i).getNama());
        }
    }

    public void editBarang() {
        System.out.println("\n===== Edit Barang Lelang =====");
        System.out.print("Masukkan ID barang yang akan diedit : ");
        int id = input.nextInt();
        int ketemu = -1;
        for (int i = 0; i < arrBarang.size(); i++) {
            if (arrBarang.get(i).getIdBarang() == id) {
                ketemu = i;
                break;
            }
        }
        if (ketemu >= 0) {
            System.out.println("Pilihan yang dapat diedit :");
            System.out.println("1. Nama barang");
            System.out.println("2. Harga tawar");
            System.out.println("3. Status barang");
            System.out.print("Masukkan pilihan : ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama barang baru : ");
                    String newNama = input.next();
                    arrBarang.get(ketemu).setNamaBarang(newNama);
                    System.out.println("Nama barang berhasil diubah");
                    break;
                case 2:
                    System.out.print("Masukkan harga tawar baru : ");
                    double newHarga = input.nextDouble();
                    arrBarang.get(ketemu).sethargaTawar(newHarga);
                    System.out.println("Harga tawar berhasil diubah");
                    break;
                case 3:
                    System.out.print("Masukkan status barang baru [yes/no] : ");
                    String newStatus = input.next().toLowerCase();
                    arrBarang.get(ketemu).setStatus(newStatus);
                    System.out.println("Status barang berhasil diubah");
                    if (newStatus.equals("yes")) {
                        System.out.println("Barang bisa ditawar");
                    } else {
                        System.out.println("Barang tidak bisa ditawar");
                    }
                    break;
                default:
                    System.out.println("Inputan tidak valid");
                    break;
            }
        } else {
            System.out.println("Barang tidak ditemukan");
        }
    }

    public void editPembeli() {
        System.out.println("\n===== Edit Pembeli =====");
        System.out.print("Masukkan ID pembeli yang akan diedit : ");
        int id = input.nextInt();
        int idx = cekPembeli(id);
        if (idx >= 0) {
            System.out.print("Masukkan nama pembeli baru : ");
            String newNama = input.next();
            arrPembeli.get(idx).setNama(newNama);
            System.out.println("Nama pembeli berhasil diubah");
        } else {
            System.out.println("Barang tidak ditemukan");
        }
    }

    public void prosesLelang() {
        // proses lelang
        System.out.println("\nLELANG DIMULAI");
        lihatBarang();
        System.out.println("\nPilih barang yang akan di lelang");
        System.out.print("Masukkan id barang : ");
        int idb = input.nextInt();
        // cek status barang dr id yg di inputkan
        int idBarang = cekBarang(idb);
        int idPembeli;
        if (idBarang >= 0) {
            System.out.println("\nMulai penawaran untuk " + arrBarang.get(idBarang).getNamaBarang());
            double hargaTawar = arrBarang.get(idBarang).gethargaTawar();
            // perulangan / looping untuk penawaran
            String jwb;
            do {
                // menampilkan data pembeli - lihat pembeli()
                lihatPembeli();
                System.out.print("\nMasukkan id pembeli : ");
                // inputan id pembeli
                int idp = input.nextInt();
                // cek id pembeli
                idPembeli = cekPembeli(idp);
                if (idPembeli >= 0) {
                    System.out.println("Selamat datang " + arrPembeli.get(idPembeli).getNama());
                    if (!arrPenawaran.isEmpty()) {
                        System.out.println("Harga tertinggi saat ini: "
                                + arrPenawaran.get(arrPenawaran.size() - 1).getHargaTawar());
                    }
                    System.out.print("Masukkan harga tawar barang : ");
                    // inputan harga penawaran
                    double penawaran = input.nextDouble();
                    // cek penawaran
                    boolean tawar;
                    if (penawaran > hargaTawar) {
                        tawar = cekPenawaran(penawaran, idBarang);
                        if (tawar) {
                            // add id & harga penawaran ke arrayList penawaran
                            Penawaran pnwrn = new Penawaran(arrPembeli.get(idPembeli).getId(),
                                    arrPembeli.get(idPembeli).getNama(), arrBarang.get(idBarang).getNamaBarang(),
                                    penawaran);
                            arrPenawaran.add(pnwrn);
                            arrPenawaran2.add(pnwrn);
                        } else {
                            System.out.println("Tawaran terlalu rendah. Harga tertinggi saat ini: "
                                    + arrPenawaran.get(arrPenawaran.size() - 1).getHargaTawar());
                        }
                    } else {
                        System.out.println("Tawaran harus lebih tinggi dari harga tawar barang");
                    }
                } else {
                    System.out.println("Pembeli tidak ditemukan");
                }
                System.out.print("Apakah ada harga penawaran terbaru? [yes/no] : ");
                jwb = input.next();
            } while (jwb.equals("yes"));
            if (!arrPenawaran.isEmpty()) {
                System.out.println(
                        "\nLelang ditutup! " + arrBarang.get(idBarang).getNamaBarang() + " sudah tidak dapat ditwawar");
                arrBarang.get(idBarang).setStatus("no");
                transaksiLelang();
                int idx = arrPenawaran.size() - 1;
                System.out.println("\nPemenang lelang " + arrPenawaran.get(idx).getBarang() + " adalah "
                        + arrPenawaran.get(idx).getNama() + " dengan harga tawar "
                        + arrPenawaran.get(idx).getHargaTawar());
                Penawaran pemenang = new Penawaran(arrPenawaran.get(idx).getId(), arrPenawaran.get(idx).getNama(),
                        arrPenawaran.get(idx).getBarang(), arrPenawaran.get(idx).getHargaTawar());
                arrPemenang.add(pemenang);
            }
        } else {
            System.out.println("Barang tidak bisa ditawar");
        }
        arrPenawaran.clear();
        menuUtama();
    }

    public int cekBarang(int id) {
        int ketemu = -1;
        for (int i = 0; i < arrBarang.size(); i++) {
            if (arrBarang.get(i).getIdBarang() == id && arrBarang.get(i).getStatus().equals("yes")) {
                ketemu = i;
                break;
            }
        }
        return ketemu;
    }

    public int cekPembeli(int id) {
        int ketemu = -1;
        for (int i = 0; i < arrPembeli.size(); i++) {
            if (arrPembeli.get(i).getId() == id) {
                ketemu = i;
                break;
            }
        }
        return ketemu;
    }

    public boolean cekPenawaran(double penawaran, int idBarang) {
        double penawaran1;
        if (!arrPenawaran.isEmpty()) {
            penawaran1 = arrPenawaran.get(arrPenawaran.size() - 1).getHargaTawar();
        } else {
            penawaran1 = arrBarang.get(idBarang).gethargaTawar();
        }

        if (penawaran > penawaran1) {
            return true;
        } else {
            return false;
        }
        // double penawaran1 = arrBarang.get(idBarang).gethargaTawar();
        // if (penawaran > penawaran1) {
        // return true;
        // } else {
        // return false;
        // }
    }

    public void transaksiLelang() {
        // urutan data transaki penawaran ascending & descending
        System.out.println("\n===== Hasil Penawaran Lelang =====");
        System.out.println("ID \tNama \tHarga Tawar");
        for (int i = 0; i < arrPenawaran.size(); i++) {
            System.out.println(
                    arrPenawaran.get(i).getId() + "\t" + arrPembeli.get(arrPenawaran.get(i).getId() - 1).getNama()
                            + "\t" + arrPenawaran.get(i).getHargaTawar());
        }
    }

    public void sortPenawaran() {
        System.out.println("\nHasil Transaksi Lelang Berdasarkan Penawaran Tertinggi"); // descending
        for (int i = 0; i < arrPenawaran2.size() - 1; i++) {
            int mindex = i;
            for (int j = i + 1; j < arrPenawaran2.size(); j++) {
                if (arrPenawaran2.get(j).getHargaTawar() > arrPenawaran2.get(i).getHargaTawar()) {
                    mindex = j;
                }
            }
            Penawaran temp = arrPenawaran2.get(mindex);
            arrPenawaran2.set(mindex, arrPenawaran2.get(i));
            arrPenawaran2.set(i, temp);
        }

        System.out.println("===== Histori Penawaran Lelang =====");
        System.out.println("ID \tNama \tBarang \tHarga Tawar");
        for (int i = 0; i < arrPenawaran2.size(); i++) {
            System.out.println(arrPenawaran2.get(i).getId() + "\t" + arrPenawaran2.get(i).getNama() + "\t"
                    + arrPenawaran2.get(i).getBarang() + "\t" + arrPenawaran2.get(i).getHargaTawar());
        }
    }

    public void pemenangLelang() {
        // max / penawaran paling tinggi
        System.out.println("\n===== Histori Pemenang Lelang =====");
        System.out.println("ID \tNama \tBarang \tHarga Tawar");
        for (int i = 0; i < arrPemenang.size(); i++) {
            System.out.println(arrPemenang.get(i).getId() + "\t" + arrPemenang.get(i).getNama() + "\t"
                    + arrPemenang.get(i).getBarang() + "\t" + arrPemenang.get(i).getHargaTawar());
        }
    }
}