import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("PERHITUNGAN FAKTORIAL");
        apkFaktorial app = new apkFaktorial();
        app.menu();
    }
}

class apkFaktorial {
    void menu() {
        String quit;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("========================================");
            System.out.print("Masukkan bilangan : ");
            int number = input.nextInt();
            int number1 = number;
            int faktorial = 1;

            while (number > 0) {
                faktorial = faktorial * number;
                number--;
            }

            System.out.println("Faktorial dari " + number1 + " adalah " + number1 + "! = " + faktorial);

            System.out.print("Quit? y/n : ");
            quit = input.next();
        } while (!quit.equals("y"));
    }
}