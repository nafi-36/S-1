package perpus;

import java.util.ArrayList;
import java.util.Scanner;

public class Kembali {

    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();

    public Kembali() {
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.banyak.add(0);
    }

    public void prosesKembali(Siswa siswa, Kembali kembali, Buku buku) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Mengembalikan Buku");
        System.out.println("Masukkan ID Anda ");
        int idSiswa = myObj.nextInt();
        System.out.println("Selamat datang di perpustakaan " + siswa.getNama(idSiswa));
        ArrayList<Integer> idBuku = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        do {
            System.out.println("Masukkan kode Buku:");
            temp = myObj.nextInt();
            if (temp != 99) {
                idBuku.add(temp);
                System.out.print(buku.getNamaBuku(idBuku.get(i)) + " sebanyak : ");
                banyak.add(myObj.nextInt());
                i++;
            }
        } while (temp != 99);
        if (!siswa.getStatus(idSiswa)) {
            int x = idBuku.size();
            for (int j = 0; j < x; j++) {
                siswa.editStatus(idSiswa, !siswa.getStatus(idSiswa));
                System.out.println("Berhasil kembalikan buku");
                kembali.setKembali(buku, idSiswa, idBuku.get(j), banyak.get(j));
            }
        } else {
            System.out.println("belum meninjam buku");
        }
    }

    public void setKembali(Buku buku, int idSiswa, int idBuku, int banyaknya) {
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyaknya);
        buku.editStok(idBuku, buku.getStok(idBuku) + banyaknya);
    }

    public int getIdBuku(int id) {
        return this.idBuku.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdSiswa(int id) {
        return this.idSiswa.get(id);
    }

    public int getJmlKembali() {
        return this.idSiswa.size();
    }
}