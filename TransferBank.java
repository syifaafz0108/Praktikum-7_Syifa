// Implementasi 1 (Diperbaiki dari 'implementasi' menjadi 'implements')
public class TransferBank implements Pembayaran {
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Transfer bank Rp " + jumlah + " berhasil.");
    }
}