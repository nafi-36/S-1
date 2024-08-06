import java.util.Scanner;

public class sitinafiatulfauziah_1201230017 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int bil = 0;
        System.out.print("Masukkan satu bilangan: ");
        bil = input.nextInt();

        if (bil % 2 == 0) {
            System.out.println(bil + " adalah bilangan genap");
        } else {
            System.out.println(bil + " adalah bilangan ganjil");
        }

    }
    
}