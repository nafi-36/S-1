import java.util.Scanner;

public class TA1 {
    public static void main(String[] args) {
        System.out.println("===== DERET BILANGAN PRIMA =====");
        apkDeretPrima app = new apkDeretPrima();
        app.menu();
    }
}

class apkDeretPrima {
    void menu() {
        String quit;
        do {
            Scanner input = new Scanner(System.in);
            int batas;

            System.out.print("Masukkan batas bilangan : ");
            batas = input.nextInt();

            if (batas > 0) {
                System.out.print("Deret bilangan prima : ");
                if (batas == 1) {
                    System.out.print("tidak ada");
                }
                for (int counter1 = 2; counter1 <= batas; counter1++) {
                    int counter2 = 2;
                    int cekPrima = 0;
                    while (counter2 <= counter1) {
                        if ((counter1 % counter2) == 0) {
                            cekPrima++;
                        }
                        counter2++;
                    }
                    if (cekPrima <= 1 && counter1 != 1) {
                        System.out.print(counter1 + " ");
                    }
                }
            } else {
                System.out.print("inputan tidak valid");
            }

            System.out.println();
            System.out.print("Quit? y/n : ");
            quit = input.next();
        } while (!quit.equals("y"));
    }
}