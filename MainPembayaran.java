public class MainPembayaran {
    public static void main (String[] args) {
        Pembayaran[] metode = {
            new TransferBank(),
            new EWallet()
        };
        for (Pembayaran p : metode) {
            p.prosesPembayaran(150000);
            p.cetakBukti();
            System.out.println("---");
        }
    }
}