// TUGAS AKHIR VERSI SAYA

import java.util.Scanner;

public class tugasAkhir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== Hitung Pajak Pendapatan =====");
        System.out.print("Total pendapatan 1 tahun : ");
        long pendapatan = input.nextLong();

        System.out.println("Detail pajak :");
        cekPajak(pendapatan);
    }

    static void cekPajak(long pndptn) {
        long sisa = pndptn;
        double pajak;
        long pjk;
        long totalPjk = 0;
    
        if (pndptn < 60000000) {
            System.out.println("Tidak kena pajak");
        }
        else if (pndptn == 60000000) {
            pajak = 0.05 * 60000000;
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 1 : 5% * 60.000.000 = " + pjk);
            System.out.println("Total pajak = " + totalPjk);
        } 
        else if (pndptn > 60000000 && pndptn <= 250000000) {
            pajak = 0.05 * 60000000;
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 1 : 5% * 60.000.000 = " + pjk);
    
            sisa -= 60000000;
            pajak = 0.15 * sisa;
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 2 : 15% * " + sisa + " = " + pjk);
            System.out.println("Total pajak = " + totalPjk);
        } 
        else if (pndptn > 250000000 && pndptn <= 500000000) {
            pajak = 0.05 * 60000000;
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 1 : 5% * 60.000.000 = " + pjk);
                
            pajak = 0.15 * (250000000-60000000);
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 2 : 15% * 190.000.000 = " + pjk);
    
            sisa -= 250000000;
            pajak = 0.25 * sisa;
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 3 : 25% * " + sisa + " = " + pjk);
            System.out.println("Total pajak = " + totalPjk);
        }
        else if (pndptn > 500000000 && pndptn <= 5000000000L) {
            pajak = 0.05 * 60000000;
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 1 : 5% * 60.000.000 = " + pjk);
                
            pajak = 0.15 * (250000000-60000000);
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 2 : 15% * 190.000.000 = " + pjk);
    
            pajak = 0.25 * (500000000-250000000);
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 3 : 25% * 250.000.000 = " + pjk);

            sisa -= 500000000;
            pajak = 0.30 * sisa;
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 4 : 30% * " + sisa + " = " + pjk);
            System.out.println("Total pajak = " + totalPjk);
        }
        else if (pndptn > 5000000000L) {
            pajak = 0.05 * 60000000;
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 1 : 5% * 60.000.000 = " + pjk);
                
            pajak = 0.15 * (250000000-60000000);
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 2 : 15% * 190.000.000 = " + pjk);
    
            pajak = 0.25 * (500000000-250000000);
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 3 : 25% * 250.000.000 = " + pjk);

            pajak = 0.30 * (5000000000L-500000000);
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 4 : 30% * 4.500.000.000 = " + pjk);

            sisa -= 5000000000L;
            pajak = 0.35 * sisa;
            pjk = (int) pajak;
            totalPjk += pjk;
            System.out.println("Tarif 5 : 35% * " + sisa + " = " + pjk);
            System.out.println("Total pajak = " + totalPjk);
        }
        else {
            System.out.println("Tidak kena pajak");
        }
    }   
}