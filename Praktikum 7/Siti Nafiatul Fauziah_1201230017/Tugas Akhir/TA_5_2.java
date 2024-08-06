import java.util.ArrayList;
import java.util.Scanner;

public class TA_5_2 {
    static final int MAX = 100; // menentukan ukuran maksimum array
    ArrayList<String> nimList = new ArrayList<>();
    ArrayList<String> namaList = new ArrayList<>();
    ArrayList<Double> nilaiAssessment1List = new ArrayList<>();
    ArrayList<Double> nilaiAssessment2List = new ArrayList<>();
    ArrayList<Double> nilaiAssessment3List = new ArrayList<>();
    ArrayList<Double> nilaiTugasList = new ArrayList<>();
    ArrayList<Double> nilaiPraktikumList = new ArrayList<>();
    ArrayList<Double> kehadiranList = new ArrayList<>();
    ArrayList<Double> nilaiAkhirList = new ArrayList<>();
    ArrayList<Character> indexAkhirList = new ArrayList<>();
    int jumlahMahasiswa = 0; // menyimpan jumlah mahasiswa yang telah diinput

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TA_5_2 aplikasi = new TA_5_2();
        aplikasi.menu();
    }

    void menu() {
        int pilihan;
        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Input Data");
            System.out.println("2. View Semua D ata");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    inputData();
                    break;
                case 2:
                    viewSemuaData();
                    break;
                case 3:
                    System.out.println("Keluar dari aplikasi...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan angka 1-3");
            }
        } while (pilihan != 3);
    }

    void inputData() {
        if (jumlahMahasiswa < MAX) {
            System.out.println("\n=== Input Data Mahasiswa ===");
            System.out.print("NIM: ");
            String nim = scanner.next();
            nimList.add(nim);

            System.out.print("Nama: ");
            String nama = scanner.next();
            namaList.add(nama);

            System.out.print("Nilai Assessment 1: ");
            double nilaiAssessment1 = scanner.nextInt();
            nilaiAssessment1List.add(nilaiAssessment1);

            System.out.print("Nilai Assessment 2: ");
            double nilaiAssessment2 = scanner.nextDouble();
            nilaiAssessment2List.add(nilaiAssessment2);

            System.out.print("Nilai Assessment 3: ");
            double nilaiAssessment3 = scanner.nextDouble();
            nilaiAssessment3List.add(nilaiAssessment3);

            System.out.print("Nilai Tugas: ");
            double nilaiTugas = scanner.nextDouble();
            nilaiTugasList.add(nilaiTugas);

            System.out.print("Nilai Praktikum: ");
            double nilaiPraktikum = scanner.nextDouble();
            nilaiPraktikumList.add(nilaiPraktikum);

            System.out.print("Kehadiran: ");
            double kehadiran = scanner.nextDouble();
            kehadiranList.add(kehadiran);

            if (cek(nilaiAssessment1) && cek(nilaiAssessment2) && cek(nilaiAssessment3) && cek(nilaiTugas) && cek(nilaiPraktikum) && cek(kehadiran)) {
                double nilaiAkhir = hitungNilaiAkhir(nilaiAssessment1, nilaiAssessment2, nilaiAssessment3, nilaiTugas, nilaiPraktikum);
                nilaiAkhirList.add(nilaiAkhir);

                char indexAkhir = hitungIndexAkhir(nilaiAkhir, kehadiran);
                indexAkhirList.add(indexAkhir);

                jumlahMahasiswa++;
                System.out.println("Data mahasiswa berhasil diinput\n");
            } else {
                System.out.println("Rentang nilai harus dari 0 - 100\n");
            }
        } else {
            System.out.println("Array penuh, tidak dapat menambah data mahasiswa baru\n");
        }
    }

    boolean cek(double inp) {
        if ((inp >= 0) && (inp <= 100)) {
            return true;
        } else {
            return false;
        }
    }

    void viewSemuaData() {
        System.out.println("\n=== View Semua Data Mahasiswa ===");
        if (jumlahMahasiswa == 0) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            for (int i = 0; i < jumlahMahasiswa; i++) {
                String nim = nimList.get(i);
                String nama = namaList.get(i);
                double nilaiAkhir = nilaiAkhirList.get(i);
                char indexAkhir = indexAkhirList.get(i);
                double kehadiran = kehadiranList.get(i);

                System.out.println("NIM: " + nim);
                System.out.println("Nama: " + nama);
                System.out.println("Jumlah Kehadiran : " + (int) kehadiran + "%");
                System.out.println("Nilai Akhir: " + nilaiAkhir);
                System.out.println("Indeks Akhir: " + indexAkhir);
                System.out.println();
            }
        }
    }

    double hitungNilaiAkhir(double assessment1, double assessment2, double assessment3, double tugas, double praktikum) {
        double assessment1Persen = assessment1 * 0.15;
        double assessment2Persen = assessment2 * 0.15;
        double assessment3Persen = assessment3 * 0.10;
        double tugasPersen = tugas * 0.20;
        double praktikumPersen = praktikum * 0.40;

        double nilaiAkhir = assessment1Persen + assessment2Persen + assessment3Persen + tugasPersen + praktikumPersen;

        return nilaiAkhir;
    }

    char hitungIndexAkhir(double na, double kh) {
        char indeks;

        if ((na >= 80) && (kh >= 80)) {
            indeks = 'A';
        } else if ((na >= 60) && (kh >= 80)) {
            indeks = 'B';
        } else if ((na >= 40) && (kh >= 80)) {
            indeks = 'C';
        } else if ((na >= 20) && (kh >= 80)) {
            indeks = 'D';
        } else if ((na >= 0) && (kh >= 80)) {
            indeks = 'E';
        } else {
            indeks = 'F';
        }

        return indeks;
    }
}
