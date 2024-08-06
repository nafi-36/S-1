import java.util.Scanner;

public class prima {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("PENGECEKAN BILANGAN PRIMA");
        apkPrima app = new apkPrima();
        app.menu();
    }
}

class apkPrima {
    void menu() {
        String quit;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("========================================");
            System.out.print("Masukkan bilangan : ");
            int number = input.nextInt();
            boolean prima = true;
            int i = 2;

            while (i <= number / 2) {
                if (number % i == 0) {
                    prima = false;
                    break;
                }
                i++;
            }

            if (number <= 1) {
                prima = false;
            }

            if (prima) {
                System.out.println(number + " adalah bilangan prima");
            } else {
                System.out.println(number + " bukan bilangan prima");
            }

            System.out.print("Quit? y/n : ");
            quit = input.next();
        } while (!quit.equals("y"));
    }
}