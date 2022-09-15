public class Buku {
    String namaPengarang;
    String judulBuku;
    int tahunTerbit;
    int cetakanKe;
    double hargaJual;


    public void setNamaPengarang(String paramnamaPengarang) {
        this.namaPengarang = paramnamaPengarang;
    }

    public void setJudulBuku(String paramJudulBuku) {
        this.judulBuku = paramJudulBuku;
    }

    public void setTahunTerbit(int paramTahunTerbit) {
        this.tahunTerbit = paramTahunTerbit;
    }

    public void setCetakanKe(int paramCetakanKe) {
        this.cetakanKe = paramCetakanKe;
    }

    public void setHargaJual(double paramHargaJual) {
        this.hargaJual = paramHargaJual;
    }

    public void infoBuku(){
        System.out.println("Nama pengarang : " + namaPengarang + ", Judul buku : " + judulBuku + ", Tahun terbit : " + tahunTerbit + ", Cetakan ke- " + cetakanKe + ", Harga jual : " + hargaJual);
    }
}
