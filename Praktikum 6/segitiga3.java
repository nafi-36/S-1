import java.util.Scanner;

public class segitiga3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan : ");
        int x = input.nextInt();
        // int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 1; i <= x; i++) {
            for (int j = x; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}