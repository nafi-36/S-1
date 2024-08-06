import java.util.Scanner;

public class hariLusa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
        System.out.print("Sekarang hari [1-7] : ");
        
        int option = input.nextInt();
        int pilih = option + 2;
        
        if (pilih > 7) {
            pilih = pilih % 7;
        }

        String hari = "";

        switch (pilih) {
            case 1:
                hari = "Senin";
                break;
            case 2:
                hari = "Selasa";
                break;
            case 3:
                hari = "Rabu";
                break;
            case 4:
                hari = "Kamis";
                break;
            case 5:
                hari = "Jumat";
                break;
            case 6:
                hari = "Sabtu";
                break;
            case 7:
                hari = "Minggu";
                break;
            default:
                break;
        }

        System.out.print("Lusa adalah hari    : " + hari);

    }
}