package perpus;

import java.util.ArrayList;

public class Siswa implements User {
    
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public Siswa() {
        this.namaSiswa.add("Rosa");  
        this.alamat.add("Batu");
        this.telepon.add("081123345567");
        this.status.add(true);
        
        this.namaSiswa.add("Nisa");
        this.alamat.add("Malang");
        this.telepon.add("081098876654");
        this.status.add(true);
    }
    
    public void setStatus(boolean status) {
        this.status.add(status);
    }
    public Boolean getStatus(int idSiswa) {
        return this.status.get(idSiswa);
    }
    public void editStatus(int idSiswa, boolean status) {
        this.status.set(idSiswa, status);;
    }
    
    public int getJmlSiswa() {
        return this.status.size();
    }
    
    @Override
    public void setNama(String namaSiswa) {
        this.namaSiswa.add(namaSiswa);
    }
    
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
    @Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }
    
    @Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }
    
    @Override
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    }
    
}
