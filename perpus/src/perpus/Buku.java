package perpus;

import java.util.ArrayList;

public class Buku {

    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public Buku() {
        this.namaBuku.add("Buku umum");
        this.stok.add(20);
        this.harga.add(20000);
        
        this.namaBuku.add("Buku agama");
        this.stok.add(15);
        this.harga.add(15000);
        
        this.namaBuku.add("Buku novel");
        this.stok.add(10);
        this.harga.add(10000);
    }
    
    public int getJmlBuku() {
        return this.namaBuku.size();
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku.add(namaBuku);
    }

    public String getNamaBuku(int idBuku) {
        return this.namaBuku.get(idBuku);
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }

    public int getStok(int idBuku) {
        return this.stok.get(idBuku);
    }

    public void editStok(int idBuku, int stok) {
        this.stok.set(idBuku, stok);;
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idBuku) {
        return this.harga.get(idBuku);
    }
    
}
