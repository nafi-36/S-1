import java.util.Scanner;

public class swastika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== SWASTIKA PATTERN =====");
        System.out.print("Masukkan luas : ");
        int x = input.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == 0 && j <= x / 2 ||
                        j == 0 && i >= x / 2 ||
                        i == x - 1 && j >= x / 2 ||
                        j == x - 1 && i <= x / 2 ||
                        i == x / 2 ||
                        j == x / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}