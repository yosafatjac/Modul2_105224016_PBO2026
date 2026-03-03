import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang ruangan: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar ruangan: ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi ruangan: ");
        double tinggi = input.nextDouble();

        double luasDinding = 2 * tinggi * (panjang + lebar);
        double literCat = Math.ceil(luasDinding / 10);

        System.out.println("\nLuas permukaan dinding: " + luasDinding + " m²");
        System.out.println("Liter cat yang dibutuhkan: " + literCat + " liter");

        input.close();
    }
}