import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan lima buah angka yang terdiri dari 3 digit :");
        String a = input.nextLine();
        String b = input.nextLine();
        String c = input.nextLine();
        String d = input.nextLine();
        String e = input.nextLine();

        System.out.println("Hasil pengecekan :");
        print(a);
        print(b);
        print(c);
        print(d);
        print(e);
    }

    static void print(String abc1) {
        if (cekChar(abc1)) {
            System.out.println(abc1 + " valid");
        } else {
            System.out.println(abc1 + " tidak valid");
        }
    }

    static boolean cekChar(String abc) {
        if (abc.length() != 3) {
            return false;
        }

        char char1 = abc.charAt(0);
        char char2 = abc.charAt(1);
        char char3 = abc.charAt(2);

        if (char1 >= char2 || char2 >= char3) {
            return false;
        }
 
        int angka3 = (int) char3;
        if (angka3 % 2 == 0) {
            return false;
        }

        return true;
    }
}