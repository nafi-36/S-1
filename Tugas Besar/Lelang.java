import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

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
    private String username;
    private String password;

    public Pembeli(int id, String nama, String username, String password) {
        this.id = id;
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
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
    private int idPembeli;
    private int idBarang;
    private String nama;
    private String barang;
    private double hargaTawar;

    public Penawaran(int idPembeli, int idBarang, String nama, String barang, double hargaTawar) {
        this.idPembeli = idPembeli;
        this.idBarang = idBarang;
        this.nama = nama;
        this.barang = barang;
        this.hargaTawar = hargaTawar;
    }

    public int getIdPembeli() {
        return idPembeli;
    }

    public int getIdBarang() {
        return idBarang;
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
    private Pembeli pembeliLoggedIn;

    public Lelang() {
        // data dummy pembeli
        Pembeli pembeli1 = new Pembeli(1, "Jay", "jay123", "jay123");
        Pembeli pembeli2 = new Pembeli(2, "Joe", "joe123", "joe123");
        arrPembeli.add(pembeli1);
        arrPembeli.add(pembeli2);

        // data dummy barang
        Barang barang1 = new Barang(1, "Laptop", 1000, "yes");
        Barang barang2 = new Barang(2, "Hp", 350, "yes");
        arrBarang.add(barang1);
        arrBarang.add(barang2);
    }

    public static void main(String[] args) {
        Lelang l = new Lelang();
        l.menu();
    }

    private void menu() {
        int pilihan = 0;
        while (pilihan != 2) {
            System.out.println("\n===== SELAMAT DATANG DI APLIKASI LELANG =====");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Pembeli");
            System.out.println("3. Register Pembeli");
            System.out.println("4. Keluar Aplikasi");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    loginAdmin();
                    break;
                case 2:
                    loginPembeli();
                    break;
                case 3:
                    registerPembeli();
                    break;
                case 4:
                    System.out.println("\nKeluar dari aplikasi lelang...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInputan tidak valid");
                    break;
            }
        }
    }

    public void loginAdmin() {
        boolean longgins = false;

        while (!longgins) {
            System.out.println("\n===== Login Admin =====");
            System.out.print("Masukkan username : ");
            String un = input.next();
            System.out.print("Masukkan password : ");
            String pw = input.next();
            Admin admin = new Admin();

            if (un.equals(admin.getUsername()) && pw.equals(admin.getPassword())) {
                System.out.println("\nLogin Admin berhasil");
                System.out.println("Selamat datang Admin!");
                menuAdmin();
                longgins = true;
            } else {
                System.out.println("\nUsername atau password Admin tidak sesuai");
            }
        }
    }

    public void loginPembeli() {
        boolean longgins = false;

        while (!longgins) {
            System.out.println("\n===== Login Pembeli =====");
            System.out.print("Masukkan username : ");
            String un = input.next();
            System.out.print("Masukkan password : ");
            String pw = input.next();
            Pembeli p = cekLoginPembeli(un, pw);

            if (p != null) {
                pembeliLoggedIn = p;
                System.out.println("\nLogin Pembeli berhasil");
                System.out.println("Selamat datang " + p.getNama() + "!");
                longgins = true;
                menuPembeli();
            } else {
                System.out.println("\nUsername atau password Pembeli tidak sesuai");
            }
        }
    }

    public Pembeli cekLoginPembeli(String username, String password) {
        for (Pembeli p : arrPembeli) {
            if (p.getUsername().equals(username) && p.getPassword().equals(password)) {
                return p;
            }
        }
        return null;
    }

    public void registerPembeli() {
        System.out.println("\n===== Input Data Pembeli =====");
        System.out.print("Nama : ");
        String nama = input.next();
        System.out.print("Username : ");
        String username = input.next();
        System.out.print("Password : ");
        String password = input.next();
        int id;
        if (!arrPembeli.isEmpty()) {
            id = arrPembeli.get(arrPembeli.size() - 1).getId() + 1;
        } else {
            id = 1;
        }
        for (Pembeli pembeli : arrPembeli) {
            if (pembeli.getUsername().equals(username)) {
                System.out.println("Username sudah digunakan, masukkan username yang berbeda");
                menu();
            }
        }
        Pembeli p = new Pembeli(id, nama, username, password);
        arrPembeli.add(p);
        System.out.println("Registrasi pembeli berhasil");
        menu();
    }

    public void menuAdmin() {
        int pilihan = 0;
        while (pilihan != 6) {
            System.out.println("\n===== Aplikasi Lelang =====");
            System.out.println("Menu Admin :");
            System.out.println("1. Menu barang");
            System.out.println("2. Lihat data pembeli");
            System.out.println("3. Lihat transaksi lelang");
            System.out.println("4. Lihat pemenang lelang");
            System.out.println("5. Logout");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    menuBarang();
                    break;
                case 2:
                    if (!arrPembeli.isEmpty()) {
                        lihatPembeli();
                    } else {
                        System.out.println("\nData pembeli masih kosong");
                        menuAdmin();
                    }
                    break;
                case 3:
                    if (!arrPenawaran.isEmpty()) {
                        menuTransaksi();
                    } else {
                        System.out.println("\nBelum ada transaksi lelang");
                        menuAdmin();
                    }
                    break;
                case 4:
                    if (!arrPenawaran.isEmpty()) {
                        pemenangLelang();
                    } else {
                        System.out.println("\nBelum ada transaksi lelang");
                        menuAdmin();
                    }
                    break;
                case 5:
                    System.out.println("\nAdmin logout...");
                    menu();
                    break;
                default:
                    System.out.println("\nInputan tidak valid");
                    break;
            }
        }
    }

    public void menuPembeli() {
        int pilihan = 0;
        while (pilihan != 6) {
            System.out.println("\n===== Aplikasi Lelang =====");
            System.out.println("Menu Pembeli :");
            System.out.println("1. Setting profile");
            System.out.println("2. Lihat barang lelang");
            System.out.println("3. Tawar barang");
            System.out.println("4. Informasi pemenang");
            System.out.println("5. Logout");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    settingProfile();
                    break;
                case 2:
                    if (!arrBarang.isEmpty()) {
                        lihatBarangAvailable();
                    } else {
                        System.out.println("\nBelum ada data barang yang ditambahkan");
                    }
                    break;
                case 3:
                    if (!arrBarang.isEmpty()) {
                        prosesLelang();
                    } else {
                        System.out.println("\nTidak ada barang lelang");
                        menuPembeli();
                    }
                    break;
                case 4:
                    if (!arrPenawaran.isEmpty()) {
                        informasiPemenang();
                    } else {
                        System.out.println("\nBelum ada transaksi lelang");
                        menuPembeli();
                    }
                    break;
                case 5:
                    System.out.println("\nPembeli logout...");
                    menu();
                    break;
                default:
                    System.out.println("\nInputan tidak valid");
                    break;
            }
        }
    }

    public void menuBarang() {
        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("\n===== Menu Barang =====");
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
                        System.out.println("\nBelum ada data barang yang ditambahkan");
                    }
                    break;
                case 3:
                    editBarang();
                    break;
                case 4:
                    System.out.println("\nKembali ke menu utama...");
                    menuAdmin();
                    break;
                default:
                    System.out.println("\nInputan tidak valid");
                    break;
            }
        }
    }

    public void menuTransaksi() {
        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("\n===== Menu Transaksi =====");
            System.out.println("1. Lihat Penawaran Perbarang");
            System.out.println("2. Lihat Laporan Semua Penawaran");
            System.out.println("3. Lihat Berdasarkan Penawaran Tertinggi");
            System.out.println("4. Kembali");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    penawaranPerbarang();
                    break;
                case 2:
                    lihatSemuaPenawaran();
                    break;
                case 3:
                    sortPenawaran();
                    break;
                case 4:
                    System.out.println("\nKembali ke menu utama...");
                    menuAdmin();
                    break;
                default:
                    System.out.println("\nInputan tidak valid");
                    break;
            }
        }
    }

    public void settingProfile() {
        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("\n===== Setting Profile =====");
            System.out.println("1. Lihat profile");
            System.out.println("2. Edit profile");
            System.out.println("3. Kembali");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    lihatProfile();
                    break;
                case 2:
                    editProfile();
                    break;
                case 3:
                    System.out.println("\nKembali ke menu pembeli...");
                    menuPembeli();
                    break;
                default:
                    System.out.println("\nInputan tidak valid");
                    break;
            }
        }
    }

    public void tambahBarang() {
        boolean ulang = true;
        System.out.println("\n===== Input Barang Lelang =====");
        while (ulang) {
            System.out.print("Nama barang : ");
            String nama = input.next().toLowerCase(); // Mengubah input menjadi huruf kecil

            boolean barangSudahAda = false;
            for (Barang p : arrBarang) {
                if (p.getNamaBarang().toLowerCase().equals(nama)) {
                    barangSudahAda = true;
                    break;
                }
            }

            if (!barangSudahAda) {
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
                return;
            } else {
                System.out.println("\nNama Barang Sudah Ada!\n");
            }
        }
    }

    public void lihatBarang() {
        System.out.println("\n===== Daftar Barang Lelang =====");
        System.out.println("ID \tNama Barang \tHarga Awal \tStatus");
        for (int i = 0; i < arrBarang.size(); i++) {
            System.out.println(arrBarang.get(i).getIdBarang() + "\t" + arrBarang.get(i).getNamaBarang() + "\t\t"
                    + arrBarang.get(i).gethargaTawar() + "\t\t" + arrBarang.get(i).getStatus());
        }
    }

    public void lihatBarangAvailable() {
        System.out.println("\n===== Barang yang Available =====");
        System.out.println("ID \tNama Barang \tHarga Awal");
        for (int i = 0; i < arrBarang.size(); i++) {
            if (arrBarang.get(i).getStatus().equals("yes")) {
                System.out.println(arrBarang.get(i).getIdBarang() + "\t" + arrBarang.get(i).getNamaBarang() + "\t\t"
                        + arrBarang.get(i).gethargaTawar());
            }
        }
    }

    public void editBarang() {
        lihatBarang();
        System.out.println("\n===== Edit Barang Lelang =====");
        System.out.print("Masukkan ID barang yang akan diedit : ");
        int id = input.nextInt();
        int ketemu = cekBarang(id);
        if (ketemu >= 0) {
            System.out.println("Pilihan yang dapat diedit :");
            System.out.println("1. Nama barang");
            System.out.println("2. Harga tawar");
            System.out.println("3. Status barang");
            System.out.print("Masukkan pilihan : ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan nama barang baru : ");
                    String newNama = input.next();
                    boolean barangSudahAda = false;
                    for (Barang p : arrBarang) {
                        if (p.getNamaBarang().toLowerCase().equals(newNama)) {
                            barangSudahAda = true;
                            break;
                        }
                    }
                    if (!barangSudahAda) {
                        arrBarang.get(ketemu).setNamaBarang(newNama);
                        System.out.println("Nama barang berhasil diubah");
                    } else {
                        System.out.println("Nama barang sudah ada!");
                    }
                    break;
                case 2:
                    System.out.print("\nMasukkan harga tawar baru : ");
                    double newHarga = input.nextDouble();
                    arrBarang.get(ketemu).sethargaTawar(newHarga);
                    System.out.println("Harga tawar berhasil diubah");
                    break;
                case 3:
                    System.out.print("\nMasukkan status barang baru [yes/no] : ");
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
                    System.out.println("\nInputan tidak valid");
                    break;
            }
        } else {
            System.out.println("\nBarang tidak ditemukan");
        }
    }

    public void lihatPembeli() {
        System.out.println("\n===== Daftar Pembeli =====");
        System.out.println("ID \tNama \tUsername");
        for (int i = 0; i < arrPembeli.size(); i++) {
            System.out.println(arrPembeli.get(i).getId() + "\t" + arrPembeli.get(i).getNama() + "\t"
                    + arrPembeli.get(i).getUsername());
        }
    }

    public void lihatProfile() {
        System.out.println("\n===== Profile =====");
        System.out.println("ID : " + pembeliLoggedIn.getId());
        System.out.println("Nama : " + pembeliLoggedIn.getNama());
        System.out.println("Username : " + pembeliLoggedIn.getUsername());
        System.out.println("Password : " + pembeliLoggedIn.getPassword());
    }

    public void editProfile() {
        System.out.println("\n===== Edit Profile =====");
        int idx = pembeliLoggedIn.getId() - 1;
        System.out.println("Pilihan yang dapat diedit :");
        System.out.println("1. Nama");
        System.out.println("2. Username");
        System.out.println("3. Password");
        System.out.print("Masukkan pilihan : ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("\nMasukkan nama baru : ");
                String newNama = input.next();
                arrPembeli.get(idx).setNama(newNama);
                System.out.println("Nama berhasil diubah");
                break;
            case 2:
                System.out.print("\nMasukkan username baru : ");
                String newUsername = input.next();
                arrPembeli.get(idx).setUsername(newUsername);
                System.out.println("Username berhasil diubah");
                break;
            case 3:
                System.out.print("\nMasukkan password baru : ");
                String newPassword = input.next();
                arrPembeli.get(idx).setPassword(newPassword);
                System.out.println("Password berhasil diubah");
                break;
            default:
                System.out.println("\nInputan tidak valid");
                break;
        }
    }

    public void prosesLelang() {
        System.out.println("\n===== ### Lelang ### =====");
        do {
            // menampilkan barang yang bisa ditawar
            lihatBarangAvailable();
            // memilih barang
            System.out.print("\nMasukkan ID barang yang ingin ditawar : ");
            int idBarang = input.nextInt();
            int idxBarang = cekBarangAvailable(idBarang);
            if (idxBarang >= 0) {
                // menampilkan penawaran sebelumnya
                System.out.println("\n==== Track Penawaran " + arrBarang.get(idxBarang).getNamaBarang() + " ====");
                for (Penawaran pnwrn : arrPenawaran) {
                    if (pnwrn.getIdBarang() == idxBarang) {
                        System.out.println();
                        System.out.println("Pembeli          : " + pnwrn.getNama());
                        System.out.println("Harga tawar      : " + pnwrn.getHargaTawar());
                    }
                }
                // input penawaran
                System.out.print("\nMasukkan harga tawar Anda : ");
                double penawaran = input.nextDouble();
                // cek apakah penawaran valid
                boolean cekPenawaran = cekPenawaran(penawaran, idxBarang);
                if (cekPenawaran) {
                    // menambahkan penawaran ke arrPenawaran
                    Penawaran p = new Penawaran(pembeliLoggedIn.getId(), idxBarang, pembeliLoggedIn.getNama(),
                            arrBarang.get(idxBarang).getNamaBarang(), penawaran);
                    arrPenawaran.add(p);
                    System.out.println("Penawaran berhasil");
                } else {
                    System.out.println("Penawaran tidak berhasil");
                    System.out.println("Penawaran Anda terlalu rendah");
                }
            } else {
                System.out.println("\nBarang tidak ditemukan");
            }
            System.out.print("\nApakah Anda ingin melakukan penawaran lagi? [yes/no] : ");
            String jawab = input.next().toLowerCase();
            if (!jawab.equals("yes")) {
                break;
            }
        } while (true);
        System.out.println("\nTerimakasih sudah berpartisipasi");
        menuPembeli();
    }

    public int cekBarang(int id) {
        int ketemu = -1;
        for (int i = 0; i < arrBarang.size(); i++) {
            if (arrBarang.get(i).getIdBarang() == id) {
                ketemu = i;
                break;
            }
        }
        return ketemu;
    }

    public int cekBarangAvailable(int id) {
        int ketemu = -1;
        for (int i = 0; i < arrBarang.size(); i++) {
            if (arrBarang.get(i).getIdBarang() == id && arrBarang.get(i).getStatus().equals("yes")) {
                ketemu = i;
                break;
            }
        }
        return ketemu;
    }

    public boolean cekPenawaran(double penawaran, int idBarang) {
        double penawaranTertinggi = 0;
        // cari penawaran terakhir untuk barang yang dipilih
        for (Penawaran pnwrn : arrPenawaran) {
            if (pnwrn.getIdBarang() == idBarang && pnwrn.getHargaTawar() > penawaranTertinggi) {
                penawaranTertinggi = pnwrn.getHargaTawar();
            }
        }
        // jika penawaran masih kosong, harga awal barang = penawaran tertinggi
        if (penawaranTertinggi == 0) {
            penawaranTertinggi = arrBarang.get(idBarang).gethargaTawar();
        }

        if (penawaran > penawaranTertinggi) {
            return true;
        } else {
            return false;
        }
    }

    public void penawaranPerbarang() {
        System.out.println("\n===== Lihat Penawaran Perbarang =====");
        lihatBarang();
        System.out.print("\nMasukkan ID barang : ");
        int id = input.nextInt();
        int ketemu = cekBarang(id);
        if (ketemu >= 0) {
            System.out.println("\n===== Laporan Penawaran " + arrBarang.get(ketemu).getNamaBarang() + " =====");
            System.out.println("ID \tNama \tHarga Tawar");
            double totalPenawaranPerBarang = 0;
            for (Penawaran penawaran : arrPenawaran) {
                if (penawaran.getIdBarang() == ketemu) {
                    System.out.println(penawaran.getIdPembeli() + "\t" + penawaran.getNama() +
                            "\t" + penawaran.getHargaTawar());
                    totalPenawaranPerBarang += penawaran.getHargaTawar();
                }
            }
            System.out.println("======================================");
            System.out.println("Total Penawaran " + arrBarang.get(ketemu).getNamaBarang() +
                    " : " + totalPenawaranPerBarang);
        } else {
            System.out.println("Barang tidak ditemukan");
        }
    }

    public void lihatSemuaPenawaran() {
        System.out.println("\n===== Laporan Semua Penawaran =====");
        double totalPenawaran = 0;
        for (Penawaran penawaran : arrPenawaran) {
            System.out.println("ID pembeli    : " + penawaran.getIdPembeli());
            System.out.println("Nama pembeli  : " + penawaran.getNama());
            System.out.println("Barang lelang : " + arrBarang.get(penawaran.getIdBarang()).getNamaBarang());
            System.out.println("Harga tawar   : " + penawaran.getHargaTawar());
            System.out.println();
            totalPenawaran += penawaran.getHargaTawar();
        }
        System.out.println("===================================");
        System.out.println("Total Penawaran : " + totalPenawaran);
    }

    public void sortPenawaran() {
        System.out.println("\nHasil Transaksi Lelang Berdasarkan Penawaran Tertinggi");
        // collection sorting, mengurutkan secara descending berdasarkan harga tawar
        Collections.sort(arrPenawaran, new Comparator<Penawaran>() {
            @Override
            public int compare(Penawaran p1, Penawaran p2) {
                return Double.compare(p2.getHargaTawar(), p1.getHargaTawar());
            }
        });
        System.out.println("===== Histori Penawaran Lelang =====");
        System.out.println("ID \tNama \tBarang \t\tHarga Tawar");
        for (int i = 0; i < arrPenawaran.size(); i++) {
            System.out.println(arrPenawaran.get(i).getIdPembeli() + "\t" + arrPenawaran.get(i).getNama() + "\t"
                    + arrPenawaran.get(i).getBarang() + "\t\t" + arrPenawaran.get(i).getHargaTawar());
        }
    }

    public void pemenangLelang() {
        lihatBarang();
        System.out.print("\nMasukkan ID barang yang ingin Anda cek : ");
        int idBarang = input.nextInt();
        int idxBarang = cekBarang(idBarang);
        if (idxBarang >= 0) {
            if (arrBarang.get(idxBarang).getStatus().equals("no")) {
                Penawaran pemenang = cariPemenang(idxBarang);
                if (pemenang != null) {
                    System.out.println("\n===== Informasi Pemenang =====");
                    System.out.println("Barang        : " + pemenang.getBarang());
                    System.out.println("ID pemenang   : " + pemenang.getIdPembeli());
                    System.out.println("Nama pemenang : " + pemenang.getNama());
                    System.out.println("Harga tawar   : " + pemenang.getHargaTawar());
                } else {
                    System.out.println("Maaf, belum ada pemenang untuk barang ini");
                }
            } else {
                System.out.println("Pemenang belum ditentukan");
            }
        } else {
            System.out.println("Barang tidak ditemukan");
        }
    }

    private Penawaran cariPemenang(int idBrg) {
        Penawaran pemenang = null;
        double hargaTertinggi = 0;
        for (Penawaran penawaran : arrPenawaran) {
            if (penawaran.getIdBarang() == idBrg && penawaran.getHargaTawar() > hargaTertinggi) {
                hargaTertinggi = penawaran.getHargaTawar();
                pemenang = penawaran;
            }
        }
        return pemenang;
    }

    public void informasiPemenang() {
        lihatBarang();
        System.out.print("\nMasukkan ID barang yang ingin Anda cek : ");
        int idBarang = input.nextInt();
        int idxBarang = cekBarang(idBarang);
        if (idxBarang >= 0) {
            if (arrBarang.get(idxBarang).getStatus().equals("no")) {
                Penawaran pemenang = cariPemenang(idxBarang);
                if (pemenang != null && pemenang.getIdPembeli() == pembeliLoggedIn.getId()) {
                    System.out.println("Informasi pemenang dengan penawaran tertinggi saat ini : ");
                    System.out
                            .println("\nSELAMAT, ANDA MEMENANGKAN LELANG " + pemenang.getBarang().toUpperCase() + "!");
                    System.out.println("Dengan harga tawar : " + pemenang.getHargaTawar());
                } else {
                    System.out.println("\nMaaf, Anda belum menang");
                }
            } else {
                System.out.println("Pemenang belum ditentukan");
            }
        } else {
            System.out.println("Barang tidak ditemukan");
        }
    }
}