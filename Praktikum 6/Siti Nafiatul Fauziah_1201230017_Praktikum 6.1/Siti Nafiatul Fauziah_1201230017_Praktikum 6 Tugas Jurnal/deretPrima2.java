import java.util.Scanner;

public class deretPrima2 {
    Scanner inp = new Scanner(System.in);
    int batas;

    public static void main(String[] args) {
        deretPrima2 db = new deretPrima2();
        db.runThis();
    }

    void runThis() {
        System.out.println("Deret bilangan prima");
        System.out.print("Masukkan batas : ");
        batas = inp.nextInt();
        daftarPrima(batas);
    }

    void daftarPrima(int batas) {
        boolean bukti;
        int counter = 2;
        System.out.print("Daftar Nilai Prima : ");
        while (counter <= batas) {
            bukti = cekBilanganPrima(counter);
            if (bukti && counter != 1) {
                System.out.print(counter + " ");
            }
            counter++;
        }
    }

    boolean cekBilanganPrima(int batas) {
        int counter = 2;
        int cekPrima = 0;
        while (counter <= batas) {
            if ((batas % counter) == 0) {
                cekPrima++;
            }
            counter++;
        }

        if (cekPrima > 1) {
            return false;
        } else {
            return true;
        }
    }

}

/*

1.4.2 Pengamatan

2. Jika pada baris 33 diubah menjadi int counter = 0;
   Maka akan terjadi error karena pembagian dengan 0

 */