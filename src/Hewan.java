public class Hewan {
    String nama;
    int jumlahKaki;
    String makanan;
    String type;

    void Hewan(String paramNama, int paramJumlahKaki, String paramMakanan, String paramType){
        nama = paramNama;
        jumlahKaki = paramJumlahKaki;
        makanan = paramMakanan;
        type = paramType;
    }
    public void jalan(){
        System.out.println("Hewan bisa berjalan");
    }

    void infoHewan(){
        System.out.println("Nama Hewan : " + nama + "\n" + "Jumlah kaki : " + jumlahKaki + "\n" + "makanan : " + makanan + "\n" + "Type Hewan : " + type );
    }
}
