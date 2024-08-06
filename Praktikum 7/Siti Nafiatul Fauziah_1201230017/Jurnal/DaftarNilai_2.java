import java.util.Random;

class DaftarNilai_2 {
    int[] arrNilai = new int[1000];
    Random getRandom = new Random();

    public static void main(String[] args) {
        DaftarNilai_2 dn = new DaftarNilai_2();
        dn.runThis();
    }

    void runThis() {
        isiNilai();
        // isiNilaiWhile();
        // isiNilaiDoWhile();
        tampilArray();
    }

    void isiNilai() {
        System.out.println("\n\nPengisian Nilai");
        for (int a = 0; a < arrNilai.length; a++) {
            arrNilai[a] = getRandom.nextInt(101);
            // pengamatan 2
            if (arrNilai[a] > 100 || arrNilai[a] < 0) {
                break;
            }
        }
    }

    // pengamatan 6
    void isiNilaiWhile() {
        System.out.println("\n\nPengisian Nilai");
        int a = 0;
        while (a < arrNilai.length) {
            arrNilai[a] = getRandom.nextInt(101);
            a++;
        }
    }

    void isiNilaiDoWhile() {
        System.out.println("\n\nPengisian Nilai");
        int a = 0;
        do {
            arrNilai[a] = getRandom.nextInt(101);
            a++;
        } while (a < arrNilai.length);
    }

    void tampilArray() {
        System.out.println("\n\nDaftar Nilai");
        for (int a = 0; a < arrNilai.length; a++) {
            System.out.print(arrNilai[a] + " ");
        }
        System.out.println("\nPanjang array : " + arrNilai.length);
    }
}

// pengamatan 3 : length() function  untuk menghitung panjang dari suatu array