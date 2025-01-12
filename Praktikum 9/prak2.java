import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Transaksi {
    Integer noTransaksi;
    Double total;
    String tanggal;

    public Transaksi(int noTransaksi, Double total, String tanggal) {
        this.noTransaksi = noTransaksi;
        this.total = total;
        this.tanggal = tanggal;
    }

    int getNoTransaksi() {
        return noTransaksi;
    }

    String getTanggal() {
        return tanggal;
    }

    Double getTotal() {
        return total;
    }

    public String toString() {
        return noTransaksi + " " + tanggal + " " + total;
    }
}

class MyObjectComparatorByTotal implements Comparator<Transaksi> {
    // @Override
    // public int compare(Transaksi obj1, Transaksi obj2) {
    //     return Double.compare(obj1.getTotal(), obj2.getTotal());
    // }

    @Override
    public int compare(Transaksi obj1, Transaksi obj2) {
        return obj1.getTanggal().compareTo(obj2.getTanggal());
    }
}

class CollectionsComparator {
    public static void main(String[] args) {
        CollectionsComparator cs = new CollectionsComparator();
        ArrayList<Transaksi> arr = new ArrayList<>();
        arr.add(new Transaksi(1, 752000.0, "2023-12-13"));
        arr.add(new Transaksi(2, 647000.0, "2023-12-14"));
        arr.add(new Transaksi(3, 872000.0, "2023-12-14"));
        arr.add(new Transaksi(4, 90000.0, "2023-12-15"));
        arr.add(new Transaksi(5, 123450.0, "2023-12-16"));
        cs.traversal(arr, "Original data");
        Collections.sort(arr, new MyObjectComparatorByTotal());
        cs.traversal(arr, "Ascending");
        // Collections.reverse(arr);
        // cs.traversal(arr, "Descending");
    }

    void traversal(ArrayList<Transaksi> data, String jenis) {
        System.out.println("Data Transaksi sort " + jenis + " : ");
        for (Transaksi t : data) {
            System.out.print(t);
        }
        System.out.println();
    }
}