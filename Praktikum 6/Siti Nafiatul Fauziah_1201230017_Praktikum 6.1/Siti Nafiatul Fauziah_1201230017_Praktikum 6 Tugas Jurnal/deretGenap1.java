import java.util.Scanner;

public class deretGenap1 {
    Scanner inp = new Scanner(System.in);
    int batas;

    public static void main(String[] args) {
        deretGenap1 db = new deretGenap1();
        db.runThis();
    }

    void runThis() {
        System.out.println("Deret bilangan genap");
        System.out.print("Masukkan batas : ");
        batas = inp.nextInt();
        daftarGenap(batas);
    }

    void daftarGenap(int batas) {
        int counter = 1;
        System.out.print("Daftar Nilai Genap : ");
        while (counter <= batas) {
            if ((counter % 2) == 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
}

/*

1.3.3 Pengamatan

2. a) Jika counter++ diubah menjadi counter-- maka akan terjadi looping forever dimana nilai counter akan mengalami pengurangan terus menerus karena counter selalu memenuhi kondisi (counter selalu kurang dari batas) 
   b) ++ => increment (untuk menambah nilai dari suatu variabel dengan ditambah 1)
      -- => decrement (untuk mengurangi nilai dari suatu variabel dengan dikurangi 1)
   c) counter++ => counter = counter + 1
      counter-- => counter = counter - 1

3. a) while (counter < batas) => maka batasnya tidak akan tampil (karena tidak termasuk)
   b) while (counter > batas) => maka tidak ada nilai yang ditampilkan

 */