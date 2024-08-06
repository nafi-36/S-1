import java.util.Scanner;

public class nextDays2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Next n Days Is What Day?");
        System.out.print("Tanggal : ");
        int tanggal = inp.nextInt();
        System.out.print("Bulan   : ");
        int bulan = inp.nextInt();
        System.out.print("Tahun   : ");
        int tahun = inp.nextInt();
        System.out.print("Berapa hari selanjutnya : ");
        int hari = inp.nextInt();

        tanggal = tanggal + hari;

        int maxDayAwal = cekMaxDay(bulan, tahun);

        if (tanggal > maxDayAwal) {
            int addBulan = tanggal / maxDayAwal;
            bulan = bulan + addBulan;
            tanggal = tanggal % cekMaxDay(bulan, tahun);
        }

        if (bulan > 12) {
            int addTahun = bulan / 12;
            bulan = bulan % 12;
            tahun = tahun + addTahun;
        }

        System.out.println("\nThe Day After " + hari + " Day");
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Bulan   : " + bulan);
        System.out.println("Tahun   : " + tahun);
    }

    static int cekMaxDay(int bln, int thn) {
        int temp = 0;
        switch (bln) {
            case 1, 3, 5, 7, 8, 10, 12:
                temp = 31;
                break;
            case 4, 6, 9, 11:
                temp = 30;
                break;
            case 2:
                if ((thn % 4) == 0) {
                    temp = 29;
                } else {
                    temp = 28;
                }
                break;
        }
        return temp;
    }
}