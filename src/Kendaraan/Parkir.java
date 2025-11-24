
package Kendaraan;

public class Parkir {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        
        v.setnoPol("N 1234 AA");
        v.setmerk("Toyota");
        v.settahun(2022);
        
        System.out.println("=============================");
        System.out.println("No. Polisi   : " + v.getnoPol());
        System.out.println("Merk         : " + v.getmerk());
        System.out.println("Tahun        : " + v.gettahun());
    }
}
