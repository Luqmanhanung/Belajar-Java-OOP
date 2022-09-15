public class MethodAbstractDemo {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        JajarGenjang jg = new JajarGenjang();
        Lingkaran lg = new Lingkaran();
        Segitiga sg = new Segitiga();
        System.out.println(pp.luas());
        System.out.println(pp.keliling());
        System.out.println(jg.luas());
        System.out.println(jg.keliling());
        System.out.println(lg.luas());
        System.out.println(lg.keliling());
        System.out.println(sg.luas());
        System.out.println(sg.keliling());
    }
}
