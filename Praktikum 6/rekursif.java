import java.util.Scanner;

public class rekursif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int a = input.nextInt();
        System.out.println("Hasil faktorial " + a + "! : " + Faktorial(a));
    }

    static int Faktorial(int b) {
        if (b > 0) {
            return b * Faktorial(b - 1);
        } else {
            return 1;
        }
    }
}

// Rekursif = memanggil fungsi didalam fungsi itu sendiri