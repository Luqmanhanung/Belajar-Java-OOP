public class HewanDemo {
    public static void main(String[] args) {
        Hewan hwn1 = new Hewan();
        Hewan hwn2 = new Hewan();
        hwn1.Hewan("Harimau", 4, "Daging" , "Karnivora");
        hwn2.Hewan("Kerbau", 4, "Rumput", "Herbivora");
        hwn1.infoHewan();
        hwn2.infoHewan();
        Elang elang = new Elang();
        hwn1.jalan();
        elang.jalan();
    }
}
