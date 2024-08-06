import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    int nim;
    String nama;
    String asalSekolah;
    String alamatAsal;
    String alamatSekarang;

    public Mahasiswa(int nim, String nama, String asalSekolah, String alamatAsal, String alamatSekarang) {
        this.nim = nim;
        this.nama = nama;
        this.asalSekolah = asalSekolah;
        this.alamatAsal = alamatAsal;
        this.alamatSekarang = alamatSekarang;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAsalSekolah(String asalSekolah) {
        this.asalSekolah = asalSekolah;
    }

    public void setAlamatAsal(String alamatAsal) {
        this.alamatAsal = alamatAsal;
    }

    public void setAlamatSekarang(String alamatSekarang) {
        this.alamatSekarang = alamatSekarang;
    }

    public int getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAsalSekolah() {
        return asalSekolah;
    }

    public String getAlamatAsal() {
        return alamatAsal;
    }

    public String getAlamatSekarang() {
        return alamatSekarang;
    }

    public String getDataMhs() {
        return nim + "; " + nama;
    }
}

class DriverMahasiswa {
    Scanner inp = new Scanner(System.in);
    ArrayList<Mahasiswa> arrMhs = new ArrayList<>();

    public static void main(String[] args) {
        DriverMahasiswa dm = new DriverMahasiswa();
        dm.runThis();
    }

    void runThis() {
        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("Pilihan Menu :");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. View Seluruh Data Mahasiswa");
            System.out.println("3. Edit Data Mahasiswa");
            System.out.println("4. Keluar Program");
            System.out.print("pilihan : ");
            pilihan = inp.nextInt();
            if (pilihan == 1) {
                inputData();
            } else if (pilihan == 2) {
                viewData();
            } else if (pilihan == 3) {
                editData();
            } else if (pilihan == 4) {
                System.out.println("Keluar dari program...");
            }
        }
    }

    void viewData() {
        System.out.println("Data Mahasiswa");
        for (int a = 0; a < arrMhs.size(); a++) {
            int nim = arrMhs.get(a).getNim();
            String nama = arrMhs.get(a).getNama();
            String asalSekolah = arrMhs.get(a).getAsalSekolah();
            String alamatAsal = arrMhs.get(a).getAlamatAsal();
            String alamatSekarang = arrMhs.get(a).getAlamatSekarang();
            System.out.println((a + 1) + ".\tNim : " + nim);
            System.out.println("\tNama : " + nama);
            System.out.println("\tAsal Sekolah : " + asalSekolah);
            System.out.println("\tAlamat Asal : " + alamatAsal);
            System.out.println("\tAsal Sekarang : " + alamatSekarang);
        }
    }

    void inputData() {
        System.out.println("Masukkan Data Mahasiswa");
        System.out.print("NIM : ");
        int nim = inp.nextInt();
        System.out.print("Nama : ");
        String nama = inp.next();
        System.out.print("Asal Sekolah : ");
        String asalSekolah = inp.next();
        System.out.print("Alamat Asal : ");
        String alamatAsal = inp.next();
        System.out.print("Alamat Sekarang : ");
        String alamatSekarang = inp.next();
        arrMhs.add(new Mahasiswa(nim, nama, asalSekolah, alamatAsal, alamatSekarang));
    }

    void editData() {
        System.out.println("Edit Data Mahasiswa");
        System.out.println("Masukkan NIM Mahasiswa yang Dataya ingin diedit : ");
        int nim = inp.nextInt();
        int temu = 0;
        for (int a = 0; a < arrMhs.size(); a++) {
            if (arrMhs.get(a).getNim() == nim) {
                System.out.print("Masukkan Alamat Baru : ");
                String alamatSekarang = inp.next();
                arrMhs.get(a).setAlamatSekarang(alamatSekarang);
                System.out.println("Data berhasil diedit");
                temu++;
                break;
            }
        }
        if (temu == 0) {
            System.out.println("Data Tidak Ditemukan");
        }
    }
}