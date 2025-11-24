
import java.util.Scanner;


public class Kallkulator {
    public static void main(String[] args) {
        Scanner Kal = new Scanner(System.in);
        
        int a, b, p;
        double s, r;
        
        System.out.println("==== Menu kalkulator ====");
        System.out.println("Pilih operasi hitung yang akan digunakan: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        
        
        System.out.println("Masukkan pilihan (1 - 4): ");
        p = Kal.nextInt();
        
        switch(p){
            case 1 :
        System.out.println("Masukkan angka 1: ");
        a = Kal.nextInt();
        System.out.println("Masukkan angka 2: ");
       b = Kal.nextInt();
        System.out.println("Hasil penjumlahan : " + (a+b));
                break;
            case 2 :
        System.out.println("Masukkan angka 1: ");
        a = Kal.nextInt();
        System.out.println("Masukkan angka 2: ");
       b = Kal.nextInt();
        System.out.println("Hasil pengurangan : " + (a-b));
                break;
            case 3 :
        System.out.println("Masukkan angka 1: ");
        a = Kal.nextInt();
        System.out.println("Masukkan angka 2: ");
       b = Kal.nextInt();
        System.out.println("Hasil perkalian : " + (a*b));
                break;
            case 4 :
        System.out.println("Masukkan angka 1: ");
        s = Kal.nextDouble();
        System.out.println("Masukkan angka 2: ");
       r = Kal.nextDouble();
        System.out.println("Hasil pembagian : " + (s/r));
                break;
                
            default:
                System.err.println("Menu tidak tersedia!!!");
        }
        
        
        
    }
}
