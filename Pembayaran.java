// Interface kontrak
public interface Pembayaran {
    void prosesPembayaran(double jumlah);
    default void cetakBukti () {
        System.out.println("Bukti pembayaran telah dicetak.");
    }
}


