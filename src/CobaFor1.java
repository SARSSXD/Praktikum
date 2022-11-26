
/**
 *
 * @author SARSSXD
 */
public class CobaFor1 {

    public static void main(String[] args) {
        for (double jari = 1.0; jari <= 2.0; jari += 0.2) {
            System.out.println("Radius =" + jari + " Luas= " + jari * Math.PI * jari);
        }
    }

}

/* jadi ada contoh ini pernyataan jml=0 merupakan inisialisasi dari variabel. Selanjutnya, kondisi i<10 
diperiksa. Jika kondisi bernilai true, pernyataan di dalam for loop dieksekusi. Kemudian, 
ekspresi i++ dieksekusi, lalu akan kembali pada bagian pemeriksaan terhadap kondisi i<=10 lagi. 
Kondisi ini akan dilakukan berulang-ulang sampai mencapai nilai yang salah (false)*/