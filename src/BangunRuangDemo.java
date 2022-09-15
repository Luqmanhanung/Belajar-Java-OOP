public class BangunRuangDemo {
    public static void main(String[] args) {
        Balok blk = new Balok();
        Kubus kbs = new Kubus();
        Bola bl = new Bola();
        Kerucut kcrt = new Kerucut();
        PrismaSegitiga ps = new PrismaSegitiga();
        System.out.println(blk.volume());
        System.out.println(blk.luasSelimut());
        System.out.println(kbs.volume());
        System.out.println(kbs.luasSelimut());
        System.out.println(bl.volume());
        System.out.println(bl.luasSelimut());
        System.out.println(kcrt.volume());
        System.out.println(kcrt.luasSelimut());
        System.out.println(ps.volume());
        System.out.println(ps.luasSelimut());

    }

}
