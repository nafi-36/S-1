import java.util.Scanner;

public class deretJumlah4 {
    Scanner inp = new Scanner(System.in);
    int batas;
    int sum;

    public static void main(String[] args) {
        deretJumlah4 db = new deretJumlah4();
        db.runThis();
    }

    void runThis() {
        System.out.println("Deret bilangan genap");
        System.out.print("Masukkan batas : ");
        batas = inp.nextInt();
        jumlahGenap(batas);
    }

    void jumlahGenap(int batas) {
        sum = 0;
        System.out.print("Jumlah deret : ");

        for (int counter = 1; counter <= batas; counter++) {
            if ((counter % 2) == 0) {
                sum = sum + counter;
                if ((counter == batas) || ((counter + 1) == batas)) {
                    System.out.print(counter);
                } else {
                    System.out.print(counter + " + ");
                }
            }
        }

        System.out.println();
        System.out.println("Jumlah total : " + sum);
    }
}