import java.util.Scanner;

public class selisihWaktu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan waktu awal (HHMM): ");
        int waktuAwal = input.nextInt();
        System.out.print("Masukkan waktu akhir (HHMM): ");
        int waktuAkhir = input.nextInt();
        
        int jamAwal = waktuAwal / 100;
        int menitAwal = waktuAwal % 100;
        
        int jamAkhir = waktuAkhir / 100;
        int menitAkhir = waktuAkhir % 100;
        
        int selisihJam = jamAkhir - jamAwal;
        int selisihMenit = menitAkhir - menitAwal;
        
        if (selisihMenit < 0) {
            selisihJam = selisihJam - 1;
            selisihMenit = selisihMenit + 60;
        }
        
        if (selisihJam < 0) {
            selisihJam = selisihJam + 24;
        }
        
        System.out.println("Selisih waktu: " + selisihJam + " jam " + selisihMenit + " menit");
        
    }
}