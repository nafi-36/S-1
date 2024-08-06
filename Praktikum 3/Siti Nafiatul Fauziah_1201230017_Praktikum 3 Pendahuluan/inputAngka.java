import java.util.Scanner;

public class inputAngka {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka (1-9999) : ");
        int angka = input.nextInt();

        if (angka < 1 || angka > 9999) {
            System.out.println("Angka tidak valid");
        } else {

            String spell = "";

            int ribuan = angka / 1000;
            int ratusan = (angka % 1000) / 100;
            int puluhan = (angka % 100) / 10;
            int satuan = angka % 10;

            if (ribuan > 0) {
                if (ribuan == 1) {
                    spell += "Seribu ";
                } else {
                    spell += satuanAngka(ribuan) + " Ribu ";
                }
            }

            if (ratusan > 0) {
                if (ratusan == 1) {
                    spell += "Seratus ";
                } else {
                    spell += satuanAngka(ratusan) + " Ratus ";
                }
            }

            if (puluhan > 0) {
                if (puluhan == 1) {
                    if (satuan == 0) {
                        spell += "Sepuluh ";
                    } else if (satuan == 1) {
                        spell += "Sebelas ";
                    } else {
                        spell += satuanAngka(satuan) + " Belas ";
                    }
                } else {
                    spell += satuanAngka(puluhan) + " Puluh ";
                }
            }

            if (puluhan > 1 && satuan == 1) {
                spell += satuanAngka(satuan);
            } else if (satuan > 0 && satuan != 1) {
                spell += satuanAngka(satuan);
            } else if (puluhan != 1 && satuan > 0 && satuan == 1) {
                spell += satuanAngka(satuan);
            }

            System.out.println("Angka : " + spell);

        }
    }

    public static String satuanAngka(int angka) {
        if (angka == 1) {
            return "Satu";
        } else if (angka == 2) {
            return "Dua";
        } else if (angka == 3) {
            return "Tiga";
        } else if (angka == 4) {
            return "Empat";
        } else if (angka == 5) {
            return "Lima";
        } else if (angka == 6) {
            return "Enam";
        } else if (angka == 7) {
            return "Tujuh";
        } else if (angka == 8) {
            return "Delapan";
        } else {
            return "Sembilan";
        }
    }

}
