import java.util.Random;

class TA_1 {
    int[] arrNilai = new int[1000];
    Random getRandom = new Random();
    int[] result = new int[101];

    public static void main(String[] args) {
        TA_1 dn = new TA_1();
        dn.runThis();
    }

    void runThis() {
        isiNilai();
        tampilArray();
        modusArray();
    }

    void isiNilai() {
        System.out.println("\n\nPengisian Nilai");
        for (int a = 0; a < arrNilai.length; a++) {
            arrNilai[a] = getRandom.nextInt(101);
            if (arrNilai[a] > 100 || arrNilai[a] < 0) {
                break;
            }
        }
    }

    void tampilArray() {
        System.out.println("\n\nDaftar Nilai\n");
        for (int a = 0; a < arrNilai.length; a++) {
            System.out.print(arrNilai[a] + " ");
        }
        System.out.println("\n\nPanjang array : " + arrNilai.length);
        System.out.println();

        for (int i = 0; i <= 100; i++) {
            result[i] = chekArray(i);
            System.out.println(i + " = " + result[i] + " kemunculan");
        }
    }

    int chekArray(int num) {
        int temp = 0;
        for (int a = 0; a < arrNilai.length; a++) {
            if (arrNilai[a] == num) {
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