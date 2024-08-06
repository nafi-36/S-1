import java.util.ArrayList;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("===== DESCENDING SORT =====");
        System.out.println("Masukkan 5 bilangan :");
        Scanner inp = new Scanner(System.in);

        int a1 = inp.nextInt();
        int a2 = inp.nextInt();
        int a3 = inp.nextInt();
        int a4 = inp.nextInt();  
        int a5 = inp.nextInt();

        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
        arr.add(a4);
        arr.add(a5);

        System.out.println("Data sebelum diurutkan :");
        System.out.println(arr);

        selectionSort(arr);

        System.out.println("Data setelah diurutkan :");
        System.out.println(arr);
    }

    static void selectionSort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size()-1; i ++){
            int mindex = i;
            for (int j = i + 1; j < arr.size(); j ++) {
                if (arr.get(j) > arr.get(mindex)) {
                    // ubah tanda operator diatas untuk mengubah format asc / desc 
                    mindex = j;
                }
            }

            // menukar element terkecil dengan element pertama dibagian yang belum diurutkan
            int temp = arr.get(mindex);
            arr.set(mindex, arr.get(i));
            arr.set(i, temp);
        }
    }
}
