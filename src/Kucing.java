public class Kucing extends Pet{
    String warnaBulu;

    int umur;
    void meong(){
        System.out.println("meong...meong");
    }
    int umur(){
        return umur;
    }


    public String perilaku(){
        return "Hewan penurut dan lucu";
    }

    public String suara(){
        return "meong...meong..";
    }

    public String favorit(){
        return "Menyukai Ikan";
    }
}
