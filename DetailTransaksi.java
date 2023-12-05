//inheritance
public class DetailTransaksi extends Barang implements Pembayaran {
    private int jumlah;

    public DetailTransaksi(String nama, double hargaBarang, int jumlah) {
        super("", nama, hargaBarang, 0); 
        this.jumlah = jumlah;
    }

    public DetailTransaksi(String namaCustomer, String nomorHP, String alamat,
            String kodeBarang, String namaBarang, double hargaBarang, int jumlahBarang) {
        super(kodeBarang, namaBarang, hargaBarang, jumlahBarang);
        this.jumlah = jumlahBarang;
    }

    @Override
    public double hitungTotal() {
        return getHarga() * jumlah; 
    }

    @Override
    public String toString() {
        return super.toString() + "\nJumlah Barang: " + jumlah + "\nTotal Harga: " + hitungTotal();
    }
}
