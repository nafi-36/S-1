import java.util.Scanner;

public class biner {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("KONVERSI BILANGAN BINER");
        apkBiner app = new apkBiner();
        app.menu();
    }
}

class apkBiner {
    void menu() {
        String quit;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("========================================");
            System.out.print("Masukkan bilangan : ");
            int number = input.nextInt();
            int number1 = number;

            if (number == 0) {
                System.out.println("Bilangan biner dari 0 adalah : 0");
            } else {
                String binary = "";
                while (number > 0) {
                    int temp = number % 2;
                    binary = temp + binary;
                    number = number / 2;
                }
                System.out.println("Bilangan biner dari " + number1 + " adalah : " + binary);
            }

            System.out.print("Quit? y/n : ");
            quit = input.next();
        } while (!quit.equals("y"));
    }
}