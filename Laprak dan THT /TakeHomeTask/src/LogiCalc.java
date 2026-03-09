import java.util.Scanner;

public class LogiCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("=== SISTEM LOGICALC FASTSEND ===");
        System.out.print("Masukkan Nama Klien    : ");
        String namaKlien = sc.nextLine();
        System.out.print("Masukkan Berat (Kg)    : ");
        double berat = sc.nextDouble();
        System.out.print("Masukkan Jarak (Km)    : ");
        int jarak = sc.nextInt();
        System.out.print("Masukkan Jumlah Box    : ");
        int jumlahBox = sc.nextInt();

        int trukPenuh = jumlahBox / 150;
        int sisaBox = jumlahBox % 150;
        double dasarBiaya = (15000 * jarak) + (5500 * berat);
        double asuransi = 0.035 * dasarBiaya;
        double totalBayar = dasarBiaya + asuransi;
        int jam = jarak / 60;
        int menit = jarak % 60;

        System.out.println();
        System.out.println("=== RESI PENGIRIMAN ===");
        System.out.println("Klien           : " + namaKlien);
        System.out.println("Total Box       : " + jumlahBox + " box");
        System.out.println("Kebutuhan Armada: " + trukPenuh + " Truk Penuh dan sisa " + sisaBox + " box via Pikap.");
        System.out.println();
        System.out.println("Estimasi Waktu  : " + jam + " Jam " + menit + " Menit (Asumsi 60km/jam)");
        System.out.println();
        System.out.println("=== RINCIAN BIAYA ===");
        System.out.println("Dasar Biaya     : Rp " + dasarBiaya);
        System.out.println("Asuransi (3.5%) : Rp " + asuransi);
        System.out.println("-----------------------------------");
        System.out.println("TOTAL BAYAR     : Rp " + totalBayar);
        System.out.println("===================================");
    }
}