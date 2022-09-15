public class Nilai {
    public double nilaiUTS;
    public double nilaiUAS;
    public double nilaiTugas;
    public double nilaiTotal;

    public void setNilai(double paramNilaiUTS, double paramNilaiUAS, double paramNilaiTugas){
        this.nilaiUTS = paramNilaiUTS;
        this.nilaiUAS =paramNilaiUAS;
        this.nilaiTugas = paramNilaiTugas;
    }

    public void infoNilai(){
        System.out.println("Nilai UTS anda : " + nilaiUTS + ", Nilai UAS anda : " + nilaiUAS + ", Nilai Tugas anda : " + nilaiTugas);
    }

    public double nilaiMahasiswa1(double paramNilaiUTS){
        return this.nilaiUTS = paramNilaiUTS;
    }
    public double nilaiMahasiswa2(double paramNilaiUAS){
        return this.nilaiUAS = paramNilaiUAS;
    }
    public double nilaiMahasiswa3(double paramNilaiTugas){
        return this.nilaiTugas = paramNilaiTugas;
    }
}
