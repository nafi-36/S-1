import java.util.Scanner;

public class gjb {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("PERHITUNGAN WAKTU TITIK TEMU");
        apkGJB app = new apkGJB();
        app.menu();
    }
}

class apkGJB {
    void menu() {
        String quit;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("========================================");
            System.out.print("Masukkan jarak (km) : ");
            double jarak = input.nextDouble() * 1000; // meter
            System.out.print("Masukkan kecepatan Budi (km/jam) : ");
            double budi = (input.nextDouble() * 1000) / 3600; // meter/detik
            System.out.print("Masukkan kecepatan Ani (km/jam) : ");
            double ani = (input.nextDouble() * 1000) / 3600; // meter/detik

            double jarakBudi = 0; // meter
            double jarakAni = jarak; // 1 km = 1000 m
            int waktuTemu = 0; // detik

            System.out.println("Detik ke-" + waktuTemu + " - Jarak Budi: " + jarakBudi + " meter, Jarak Ani: " + jarakAni + " meter, Jarak Mereka: " + jarak + " meter");

            while (jarakBudi < jarakAni) {
                jarak -= (budi + ani);
                jarakBudi += budi; 
                jarakAni -= ani; 

                if (jarak < 0) {
                    jarak += (budi + ani);
                    break;
                } // agar selisih jarak tidak negatif

                waktuTemu++;

                System.out.println("Detik ke-" + waktuTemu + " - Jarak Budi: " + jarakBudi + " meter, Jarak Ani: " + jarakAni + " meter (Jarak Mereka: " + jarak + " meter)");
            }

            System.out.println("Waktu yang dibutuhkan oleh Budi dan Ani untuk bertemu adalah: " + waktuTemu + " detik");

            System.out.print("Quit? y/n : ");
            quit = input.next();
        } while (!quit.equals("y"));
    }
}