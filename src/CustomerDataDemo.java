public class CustomerDataDemo {
    public static void main(String[] args) {
        CustomerData cd = new CustomerData();
        cd.nama = "Luqman";
        cd.alamat = "Solo";
        cd.tanggalLahir = 22;
        cd.pekerjaan = "QA Engineer";
        cd.gaji = 90000000;
        cd.infoCustomer();
        cd.nama = "Budi";
        cd.alamat = "Sukoharjo";
        cd.tanggalLahir = 23;
        cd.pekerjaan = "Frondend Developer";
        cd.gaji = 30000000;
        cd.infoCustomer();
    }
}
