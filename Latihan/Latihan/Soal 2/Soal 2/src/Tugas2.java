import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = input.nextDouble();
        
        double fahrenheit = (celcius * 9/5) + 32;
        double kelvin = celcius + 273.15;
        double reamur = celcius * 4/5;
        
        System.out.printf("Fahrenheit: %.2f\n", fahrenheit);
        System.out.printf("Kelvin    : %.2f\n", kelvin);
        System.out.printf("Reamur    : %.2f\n", reamur);
        
        input.close();
    }
}