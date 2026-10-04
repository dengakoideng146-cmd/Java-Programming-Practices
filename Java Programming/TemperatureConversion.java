import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double reaumur = celsius * 4 / 5;

        System.out.println("Temperature in Réaumur: " + reaumur);

        input.close();
    }
}