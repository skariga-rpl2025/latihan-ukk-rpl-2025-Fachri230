
import java.util.Scanner;


public class Voting {
    public static void main(String[] args) {
        Scanner vote = new Scanner(System.in);
        
        int s = 0, r = 0;
        String p;
        boolean selesai = false;
        
        do {
            System.out.println("==== PROGRAM VOTING OSIS ====");
            System.out.println("(ketik selesai untuk mengakhiri)");
            System.out.println("Masukkan pilihan anda (A/B) :");
            p = vote.nextLine();
            
            if (p.equals("selesai")) {
                selesai = true;
            } else if (p.equals("A")){
               s++; 
            }else{
                r++;
            }
        } while (!selesai);
            System.out.println("----------------------------------");
            System.out.println("HASIL  HITUNG CEPAT: ");
            System.out.println("Total suara kandidat A : " + s);
            System.out.println("Total suara kandidat B : " + r);
    }
}
