public class buku {
    String judul;
    String penulis;
    String tahun_terbit;

    public buku (String judul, String penulis, String tahun_terbit){
        this.judul = judul;
        this.penulis = penulis;
        this.tahun_terbit = tahun_terbit;
    }
    
    public String getJudul() {
        return judul;
    }
    
    
    public String getPenulis() {
        return penulis;
    }
    
    
    public String getTahun_terbit() {
        return tahun_terbit;
    }
    
    @Override
    public String toString() {
        return "\nJudul = " + judul + ", Penulis = " + penulis + ", Tahun Terbit = " + tahun_terbit + ".";
    }
    
}
