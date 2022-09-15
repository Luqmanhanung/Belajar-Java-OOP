public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan k1 = new Karyawan();
        Manager mng = new Manager();
        k1.setNama("Luqman");
        k1.setGaji(2300);
        k1.setUsia(23);

        System.out.println(k1.getNama());
        System.out.println(k1.getGaji());
        System.out.println(k1.getUsia());
        System.out.println(mng.jamKerja());
        System.out.println(mng.getGajiManager());

    }
}
