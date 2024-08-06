import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan data mahasiswa :");
        System.out.print("Masa studi : ");
        double masa = input.nextDouble();
        System.out.print("Nilai IPK : "); 
        double ipk = input.nextDouble();
        System.out.print("Nilai EPRT : ");
        double eprt = input.nextDouble();
        System.out.print("Apakah ada surat keterangan industri? (1 = ada / 2 = tidak ada) : ");
        int sk = input.nextInt();
        
        System.out.println("Status kelulusan mahasiswa :");

        if (ipk >= 2.76 && ipk <= 3.0) {
            System.out.println("Memuaskan");
        } else if (ipk >= 3.01 && ipk <= 3.50) {
            System.out.println("Sangat Memuaskan");
        } else if (ipk > 3.51){
            if (masa <= 6 && eprt >= 450 && sk == 1) {
                System.out.println("Cumlaude");
            } else {
                System.out.println("Sangat Memuaskan");
            }
        } else {
            System.out.println("Lulus");
        }
    }
}