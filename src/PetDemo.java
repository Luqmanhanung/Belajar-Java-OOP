public class PetDemo {
    public static void main(String[] args) {
        Pet pt = new Pet();
        Anjing an = new Anjing();
        Kucing kc = new Kucing();
        kc.beriNama("TOM");
        System.out.println(kc.panggilNama());
        System.out.println(kc.favorit());
        System.out.println(kc.suara());
        an.beriNama("BULL");
        System.out.println(an.panggilNama());
        System.out.println(an.favorit());
        an.suara();

    }
}
