public class loop {
    public static void main(String[] args) {

        // while -> dicek dulu
        int c = 1;
        while (c <= 17) {
            System.out.print(c + " ");
            c++;
        }

        System.out.println();

        // do while -> dieksekusi minimal 1 kali, baru dicek
        int var1 = 0;
        do {
            var1 = var1 + 1;
        } while (var1 > 10);
        System.out.println(var1);

        // 0 - 9
        int var2 = 0;
        do {
            System.out.print(var2 + " ");
            var2 = var2 + 1;
        } while (var2 < 10);

        System.out.println();

        // for
        for (int i = 0; i <= 3; i++) {
            for (int a = 0; a <= 3; a++) {
                if (i == 0 || i == 2 || a == 0 || a == 3) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // break
        int w = 0;
        while (w < 10) {
            if (w == 6)
                break; // berhenti
            System.out.print(w + " ");
            w++;
        }

        System.out.println();

        // continue
        int p = 0;
        while (p < 10) {
            if (p == 6)
                continue; // looping forever
            System.out.print(p + " ");
            p++;
        }

        // return
        
    }
}

/*
 * 
 * KOMPONEN UTAMA LOOPING
 * - control variable -> variable yg digunakan dlm proses pengecekan jalannya
 * - perulangan
 * - initiate variable control -> penentuan nilai awal variable
 * - iteration -> modifikasi variable kontrol
 * - stop condition -> pengecekan kondisi berhenti. (berhenti jika kondisi
 * - berhenti terpenuhi, jalan jika kondisi berhenti belum terpenuhi)
 * - statement -> statement yg akan diulang
 * 
 * COLLECTIONS
 * - array
 * - arrayList / list
 * - maps
 * - stade
 * 
 * 
 */