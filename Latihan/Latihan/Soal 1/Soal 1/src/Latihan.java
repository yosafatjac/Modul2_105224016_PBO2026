//soal 1


import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang ruangan: ");
        double Panjang = input.nextDouble();
        
        System.out.print("Masukkan lebar ruangan: ");
        double Lebar = input.nextDouble();
        
        System.out.print("Masukkan tinggi ruangan: ");
        double Tinggi = input.nextDouble();
        
        double LuasDinding = 2 * Tinggi * (Panjang + Lebar);
        
        double LiterCat = Math.ceil(LuasDinding / 10);
        
        System.out.println("\nLuas permukaan dinding: " + LuasDinding + " m kubik");
        System.out.println("Liter cat yang dibutuhkan: " + LiterCat + " liter");
        
        input.close();
    }
}

