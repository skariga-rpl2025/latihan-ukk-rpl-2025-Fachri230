
import java.util.Scanner;


public class AnggotaGym {
    public static void main(String[] args) {
        Scanner daft = new Scanner(System.in);
        String n, g;
        int a = 0;
        boolean t = false;
        
        
        do {
        System.out.println("==== PENDAFTARAN GYM ====");
        System.out.println("Masukkan nama anggota : ");
        n = daft.nextLine();
        System.out.println("Daftar anggota lagi? [ya/tidak]: ");
        g = daft.nextLine();
        System.out.println("----------------------------------------");
        System.out.println("Total anggota yang di daftarkan: " + a);
            if (g.equals("ya / YA")) {
                a++;
            } else if(g.equals("tidak / TIDAK")){
                
            }
        
        } while (!t);
        
    }
}
