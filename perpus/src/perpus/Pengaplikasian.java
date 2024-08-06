package perpus;

import java.util.Scanner;

public class Pengaplikasian {

    public static void main (String []args) {
        Buku buku= new Buku();
        Siswa siswa= new Siswa();
        Peminjaman pinjam = new Peminjaman();
        Laporan lap= new Laporan();
        Kembali kembali= new Kembali();
        Petugas petugas= new Petugas();
        
        lap.laporan(petugas);
        lap.laporan(buku);
        lap.laporan(siswa);
        pinjam.prosesPinjam(siswa, pinjam, buku);
        lap.laporan(pinjam, buku);
        lap.laporan(buku);
        lap.laporan(siswa);
        kembali.prosesKembali(siswa, kembali, buku);
        lap.laporan (buku);
        lap.laporan (siswa);
        
    }
    
}
