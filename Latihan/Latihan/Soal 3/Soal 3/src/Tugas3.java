import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        final int HARGA_A = 25500;
        final int HARGA_B = 14200;
        
        System.out.print("Jumlah Barang A: ");
        int jumlahA = input.nextInt();
        
        System.out.print("Jumlah Barang B: ");
        int jumlahB = input.nextInt();
        
        System.out.print("Uang dibayarkan: ");
        int uangBayar = input.nextInt();
        
        int total = (jumlahA * HARGA_A) + (jumlahB * HARGA_B);
        int ppn = total * 11 / 100;   // 11%
        int totalBayar = total + ppn;
        
        int kembalian = uangBayar - totalBayar;
        
        if (kembalian < 0) {
            System.out.println("Uang tidak cukup!");
        } else {
            int lembar50 = kembalian / 50000;
            int sisa = kembalian % 50000;
            
            int lembar10 = sisa / 10000;
            
            System.out.println("Total Belanja + PPN: Rp " + totalBayar);
            System.out.println("Uang Kembalian     : Rp " + kembalian);
            System.out.println("Lembar 50.000      : " + lembar50);
            System.out.println("Lembar 10.000      : " + lembar10);
        }
        
        input.close();
    }
}