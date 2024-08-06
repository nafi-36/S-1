// TUGAS AKHIR VERSI TUTOR TEMEN, MAKASIH BANYAK DAVID <3

import java.util.Scanner;

public class tugasAkhir2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pendapatan = 0;
        double totalPajak = 0; 

        System.out.println("====================================");
        System.out.println("|    Pajak Penghasilan perTahun    |");
        System.out.println("====================================");
        
        System.out.print("Income (jt) : ");
        pendapatan = input.nextInt();
        System.out.println(" ");
        input.close();

        boolean next = false;
        int i = 0;
        double[] tarif = {5, 15, 25, 30, 35, };
        int[] wajibPajak = {60, 190, 250, 4500, pendapatan};
        double[] kuartil = {0, 0, 0, 0, 0, };

        if (pendapatan < 60) {
            System.out.println("Total pajak (jt) : Tidak kena pajak");
            System.out.println("====================================");

            next = true;
        }
        else {
            while (!next) {
                if (pendapatan >= wajibPajak[i]) {
                    pendapatan -= wajibPajak[i];
                    kuartil[i] = wajibPajak[i] * (tarif[i] / 100);
                    System.out.println("Kuartil " + (i + 1) + " (jt) : " + kuartil[i]);
                    totalPajak += kuartil[i];
                    i ++;
                }
                else if (pendapatan > 0) {
                    kuartil[i] = pendapatan * (tarif[i] / 100);
                    pendapatan = 0;
                    System.out.println("Kuartil " + (i + 1) + " (jt) : " + kuartil[i]);
                    totalPajak += kuartil[i];
                }
                else {
                    next = true;
                }
            }
        }

        System.out.println("Total pajak (jt) : " + totalPajak);
        System.out.println("====================================");
    }
}
