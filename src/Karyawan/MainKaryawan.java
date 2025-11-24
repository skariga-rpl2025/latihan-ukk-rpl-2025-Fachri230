
package Karyawan;

public class MainKaryawan {
    public static void main(String[] args) {
        Karyawan inp = new Karyawan();
        
        inp.setnip("K001");
        inp.setnama("Budi Hartono");
        inp.setdivisi("Marketing");
        
        System.out.println("==== Data karyawan ====");
        System.out.println("NIP  : " + inp.getnip());
        System.out.println("Nama  : " + inp.getnama());
        System.out.println("Divisi : " + inp.getdivisi());
    }
}
