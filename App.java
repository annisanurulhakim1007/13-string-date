import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //exception
        try {
            System.out.println("Masukkan Nomor Faktur:");
            String noFaktur = scanner.nextLine();

            System.out.println("Masukkan Nama Customer:");
            String namaCustomer = scanner.nextLine();
            Customer customer = new Customer(namaCustomer, namaCustomer, namaCustomer);

            System.out.println("Masukkan Nomor HP:");
            String nomorHP = scanner.nextLine();

            System.out.println("Masukkan Alamat:");
            String alamat = scanner.nextLine();

            System.out.println("Masukkan Kode Barang:");
            String kodeBarang = scanner.nextLine();

            System.out.println("Masukkan Nama Barang:");
            String namaBarang = scanner.nextLine();

            System.out.println("Masukkan Harga Barang:");
            double hargaBarang = scanner.nextDouble();

            System.out.println("Masukkan Jumlah Beli:");
            int jumlahBeli = scanner.nextInt();

            DetailTransaksi transaksi = new DetailTransaksi(namaCustomer, nomorHP, alamat, kodeBarang, namaBarang, hargaBarang, jumlahBeli);
            
            //Date
            Date date = new Date();
            SimpleDateFormat hari = new SimpleDateFormat ("'Hari/Tanggal \t :' EEEEEEEEEE dd-MM-yyyy");
            SimpleDateFormat jam = new SimpleDateFormat ("'Waktu \t\t:' hh:mm:ss z");

            //Struk
            System.out.println("\n===== STRUK PEMBELIAN HAPPY MART =====\n");
            System.out.println(hari.format(date));
            System.out.println(jam.format(date));
            System.out.println("========================");
            System.out.println("\nDATA PELANGGAN");
            System.out.println("---------------------");
            System.out.println("Nama Pelanggan\t: " + namaCustomer);
            System.out.println("Nomor HP\t: " + nomorHP);
            System.out.println("Alamat\t: "+ alamat);
            System.out.println("++++++++++++++++++++++++");
            System.out.println("\nDATA PEMBELIAN BARANG\n");
            System.out.println("------------------------------");
            System.out.println("Kode Barang\t: " + kodeBarang);
            System.out.println("Nama Barang\t: " + namaBarang);
            System.out.println("Harga Barang\t: " + hargaBarang);
            System.out.println("Jumlah Beli\t: " + jumlahBeli);
            System.out.println("TOTAL BAYAR\t: " + jumlahBeli*hargaBarang);
            System.out.println("++++++++++++++++++++++++");
            System.out.println("\nNama Kasir\t: Annisa Nurul Hakim");

            //Upper Case
            System.out.println("toUpperCase\t: " + namaCustomer.toUpperCase());

        } catch (Exception e) {
            System.out.println("Input salah: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}