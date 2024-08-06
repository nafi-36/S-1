import java.util.ArrayList;
import java.util.Scanner;

class Rekening {
    private int no;
    private String nama;
    private double saldo;

    public Rekening(int no, String nama, double saldo) {
        this.no = no;
        this.nama = nama;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNo() {
        return no;
    }

    public String getNama() {
        return nama;
    }
}

class BankOfMiddleEarth {
    Scanner inp = new Scanner(System.in);
    ArrayList<Rekening> arrRek = new ArrayList<>();
    double saldoMinimal = 500000;

    public static void main(String[] args) {
        BankOfMiddleEarth b = new BankOfMiddleEarth();
        b.menu();
    }

    private void menu() {
        int pilihan = 0;
        while (pilihan != 6) {
            System.out.println("Pilihan Menu :");
            System.out.println("1. Buat Rekening");
            System.out.println("2. Lihat Rekening");
            System.out.println("3. Tabung");
            System.out.println("4. Tarik");
            System.out.println("5. Transfer");
            System.out.println("6. Keluar Program");
            System.out.print("Pilihan : ");
            pilihan = inp.nextInt();

            if (pilihan == 1) {
                buatRekening();
            } else if (pilihan == 2) {
                System.out.print("Masukkan No. Rekening : ");
                int noRek = inp.nextInt();
                cekRekening(noRek);
                infoRekening(noRek);
            } else if (pilihan == 3) {
                tabung();
            } else if (pilihan == 4) {
                tarik();
            } else if (pilihan == 5) {
                transfer();
            } else if (pilihan == 6) {
                System.out.println("Keluar dari program...");
            }
        }
    }

    private void buatRekening() {
        System.out.println("===== Buat Rekening Baru =====");
        System.out.println("Masukkan data rekening baru");
        System.out.print("Nama : ");
        String nama = inp.next();
        System.out.print("Saldo : ");
        double saldo = inp.nextDouble();

        if (saldo < saldoMinimal) {
            System.out.println("Saldo awal tidak mencukupi");
        } else {
            int no;
            if (!arrRek.isEmpty()) {
                no = arrRek.get(arrRek.size() - 1).getNo() + 1;
                // jika array sudah terisi, maka no rekening diambilkan dari rekening terakhir
                // yang ditambahkan, kemudian ditambahkan 1
            } else {
                no = 1;
                // jika array masih kosong, maka no rekening adalah 1
            }
            Rekening rek = new Rekening(no, nama, saldo);
            arrRek.add(rek);
            System.out.println("Rekening telah ditambahkan");
        }
    }

    private int cekRekening(int no) {
        int ketemu = -1;
        for (int a = 0; a < arrRek.size(); a++) {
            if (arrRek.get(a).getNo() == no) {
                ketemu = a;
                break;
            }
        }
        return ketemu;
    }

    private void infoRekening(int no) {
        int pos = cekRekening(no);
        if (pos >= 0) {
            System.out.println("===== Informasi Rekening =====");
            System.out.println("No. Rekening : " + arrRek.get(no - 1).getNo());
            System.out.println("Nama : " + arrRek.get(no - 1).getNama());
            System.out.println("Saldo : " + arrRek.get(no - 1).getSaldo());
        } else {
            System.out.println("No. Rekening tidak ditemukan");
        }
    }

    private void tabung() {
        System.out.println("===== Tabung Saldo =====");
        System.out.print("Masukkan No. Rekening : ");
        int noRek = inp.nextInt();
        int pos = cekRekening(noRek);
        if (pos >= 0) {
            System.out.println("Masukkan jumlah nominal yang ditabung : ");
            double jumlah = inp.nextDouble();
            double saldoAkhir = arrRek.get(pos).getSaldo() + jumlah;
            arrRek.get(pos).setSaldo(saldoAkhir);
            System.out.println("Saldo telah ditambahkan");
        } else {
            System.out.println("No. Rekening tidak ditemukan, Transkasi dibatalkan");
        }
    }

    private void tarik() {
        System.out.println("===== Tarik Saldo =====");
        System.out.print("Masukkan No. Rekening : ");
        int noRek = inp.nextInt();
        int pos = cekRekening(noRek);
        if (pos >= 0) {
            System.out.println("Masukkan jumlah nominal yang ditarik : ");
            double jumlah = inp.nextDouble();
            // cek apakah saldo akhir masih cukup atau tidak
            double saldoAkhir = arrRek.get(pos).getSaldo() - jumlah;
            if (saldoAkhir >= saldoMinimal) {
                arrRek.get(pos).setSaldo(saldoAkhir);
                System.out.println("Transaksi Selesai");
            } else {
                System.out.println("Saldo tidak cukup, Transaksi dibatalkan");
            }
        } else {
            System.out.println("No. Rekening tidak ditemukan, Transkasi dibatalkan");
        }
    }

    private void transfer() {
        System.out.println("===== Transfer Saldo =====");
        System.out.print("Masukkan No. Rekening Asal : ");
        int noRekAsal = inp.nextInt();
        System.out.print("Masukkan No. Rekening Tujuan : ");
        int noRekTujuan = inp.nextInt();

        int posAsal = cekRekening(noRekAsal);
        int posTujuan = cekRekening(noRekTujuan);

        if ((posAsal >= 0) && (posTujuan >= 0)) {
            System.out.println("Masukkan nominal yang akan ditransfer : ");
            double jumlah = inp.nextDouble();
            double saldoAkhirAsal = arrRek.get(posAsal).getSaldo() - jumlah;
            if (saldoAkhirAsal >= saldoMinimal) {
                arrRek.get(posAsal).setSaldo(saldoAkhirAsal);
                double saldoAkhirTujuan = arrRek.get(posTujuan).getSaldo() + jumlah;
                arrRek.get(posTujuan).setSaldo(saldoAkhirTujuan);
                System.out.println("Transfer telah dilaksanakan");
            } else {
                System.out.println("Saldo tidak cukup, Transaksi dibatalkan");
            }
        } else {
            System.out.println("No. Rekening tidak ditemukan");
        }
    }
} 