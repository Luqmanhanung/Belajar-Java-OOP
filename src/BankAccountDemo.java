public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount BA = new BankAccount();
        BA.cek_saldo(1000, 2109313, "Budi");
        BA.menabung(2000, 2109313, "Budi");
        BA.menarik(42000, 2109313, "Budi");
        BA.transfer(56000, 2109313, "Budi");
        BA.infoCekSaldo();
        BA.infoMenabung();
        BA.infoMenarik();
        BA.infoTransfer();
    }
}
