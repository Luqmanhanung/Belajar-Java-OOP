public class PegawaiDemo {
    public static void main(String[] args) {
        Pegawai pgw1 = new Pegawai();
        Pegawai pgw2 = new Pegawai();
        Pegawai pgw3 = new Pegawai();
        Pegawai pgw4 = new Pegawai();
        Pegawai pgw5 = new Pegawai();

        pgw1.setNama("Luqman");
        pgw1.setNip(200313124);
        pgw1.setGaji(100000000F);
        System.out.println(pgw1.nama);
        System.out.println(pgw1.nip);
        System.out.println(pgw1.gaji);

        pgw2.setNama("Hanung");
        pgw2.setNip(200313125);
        pgw2.setGaji(200000000F);
        System.out.println(pgw2.nama);
        System.out.println(pgw2.nip);
        System.out.println(pgw2.gaji);

        pgw3.setNama("Asidiq");
        pgw3.setNip(200313126);
        pgw3.setGaji(300000000F);
        System.out.println(pgw3.nama);
        System.out.println(pgw3.nip);
        System.out.println(pgw3.gaji);

        pgw4.setNama("Tono");
        pgw4.setNip(200313127);
        pgw4.setGaji(400000000F);
        System.out.println(pgw4.nama);
        System.out.println(pgw4.nip);
        System.out.println(pgw4.gaji);

        pgw5.setNama("Doni");
        pgw5.setNip(200313128);
        pgw5.setGaji(500000000F);
        System.out.println(pgw5.nama);
        System.out.println(pgw5.nip);
        System.out.println(pgw5.gaji);
    }
}
