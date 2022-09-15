public class Pet {
    private String nama;

    public void beriNama(String paramBeriNama){
        this.nama =paramBeriNama;
    }
    public String panggilNama(){
        return this.nama;
    }

    public String perilaku(){
        return "Hewan Penurut";
    }
}
