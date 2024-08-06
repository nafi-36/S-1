import java.util.Scanner;

public class ContohArray_1 {
    int arr[] = new int[10];
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ContohArray_1 ca = new ContohArray_1();
        ca.inputData();
        // ca.pengamatan1();
        // ca.pengamatan2();
        ca.viewData();
    }

    public void inputData() {
        int a = 0;
        System.out.println("Input Data");
        while (a < 10) {
            System.out.print("Nilai " + (a + 1) + " : ");
            arr[a] = sc.nextInt();
            a++;
        }
        System.out.println();
    }

    public void viewData() {
        int a = 0;
        System.out.println("View Data");
        while (a < 10) {
            System.out.println("Nilai " + (a + 1) + " : " + arr[a]);
            a++;
        }
        System.out.println();
    }

    // pengamatan 1
    public void pengamatan1() {
        int a = 0;
        System.out.println("Input Data");
        while (a <= 10) {
            System.out.print("Nilai " + (a + 1) + " : ");
            arr[a] = sc.nextInt();
            a++;
        }
        System.out.println();
    }
    // pengamatan 1 : tidak bisa, akan terjadi error ArrayIndexOutOfBounds karena indexnya melebihi range

    // pengamatan 2
    public void pengamatan2() {
        System.out.println("Input Data");
        for (int a = 0; a < 10; a ++) {
            System.out.print("Nilai " + (a + 1) + " : ");
            arr[a] = sc.nextInt();
        }
        System.out.println();
    }
}