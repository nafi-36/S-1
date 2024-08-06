import java.util.ArrayList;
import java.util.Collections;

class Transaksi implements Comparable<Transaksi> {
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

    // compareTo untuk mengkomparsi
    // Penggunaan compareTo tidak dapat digunakan untuk tipe data primitive 

    // @Override
    // public int compareTo(Transaksi transaksi) {
    //     return this.total.compareTo(transaksi.total);
    // }

    // @Override
    // public int compareTo(Transaksi transaksi) {
    //     return this.noTransaksi.compareTo(transaksi.noTransaksi);
    // }

    @Override
    public int compareTo(Transaksi transaksi) {
        return this.tanggal.compareTo(transaksi.tanggal);
    }
}

class CollectionsComparable {
    public static void main(String[] args) {
        CollectionsComparable cs = new CollectionsComparable();
        ArrayList<Transaksi> arr = new ArrayList<>();
        arr.add(new Transaksi(1, 752000.0, "2023-12-13"));
        arr.add(new Transaksi(2, 647000.0, "2023-12-14"));
        arr.add(new Transaksi(3, 872000.0, "2023-12-14"));
        arr.add(new Transaksi(4, 90000.0, "2023-12-15"));
        arr.add(new Transaksi(5, 123450.0, "2023-12-16"));
        cs.traversal(arr, "Original data");
        Collections.sort(arr);
        cs.traversal(arr, "Ascending");
        Collections.reverse(arr);
        cs.traversal(arr, "Descending");
        // untuk mereverse data harus disort terlebih dahulu bari direverse
    }

    void traversal(ArrayList<Transaksi> data, String jenis) {
        System.out.println("Data Transaksi sort " + jenis + " : ");
        for (int a = 0; a < data.size(); a++) {
            System.out.print(data.get(a) + " ");
            System.out.println();
        }
        System.out.println();
    }
}