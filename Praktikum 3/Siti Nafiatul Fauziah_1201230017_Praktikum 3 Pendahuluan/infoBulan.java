import java.util.Scanner;

public class infoBulan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomor bulan (1-12) : ");
        int inBulan = input.nextInt();
        
        if (inBulan == 1) {
            System.out.println("Januari");
        } else if (inBulan == 2) {
            System.out.println("Februari");
        } else if (inBulan == 3) {
            System.out.println("Maret");
        } else if (inBulan == 4) {
            System.out.println("April");
        } else if (inBulan == 5) {
            System.out.println("Mei");
        } else if (inBulan == 6) {
            System.out.println("Juni");
        } else if (inBulan == 7) {
            System.out.println("Juli");
        } else if (inBulan == 8) {
            System.out.println("Agustus");
        } else if (inBulan == 9) {
            System.out.println("September");
        } else if (inBulan == 10) {
            System.out.println("Oktober");
        } else if (inBulan == 11) {
            System.out.println("November");
        } else if (inBulan == 12) {
            System.out.println("Desember");
        } else {
            System.out.println("Inputan tidak valid");
        }
        
    }
}