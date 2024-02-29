public class bag {
    String kode;
    String jenis;
    String nama;
    int stok;
 
    public bag (String kode, String jenis, String nama,int stok) {
     this.kode = kode;
     this.jenis = jenis;
     this.nama = nama;
     this.stok = stok;
    }
 
    public String getkode(){
     return kode;
    }
    public String getjenis(){
     return jenis;
    }
    public String getnama(){
     return nama;
    }
    public int getstok(){
     return stok;
    }
 
 public String toString() {
     return "bag [kode barang = " + kode + ", jenis barang = " + jenis + ", nama barang = " + nama + ", stok barang = " + stok + "] \n";
 }
    
 }
 
 