import java.util.Scanner;

public class TA_2 {
    static final int MAX = 100; // menentukan ukuran maksimum array
    String[] nimList = new String[MAX];
    String[] namaList = new String[MAX];
    double[] nilaiAssessment1List = new double[MAX];
    double[] nilaiAssessment2List = new double[MAX];
    double[] nilaiAssessment3List = new double[MAX];
    double[] nilaiTugasList = new double[MAX];
    double[] nilaiPraktikumList = new double[MAX];
    double[] kehadiranList = new double[MAX];
    double[] nilaiAkhirList = new double[MAX];
    char[] indexAkhirList = new char[MAX];
    int jumlahMahasiswa = 0; // menyimpan jumlah mahasiswa yang telah diinput

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TA_2 aplikasi = new TA_2();
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
            nimList[jumlahMahasiswa] = nim;

            System.out.print("Nama: ");
            String nama = scanner.next();
            namaList[jumlahMahasiswa] = nama;

            System.out.print("Nilai Assessment 1: ");
            double nilaiAssessment1 = scanner.nextInt();
            nilaiAssessment1List[jumlahMahasiswa] = nilaiAssessment1;

            System.out.print("Nilai Assessment 2: ");
            double nilaiAssessment2 = scanner.nextDouble();
            nilaiAssessment2List[jumlahMahasiswa] = nilaiAssessment2;

            System.out.print("Nilai Assessment 3: ");
            double nilaiAssessment3 = scanner.nextDouble();
            nilaiAssessment3List[jumlahMahasiswa] = nilaiAssessment3;

            System.out.print("Nilai Tugas: ");
            double nilaiTugas = scanner.nextDouble();
            nilaiTugasList[jumlahMahasiswa] = nilaiTugas;

            System.out.print("Nilai Praktikum: ");
            double nilaiPraktikum = scanner.nextDouble();
            nilaiPraktikumList[jumlahMahasiswa] = nilaiPraktikum;

            System.out.print("Kehadiran: ");
            double kehadiran = scanner.nextDouble();
            kehadiranList[jumlahMahasiswa] = kehadiran;

            if (cek(nilaiAssessment1) && cek(nilaiAssessment2) && cek(nilaiAssessment3) && cek(nilaiTugas) && cek(nilaiPraktikum) && cek(kehadiran)) {
                double nilaiAkhir = hitungNilaiAkhir(nilaiAssessment1, nilaiAssessment2, nilaiAssessment3, nilaiTugas, nilaiPraktikum);
                nilaiAkhirList[jumlahMahasiswa] = nilaiAkhir;

                char indexAkhir = hitungIndexAkhir(nilaiAkhir, kehadiran);
                indexAkhirList[jumlahMahasiswa] = indexAkhir;

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
            System.out.println("Tidak ada data mahasiswa");
        } else {
            for (int i = 0; i < jumlahMahasiswa; i++) {
                String nim = nimList[i];
                String nama = namaList[i];
                double nilaiAkhir = nilaiAkhirList[i];
                char indexAkhir = indexAkhirList[i];
                double kehadiran = kehadiranList[i];

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