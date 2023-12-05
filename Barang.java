public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private double harga;
    private int jumlahBeli;
    private double totalBayar;

    public Barang(String kodeBarang, String namaBarang, double harga, int jumlahBeli) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    public void hitungTotalBayar(){
        totalBayar = getTotalHarga();
    }

    private double getTotalHarga() {
        return 0;
    }

    public String getKodeBarang(){
        return kodeBarang;
    }

    public String getNamaBarang(){
        return namaBarang;
    }

    public double getHarga() {
        return harga;
    }

    public double getjumlahBeli() {
        return jumlahBeli;
    }
}