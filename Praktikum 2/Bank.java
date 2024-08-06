import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Bank {
    public static void main(String[] args) {
        Rekening rk1 = new Rekening();
        Rekening rk2 = new Rekening();

        rk1.tambahRekening();
        rk2.tambahRekening();

        rk1.inSaldo();
        rk2.inSaldo();

        rk1.outSaldo();
        rk2.outSaldo();

        rk1.lihatSaldo();
        rk2.lihatSaldo();
    }
}

class Rekening {

    String noRek;
    String nasabah;
    double saldo;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(isr);

    public void tambahRekening() {
        try {
            String temp = "";
            System.out.println("===== Menambahkan Rekening =====");
            System.out.print("No. Rekening : ");
            noRek = input.readLine();
            System.out.print("Nama Nasabah: ");
            nasabah = input.readLine();
            System.out.print("Saldo Awal : ");
            temp = input.readLine();
            saldo = Double.parseDouble(temp);
            pressEnter();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void lihatSaldo() {
        System.out.println("===== Menampilkan Saldo =====");
        System.out.println("No. Rekening : " + noRek);
        System.out.println("Nama Nasabah : " + nasabah);
        System.out.println("Total Saldo : " + saldo);
        pressEnter();
    }

    public void tambahSaldo(double plusSaldo) { // parameter formal
        System.out.println("===== Tambah Saldo =====");
        System.out.println("Saldo awal : " + saldo);
        this.saldo = this.saldo + plusSaldo;
        System.out.println("Saldo yang ditambah : " + plusSaldo);
        System.out.println("Total Saldo : " + saldo);
        System.out.println("Berhasil menambah saldo");
        System.out.println("Data telah diupdate");
        pressEnter();
    }

    public void tarikSaldo(double minSaldo) { // parameter formal
        System.out.println("===== Tarik Saldo =====");
        System.out.println("Saldo awal : " + saldo);
        this.saldo = this.saldo - minSaldo;
        System.out.println("Saldo yang ditarik : " + minSaldo);
        System.out.println("Total Saldo : " + saldo);
        System.out.println("Berhasil menarik saldo");
        System.out.println("Data telah diupdate");
        pressEnter();
    }

    public void inSaldo() {
        String temp = "";
        double newSaldo = 0;
        System.out.print("Masukkan saldo yang ditambah: ");
        try {
            temp = input.readLine();
            newSaldo = Double.parseDouble(temp);
        } catch (IOException e) {
            System.out.println(e);
        }
        tambahSaldo(newSaldo); // parameter aktual
    }

    public void outSaldo() {
        String temp = "";
        double newSaldo = 0;
        System.out.print("Masukkan saldo yang ditarik: ");
        try {
            temp = input.readLine();
            newSaldo = Double.parseDouble(temp);
        } catch (IOException e) {
            System.out.println(e);
        }
        tarikSaldo(newSaldo); // parameter aktual
    }

    public void pressEnter() {
        try {
            System.out.println("Tekan enter untuk melanjutkan");
            input.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
