import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("=== SISTEM PAYROLL PERUSAHAAN ===");
      
        System.out.print("Nama Karyawan : ");
        String nama = input.nextLine();

        System.out.print("Gaji Pokok (Rp) : ");
        double gajiPokok = input.nextDouble();

        System.out.print("Jumlah Jam Lembur : ");
        int jamLembur = input.nextInt();

        double upahLemburPerJam = gajiPokok / 173;
        double totalLembur = jamLembur * upahLemburPerJam;
        double gajiBruto = gajiPokok + totalLembur;
        double pajak = 0.05 * gajiBruto;
        double bpjs = 0.01 * gajiPokok;
        double gajiNetto = gajiBruto - pajak - bpjs;

        System.out.println("\n=== SLIP GAJI ===");
        System.out.println("Karyawan           : " + nama);
        System.out.printf("Upah Lembur/Jam    : Rp %.2f\n", upahLemburPerJam);
        System.out.printf("Total Uang Lembur  : Rp %.2f\n", totalLembur);
        System.out.printf("Gaji Bruto         : Rp %.2f\n", gajiBruto);
        System.out.println("----------------------------------");
        System.out.printf("Potongan Pajak (5%%): Rp %.2f\n", pajak);
        System.out.printf("Potongan BPJS (1%%) : Rp %.2f\n", bpjs);
        System.out.println("----------------------------------");
        System.out.printf("GAJI BERSIH (NETTO): Rp %.2f\n", gajiNetto);
        System.out.println("==================================");

        input.close();
    }
}