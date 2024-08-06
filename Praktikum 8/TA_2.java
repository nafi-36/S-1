import java.util.ArrayList;
import java.util.Scanner;

class SIM {
    private int no;
    private String nama;
    private String tglLahir;
    private String tmpLahir;
    private String goldar;
    private String gender;
    private String alamat;
    private String tglExpSim;
    private String jenisSim;
    private String kotaTerbit;

    public SIM(int no, String nama, String tglLahir, String tmpLahir, String goldar, String gender, String alamat,
            String tglExpSim, String jenisSim, String kotaTerbit) {
        this.no = no;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmpLahir = tmpLahir;
        this.goldar = goldar;
        this.gender = gender;
        this.alamat = alamat;
        this.tglExpSim = tglExpSim;
        this.jenisSim = jenisSim;
        this.kotaTerbit = kotaTerbit;
    }

    public int getNo() {
        return no;
    }

    public String getNama() {
        return nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public String getTmpLahir() {
        return tmpLahir;
    }

    public String getGoldar() {
        return goldar;
    }

    public String getGender() {
        return gender;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTglExpSim() {
        return tglExpSim;
    }

    public String getJenisSim() {
        return jenisSim;
    }

    public String getKotaTerbit() {
        return kotaTerbit;
    }
}

class Fitur {
    Scanner inp = new Scanner(System.in);
    ArrayList<SIM> arrSim = new ArrayList<>();

    public static void main(String[] args) {
        Fitur f = new Fitur();
        f.menu();
    }

    private void menu() {
        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("===== Aplikasi Pengelolaan SIM =====");
            System.out.println("Pilihan Menu :");
            System.out.println("1. Buat SIM");
            System.out.println("2. Lihat Semua Data SIM");
            System.out.println("3. Cari Data SIM");
            System.out.println("4. Keluar Program");
            System.out.print("Pilihan : ");
            pilihan = inp.nextInt();

            if (pilihan == 1) {
                buatSIM();
            } else if (pilihan == 2) {
                tampilSIM();
            } else if (pilihan == 3) {
                cariSIM();
            } else if (pilihan == 4) {
                System.out.println("Keluar dari program...");
            } else {
                System.out.println("Inputan tidak valid");
            }
        }
    }

    private void buatSIM() {
        System.out.println("===== Input Data SIM =====");
        System.out.print("Nama : ");
        String nama = inp.next();
        System.out.print("Tanggal Lahir : ");
        String tglLahir = inp.next();
        System.out.print("Tempat Lahir : ");
        String tmpLahir = inp.next();
        System.out.print("Golongan Darah : ");
        String goldar = inp.next().toUpperCase();
        System.out.print("Jenis Kelamin : ");
        String gender = inp.next();
        System.out.print("Alamat : ");
        String alamat = inp.next();
        System.out.print("Tanggal Kadaluarsa SIM : ");
        String tglExpSim = inp.next();
        System.out.print("Jenis SIM (A/B/C) : ");
        String jenisSim = inp.next().toUpperCase();
        System.out.print("Kota Penerbitan SIM : ");
        String kotaTerbit = inp.next();
   
        int no;
        if (!arrSim.isEmpty()) {
            no = arrSim.get(arrSim.size() - 1).getNo() + 1;
        } else {
            no = 1;
        }
        SIM s = new SIM(no, nama, tglLahir, tmpLahir, goldar, gender, alamat, tglExpSim, jenisSim, kotaTerbit);
        arrSim.add(s);
        System.out.println("Data SIM berhasil ditambahkan");
    }

    private void tampilSIM() {
        System.out.println("===== Informasi Data SIM =====");
        if (!arrSim.isEmpty()) {
            for (int i = 0; i < arrSim.size(); i++) {
                System.out.println(arrSim.get(i).getNo() + ".\tNama : " + arrSim.get(i).getNama());
                System.out.println("\tJenis SIM : " + arrSim.get(i).getJenisSim());
            }
        } else {
            System.out.println("Belum ada data yang diinputkan");
        }
    }

    private void cariSIM() {
        System.out.println("===== Cari Data SIM =====");
        if (!arrSim.isEmpty()) {
            System.out.print("Masukkan nama / no. SIM : ");
            String jwb = inp.next();
            int pos = cekSIM(jwb);
            if (pos >= 0) {
                System.out.println("=========================");
                System.out.println("No. Sim : " + arrSim.get(pos).getNo());
                System.out.println("Nama : " + arrSim.get(pos).getNama());
                System.out.println("Tanggal Lahir : " + arrSim.get(pos).getTglLahir());
                System.out.println("Tempat Lahir : " + arrSim.get(pos).getTmpLahir());
                System.out.println("Golongan Darah : " + arrSim.get(pos).getGoldar());
                System.out.println("Jenis Kelamin : " + arrSim.get(pos).getGender());
                System.out.println("Alamat : " + arrSim.get(pos).getAlamat());
                System.out.println("Tanggal Kadaluarsa SIM : " + arrSim.get(pos).getTglExpSim());
                System.out.println("Jenis SIM : " + arrSim.get(pos).getJenisSim());
                System.out.println("Kota Penerbitan SIM : " + arrSim.get(pos).getKotaTerbit());
            } else {
                System.out.println("Data tidak ditemukan");
            }
        } else {
            System.out.println("Belum ada data yang diinputkan");

        }
    }

    private int cekSIM(String jwb) {
        int ketemu = -1;
        for (int i = 0; i < arrSim.size(); i++) {
            if (Integer.toString(arrSim.get(i).getNo()).equals(jwb) || arrSim.get(i).getNama().equalsIgnoreCase(jwb)) {
                ketemu = i;
                break;
            }
        }
        return ketemu;
    }
}