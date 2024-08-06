import java.util.Scanner;

public class TA5 {
    public static void main(String[] args) {
        System.out.println("===== DERET BILANGAN FAKTORIAL =====");
        apkDeretFaktorial app = new apkDeretFaktorial();
        app.menu();
    }
}

class apkDeretFaktorial {
    void menu() {
        String quit;
        do {
            Scanner input = new Scanner(System.in);
            int number;

            System.out.print("Masukkan bilangan : ");
            number = input.nextInt();
            int sum = 1;

            if (number > 0) {
                System.out.print("Hasil faktorial dari " + number + "!" + " : ");
                while (number > 0) {
                    sum *= number;
                    if (number == 1) {
                        System.out.print(number);
                    } else {
                        System.out.print(number + " x ");
                    }
                    number--;
                }
                System.out.print(" = " + sum);
            } else {
                System.out.print("inputan tidak valid");
            }

            System.out.println();
            System.out.print("Quit? y/n : ");
            quit = input.next();
        } while (!quit.equals("y"));
    }
}
