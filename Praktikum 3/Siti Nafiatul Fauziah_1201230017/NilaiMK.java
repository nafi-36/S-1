import java.util.Scanner;

public class NilaiMK {
    public static void main(String[] args) {
        NilaiMK nmk = new NilaiMK();
        nmk.inputData();
        nmk.viewNilai();
    }

    private String nim;
    private int a1;
    private int a2;
    private int a3;
    private int tugas;
    private int prakt;
    private double nilai;
    private char index;
    private int kehadiran;

    Scanner inp = new Scanner(System.in);

    char cekIndeks(double nilaiAkhir) {
        char idx;
        double nilaiBaru = 0;

        if (kehadiran > 80) {
            nilaiBaru = nilaiAkhir;
        } else if (kehadiran <= 80 && kehadiran >= 50) {
            double perubahan = (0.2) * nilaiAkhir;
            nilaiBaru = nilaiAkhir - perubahan;
            this.nilai = nilaiBaru;
        } else if (kehadiran < 50) {
            double perubahan = 0;
            this.nilai = perubahan;
        }

        if (nilaiBaru >= 80) {
            idx = 'A';
        } else if (nilaiBaru >= 60) {
            idx = 'B';
        } else if (nilaiBaru >= 40) {
            idx = 'C';
        } else if (nilaiBaru >= 20) {
            idx = 'D';
        } else if (nilaiBaru > 0) {
            idx = 'E';
        } else {
            idx = 'F';
        }

        return idx;
    }

    void hitungNilai(int a1, int a2, int a3, int tugas, int prakt) {
        this.nilai = (0.15 * a1) + (0.15 * a2) + (0.1 * a3) + (0.2 * tugas) + (0.4 * prakt);
        this.index = cekIndeks(this.nilai);
    }

    void inputData() {
        System.out.println("Nilai Algoritma dan Pemrograman");
        System.out.print("NIM                        : ");
        this.nim = inp.next();
        System.out.print("Nilai assessment 1         : ");
        this.a1 = inp.nextInt();
        System.out.print("Nilai assessment 2         : ");
        this.a2 = inp.nextInt();
        System.out.print("Nilai assessment 3         : ");
        this.a3 = inp.nextInt();
        System.out.print("Nilai tugas                : ");
        this.tugas = inp.nextInt();
        System.out.print("Nilai praktikum            : ");
        this.prakt = inp.nextInt();
        System.out.print("Jumlah kehadiran (dalam %) : ");
        this.kehadiran = inp.nextInt();

        hitungNilai(this.a1, this.a2, this.a3, this.tugas, this.prakt);
    }

    void viewNilai() {
        System.out.println("\n\n\nNilai Assessment");
        System.out.println("NIM          : " + this.nim);
        System.out.println("Assessment 1 : " + this.a1);
        System.out.println("Assessment 2 : " + this.a2);
        System.out.println("Assessment 3 : " + this.a3);
        System.out.println("Tugas        : " + this.tugas);
        System.out.println("Praktikum    : " + this.prakt);
        System.out.println("Nilai Akhir  : " + this.nilai);
        System.out.println("Indeks nilai : " + this.index);
    }

}
