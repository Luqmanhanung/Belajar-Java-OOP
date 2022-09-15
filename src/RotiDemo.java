public class RotiDemo {
    public static void main(String[] args) {
        Roti roti = new Roti();
        Roti roti1 = new Roti();
        Roti roti2 = new Roti();
        Roti roti3 = new Roti();

        roti.beriWarna("Kuning");
        roti.beriRasa("Pandan");
        roti.timbangBerat(30);
        roti.hargaJual(6000);

        roti1.beriWarna("Merah");
        roti1.beriRasa("Durian");
        roti1.timbangBerat(20);
        roti1.hargaJual(7000);

        roti2.beriWarna("Hijau");
        roti2.beriRasa("Greentea");
        roti2.timbangBerat(31);
        roti2.hargaJual(8000);

        roti3.beriWarna("Ungu");
        roti3.beriRasa("Taro");
        roti3.timbangBerat(25);
        roti3.hargaJual(9000);

        roti.infoRoti();
        roti1.infoRoti();
        roti2.infoRoti();
        roti3.infoRoti();
    }
}
