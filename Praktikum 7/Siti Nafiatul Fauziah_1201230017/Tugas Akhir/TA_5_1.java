import java.util.ArrayList;
import java.util.Random;

class TA_5_1 {
    ArrayList<Integer> arrNilai = new ArrayList<>();
    Random getRandom = new Random();
    int[] result = new int[101];

    public static void main(String[] args) {
        TA_5_1 dn = new TA_5_1();
        dn.runThis();
    }

    void runThis() {
        isiNilai();
        tampilArray();
        modusArray();
    }

    void isiNilai() {
        System.out.println("\n\nPengisian Nilai");
        for (int a = 0; a < 1000; a++) {
            int nilai = getRandom.nextInt(101);
            if (nilai > 100 || nilai < 0) {
                break;
            }
            arrNilai.add(nilai); // menambahkan nilai ke ArrayList
        }
    }

    void tampilArray() {
        System.out.println("\n\nDaftar Nilai\n");
        for (int nilai : arrNilai) {
            System.out.print(nilai + " ");
        }
        System.out.println("\n\nPanjang array : " + arrNilai.size());
        System.out.println();

        for (int i = 0; i <= 100; i++) {
            result[i] = chekArray(i);
            System.out.println(i + " = " + result[i] + " kemunculan");
        }
    }

    int chekArray(int num) {
        int temp = 0;
        for (int nilai : arrNilai) {
            if (nilai == num) {
                temp++;
            }
        }
        return temp;
    }

    void modusArray() {
        int max = 0;
        int terbanyak = 0;
        for (int i = 0; i <= 100; i++) {
            if (result[i] >= max) {
                max = result[i];
                terbanyak = i;
            }
        }
        System.out.println("\nJumlah kemunculan terbanyak adalah untuk angka " + terbanyak);
    }
}