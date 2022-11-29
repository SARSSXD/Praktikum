
/**
 *
 * @author SARSSXD
 */
public class cobaFor {

    public static void main(String[] args) {
        // TODO code application logic here
        int jml = 0;
        for (int i = 1; i <= 10; i++) {
            jml += 1;
        }
        System.out.print("Jumlah Semua Bilangan ! " + jml);
    }

}

/* jadi ada contoh ini pernyataan jml=0 merupakan inisialisasi dari variabel. Selanjutnya, kondisi i<10 
diperiksa. Jika kondisi bernilai true, pernyataan di dalam for loop dieksekusi. Kemudian, 
ekspresi i++ dieksekusi, lalu akan kembali pada bagian pemeriksaan terhadap kondisi i<=10 lagi. 
Kondisi ini akan dilakukan berulang-ulang sampai mencapai nilai yang salah (false)*/
