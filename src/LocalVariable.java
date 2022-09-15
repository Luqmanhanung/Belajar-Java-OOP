public class LocalVariable {
    int usia = 0;

    public void hitungUsia(){

        int tahunSekarang = 2022;
        int tahunLahir = 1999;

        usia = tahunSekarang - tahunLahir;
        System.out.println("Usia saya adalah " + usia);
    }
    public void beratBadan(){
        int beratLahir = 3;

        int beba = beratLahir + (usia / 2);
        System.out.println("berat badan saya adalh " + beba);
    }
}
