import java.util.Scanner;

public class TA3 {
    public static void main(String[] args) {
        System.out.println("===== DERET BILANGAN KUADRAT =====");
        apkDeretKuadrat app = new apkDeretKuadrat();
        app.menu();
    }
}

class apkDeretKuadrat {
    void menu() {
        String quit;
        do {
            Scanner input = new Scanner(System.in);
            int number;

            System.out.print("Masukkan bilangan : ");
            number = input.nextInt();
            int sum = 0;

            if (number > 0) {
                System.out.print("Deret kuadrat : ");
                for (int counter = 1; counter <= number; counter++) {
                    sum += counter * counter;
                    if (counter == number) {
                        System.out.print(counter * counter);
                    } else {
                        System.out.print(counter * counter + " + ");
                    }
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