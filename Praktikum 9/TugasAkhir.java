import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    String alamat;

    public Mahasiswa(String nama, String nim, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    String getProdi() {
        return prodi;
    }

    String getAlamat() {
        return alamat;
    }

    public String toString() {
        return nama + " " + nim + " " + prodi + " " + alamat + "\n";
    }
}

class MyObjectComparatorByNama implements Comparator<Mahasiswa> {
    @Override
    public int compare(Mahasiswa obj1, Mahasiswa obj2) {
        return obj1.getNama().compareTo(obj2.getNama());
    }
}

class MyObjectComparatorByNim implements Comparator<Mahasiswa> {
    @Override
    public int compare(Mahasiswa obj1, Mahasiswa obj2) {
        return obj1.getNim().compareTo(obj2.getNim());
    }
}

class ComparatorMhs {
    Scanner inp = new Scanner(System.in);
    ArrayList<Mahasiswa> arrMhs = new ArrayList<>();

    public static void main(String[] args) {
        ComparatorMhs cc = new ComparatorMhs();
        cc.menu();
    }

    void menu() {
        int pilihan = 0;
        while (pilihan != 3) {
            System.out.println("===== MENU UTAMA =====");
            System.out.println("1. Input data mahasiswa");
            System.out.println("2. View data mahasiswa");
            System.out.println("3. Keluar program");
            System.out.print("Pilihan : ");
            pilihan = inp.nextInt();

            if (pilihan == 1) {
                inputData();
            } else if (pilihan == 2) {
                if (!arrMhs.isEmpty()) {
                    menuView();
                } else {
                    System.out.println("Belum ada data yang diinputkan");
                }
            } else if (pilihan == 3) {
                System.out.println("Keluar dari program...");
            } else {
                System.out.println("Inputan tidak valid");
            }
        }
    }

    void inputData() {
        System.out.println("===== Input Data Mahasiswa =====");
        System.out.print("Nama : ");
        String nama = inp.next();
        System.out.print("NIM : ");
        String nim = inp.next();
        System.out.print("Program studi : ");
        String prodi = inp.next();
        System.out.print("Alamat : ");
        String alamat = inp.next();

        Mahasiswa mhs = new Mahasiswa(nama, nim, prodi, alamat);
        arrMhs.add(mhs);
        System.out.println("Data berhasil ditambahkan");
    }

    void menuView() {
        int pilihan = 0;
        System.out.println("===== View Data Mahasiswa =====");
        System.out.println("Lihat data mahasiswa berdasarkan :");
        System.out.println("1. Nama");
        System.out.println("2. NIM");
        System.out.print("Pilihan : ");
        pilihan = inp.nextInt();
        switch (pilihan) {
            case 1:
                menuView2("nama");
                break;
            case 2:
                menuView2("nim");
                break;
            default:
                System.out.println("Inputan tidak valid");
                break;
        }
    }

    void menuView2(String type) {
        int pilihan = 0;
        System.out.println("Lihat data mahasiswa berdasarkan " + type);
        System.out.println("Dengan urutan : ");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Pilihan : ");
        pilihan = inp.nextInt();
        switch (pilihan) {
            case 1:
                viewData(type, "ascending");
                break;
            case 2:
                viewData(type, "descending");
                break;
            default:
                System.out.println("Inputan tidak valid");
                break;
        }
    }

    void viewData(String type, String sort) {
        System.out.println("Data sebelum diurutkan :");
        traversal(arrMhs, "original");
        switch (type) {
            case "nama":
                Collections.sort(arrMhs, new MyObjectComparatorByNama());
                break;
            case "nim":
                Collections.sort(arrMhs, new MyObjectComparatorByNim());
                break;
            default:
                System.out.println("Inputan tidak valid");
                break;
        }
        if (sort.equalsIgnoreCase("descending")) {
            Collections.reverse(arrMhs);
        }
        traversal(arrMhs, sort);
    }

    void traversal(ArrayList<Mahasiswa> data, String jenis) {
        System.out.println("Data mahasiswa sort " + jenis + " : ");
        for (Mahasiswa m : data) {
            System.out.print(m);
        }
        System.out.println();
    }
}