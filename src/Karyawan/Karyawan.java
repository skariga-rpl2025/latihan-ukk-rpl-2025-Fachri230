package Karyawan;


public class Karyawan {

    private String nip;
    private String nama;
    private String divisi;
    
    public String getnip(){
        return nip;
    }
        public void setnip(String nip){
            this.nip = nip;
        }
        
        public String getnama(){
            return nama;
        }
        
        public void setnama(String nama){
            this.nama = nama;
    }
        public String getdivisi(){
            return divisi;
        }
        public void setdivisi(String divisi){
            this.divisi = divisi;
        }
}

