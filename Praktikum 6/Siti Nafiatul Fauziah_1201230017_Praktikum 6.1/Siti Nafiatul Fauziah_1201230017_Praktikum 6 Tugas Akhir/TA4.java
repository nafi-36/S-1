import java.util.Scanner;

public class TA4 {
    public static void main(String[] args) {
        System.out.println("=== DERET BILANGAN DIVERGEN ===");
        apkDeretDivergen app = new apkDeretDivergen();
        app.menu();
    }
}

class apkDeretDivergen {
    void menu() {
        String quit;
        do {
            Scanner input = new Scanner(System.in);
            int number;

            System.out.print("Masukkan bilangan : ");
            number = input.nextInt();
            int sum = 0;
            int ganjil = 0;
            int genap = 0;
            int counter = 1;

            if (number > 0) {
                System.out.print("Deret divergen : ");
                while (counter <= number) {
                    if (counter % 2 == 0) {
                        genap += counter;
                        if (counter != number) {
                            System.out.print(counter + " + ");
                        } else {
                            System.out.print(counter);
                        }
                    } else if (counter % 2 == 1) {
                        ganjil += counter;
                        if (counter != number) {
                            System.out.print(counter + " - ");
                        } else {
                            System.out.print(counter);
                        }
                    }
                    counter++;
                }
                sum += (ganjil - genap);
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