import java.sql.SQLOutput;

public class CustomerData {
    String nama;
    String alamat;
    int tanggalLahir;
    String pekerjaan;
    int gaji;

    public void getCustomer(String paramNama, String paramAlamat, int paramTanggalLahir, String paramPekerjaan, int paramGaji){
        this.nama = paramNama;
        this.alamat = paramAlamat;
        this.tanggalLahir = paramTanggalLahir;
        this.pekerjaan = paramPekerjaan;
        this.gaji = paramGaji;
    }
    public void infoCustomer(){
        System.out.println("Nama : " + nama + ", alamat : " + alamat + ", Tanggal Lahir : " + tanggalLahir + ", Pekerjaan : " + pekerjaan + ", Gaji : " +gaji);
    }
}
