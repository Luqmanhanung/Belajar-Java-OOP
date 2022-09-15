public class BankAccount {
    int saldo;
    int no_rekening;
    String nama;

    void cek_saldo(int paramSaldo, int paramNo_Rekening, String paramNama){
        saldo = paramSaldo;
        no_rekening = paramNo_Rekening;
        nama = paramNama;
    }

    void menabung(int paramSaldo, int paramNo_Rekening , String paramNama ){
        saldo = paramSaldo;
        no_rekening = paramNo_Rekening;
        nama = paramNama;
    }

    void menarik(int paramSaldo, int paramNo_Rekening , String paramNama ){
        saldo = paramSaldo;
        no_rekening = paramNo_Rekening;
        nama = paramNama;
    }

    void transfer(int paramSaldo, int paramNo_Rekening , String paramNama ){
        saldo = paramSaldo;
        no_rekening = paramNo_Rekening;
        nama = paramNama;
    }

    void infoCekSaldo(){
        System.out.println("Rekening atas nama " + nama + " dengan No. Rekening  " + no_rekening + " memiliki saldo sebesar Rp. " + saldo);
    }

    void infoMenabung(){
        System.out.println("Rekening atas nama " + nama + " dengan No. Rekening " + no_rekening + " menabung sebesar Rp. " + saldo);
    }

    void infoMenarik(){
        System.out.println("Rekening atas nama " + nama + " dengan No. Rekening " + no_rekening + " menarik uang sebesar Rp. " + saldo);
    }

    void infoTransfer(){
        System.out.println("Rekening atas nama " + nama + " dengan No. Rekening " + no_rekening + " mengirim uang sebesar Rp. " + saldo);
    }


}
