import java.util.Scanner;

public class furniture {
    public static void main(String[] args) {
        apk app = new apk();
        app.menu();
    }
}

class apk {
    String namaProduk;
    double harga;
    double disc;
    double jumlah;
    double totalHarga;
    double totalDisc;
    void menu() {
        String quit;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Pembelian Furniture di PT. Java Jaya");
            System.out.println("A. Cupboard");
            System.out.println("B. Computer Desk");
            System.out.println("C. Study Desk");
            System.out.print("Kode produk : ");
            String kode = input.next().toUpperCase();

            switch (kode) {
                case "A":
                    namaProduk = "Cupboard";
                    harga = 250000;
                    disc = 0.05;
                    break;
                case "B":
                    namaProduk = "Computer Desk";
                    harga = 200000;
                    disc = 0.03;
                    break;
                case "C":
                    namaProduk = "Study Desk";
                    harga = 150000;
                    disc = 0.02;
                    break;
                default:
                    System.out.println("Kode produk tidak valid");
                    break;
            }
            System.out.println("Nama produk : " + namaProduk);
            System.out.println("Harga tiap unit : " + harga);
            System.out.print("Jumlah beli : ");
            jumlah = input.nextDouble();
            totalHarga = harga * jumlah;
            System.out.println("Total harga : " + totalHarga);
            System.out.println("Besar diskon : " + disc * 100 + "%");
            totalDisc = totalHarga * disc;
            System.out.println("Total diskon : " + totalDisc);
            System.out.println("Total bayar : " + (totalHarga - totalDisc));

            System.out.print("Quit? y/n :");
            quit = input.next();
        } while (!quit.equals("y"));
    }
}