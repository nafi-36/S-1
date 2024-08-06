import java.io.BufferedReader;
import java.io.InputStreamReader;

public class nilaimatakuliah {
    public static void main(String[] xyz) {
        NilaiMK nmk = new NilaiMK();
        nmk.inputData();
        nmk.viewNilai();
    }
}

class NilaiMK {

    private String nim;
    private int a1;
    private int a2;
    private int a3;
    private int tugas;
    private int praktikum;
    private double nilai;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader inp = new BufferedReader(isr);

    void inputData() {
        System.out.println("Nilai Algoritma dan Pemrograman");
        try {
            System.out.print("NIM : ");
            this.nim = inp.readLine();
            System.out.print("Nilai assessment 1 : ");
            this.a1 = Integer.parseInt(inp.readLine());
            System.out.print("Nilai assessment 2 : ");
            this.a2 = Integer.parseInt(inp.readLine());
            System.out.print("Nilai assessment 3 : ");
            this.a3 = Integer.parseInt(inp.readLine());
            System.out.print("Nilai tugas : ");
            this.tugas = Integer.parseInt(inp.readLine());
            System.out.print("Nilai praktikum : ");
            this.praktikum = Integer.parseInt(inp.readLine());
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        hitungNilai(this.a1, this.a2, this.a3, this.tugas, this.praktikum);
    }

    void hitungNilai(int a1, int a2, int a3, int tugas, int praktikum) {
        // this.nilai = (0.15 * a1);
        // this.nilai = nilai + (0.15 * a2);
        // this.nilai = nilai + (0.1 * a3);
        // this.nilai = nilai + (0.2 * tugas);
        // this.nilai = nilai + (0.4 * praktikum);

        // Pengamatan no. 1
        this.nilai = (0.15 * a1) + (0.15 * a2) + (0.1 * a3) + (0.2 * tugas) + (0.4 * praktikum);
    }

    void viewNilai() {
        System.out.println("\n\n\nNilai Assessment");
        System.out.println("NIM : " + this.nim);
        System.out.println("Assessment 1 : " + this.a1);
        System.out.println("Assessment 2 : " + this.a2);
        System.out.println("Assessment 3 : " + this.a3);
        System.out.println("Tugas : " + this.tugas);
        System.out.println("Praktikum : " + this.praktikum);
        System.out.println("Nilai Akhir : " + this.nilai);
    }

}

// Pengamatan no. 2 

// a. Apakah yang dimaksud dengan keyword this.
//    JAWAB:
//    Keyword "this" adalah keyword yang digunakan untuk merujuk ke instance variable dari class tempat ia digunakan. 

// b. Jelaskan mengenai penggunaan kode tersebut.
//    JAWAB: 
//    Keyword "this" biasanya digunakan untuk membedakan antara instance variable (atribut) dan variabel lokal dalam sebuah method ketika keduanya memiliki nama yang sama.
//    Contoh penggunaannya dalam kode diatas:
//    hitungNilai(this.a1, this.a2, this.a3, this.tugas, this.praktikum);