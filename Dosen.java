public class Dosen extends Anggota {
    private String nidn;

    public Dosen(String id, String nama, String nidn) {
        super(id, nama);
        this.nidn = nidn;
    }

    
    public int getLimitPinjamBuku() {
        return 10; // Dosen boleh pinjam 10 buku
    }

    @Override
    public double hitungDenda(int terlambatHari) {
        return terlambatHari * 500; // Dosen lebih murah, Rp 500 perhari
    }
}