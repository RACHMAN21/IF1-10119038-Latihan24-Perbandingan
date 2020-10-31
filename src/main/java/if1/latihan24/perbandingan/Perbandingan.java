package if1.latihan24.perbandingan;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : Program ini berisi untuk menampilkan perbandingan nilai
 *                     pertama dan nilai kedua
 */

import java.util.Scanner; // import kelas scanner

public class Perbandingan {
    static final Scanner sc = new Scanner(System.in);
    int nilai1, nilai2;
    
    public void masukkanNilai() {
        System.out.println("=====Program Perbandingan Nilai=====");
        // memasukkan nilai pertama
        System.out.println("Masukkan Nilai Pertama : ");
        nilai1 = sc.nextInt();
        // memasukkan nilai kedua 
        System.out.println("Masukkan Nilai Kedua   : ");
        nilai2 = sc.nextInt();
    }
    
    public String nilaiPerbandingan() {
        // validasi perbadingan nilai
        return (nilai1 < nilai2)? nilai1 + " lebih kecil dari " + nilai2 :
               (nilai1 > nilai2)? nilai1 + " lebih besar dari " + nilai2 :
                                  nilai1 + " sama dengan " + nilai2;
    }
    
    public void ulangPerbandingan() {
        // mengulang perbandingan
        System.out.print("Ulangi Aktifitas? (Ya/Tidak) : ");
        if(sc.next().equals("Ya")) {
            System.out.print("\n");
            mulaiBanding();
        }
    }
    
    public void tampilPerbandingan(String hasil) {
        // menampilkan hasil dari perbandingan
        System.out.println("Hasil : " + hasil);
    }
    
    public void mulaiBanding() {
        masukkanNilai();
        tampilPerbandingan(nilaiPerbandingan());
        ulangPerbandingan();
    }
    
    public static void main(String[] args) {
        Perbandingan perbandingan = new Perbandingan();
        perbandingan.mulaiBanding();
        System.out.println("Developed by : Rachman Aldiansyah");
    }
}