public class loop2 {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9};
        contohForEach(a);
    }

    static void contohForEach(int[] theArr) {
        int total = 0;
        for (int element : theArr) {
            total = total + element;
            System.out.print(element + " ");
        }
        System.out.println("\nJumlah : " + total);
    }
}
