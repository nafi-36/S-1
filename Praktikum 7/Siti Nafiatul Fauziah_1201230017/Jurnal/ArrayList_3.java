import java.util.ArrayList;
import java.util.Random;

public class ArrayList_3 {
    ArrayList<Integer> arrList = new ArrayList<Integer>();
    Random getRandom = new Random();

    public static void main(String[] args) {
        ArrayList_3 al3 = new ArrayList_3();
        al3.inputData();
        al3.viewData();
        al3.reverseViewData();
        al3.exampleMethods();
    }

    void inputData() {
        int jml = 0;
        while (jml < 10) {
            int inputan = getRandom.nextInt(101);
            arrList.add(inputan); // Penambahan data ke ArrayList
            jml++;
        }
    }

    void viewData() {
        int a = 0;
        int arrMax = arrList.size();
        System.out.println("View data menggunakan size");
        while (a < arrMax) {
            // Mengambil nilai dari ArrayList pada index ke-a
            int nilai = arrList.get(a);
            System.out.println("No " + (a + 1) + ". " + nilai);
            a++;
        }
    }

    // pengamatan 5
    void reverseViewData() {
        System.out.println("\nReverse View Data");
        int a = arrList.size() - 1;
        while (a >= 0) {
            int nilai = arrList.get(a);
            System.out.println("No " + (a + 1) + ". " + nilai);
            a--;
        }
    }

    // pengamatan 3 & 4
    void exampleMethods() {
        boolean containsFive = arrList.contains(5);
        System.out.println("\nArrayList contains 5 : " + containsFive);

        int indexOfFive = arrList.indexOf(5);
        System.out.println("Index of 5 : " + indexOfFive);

        int lastIndexFive = arrList.lastIndexOf(5);
        System.out.println("Last index of 5 : " + lastIndexFive);

        arrList.add(5); // menambahkan nilai 5 diakhir
        System.out.println("After adding 5 : " + arrList);

        arrList.add(1, 5); // menambahkan nilai 5 di index ke-1
        System.out.println("After adding 5 at index 1 : " + arrList); // indexnya bertambah 1

        arrList.set(1, 10); // mengganti nilai di index 1 menjadi 10
        System.out.println("After setting 10 at index 1 : " + arrList); // indexnya tetap

        arrList.remove(5);
        System.out.println("After removing index 5 : " + arrList);

        arrList.clear();
        System.out.println("After clearing the ArrayList : " + arrList);
    }
}

// pengamatan 2
// size() = mengembalikan nilai panjang dari ArrayList
// add() = menambahkan data pada ArrayList
// get() = mengakses element dalam ArrayList