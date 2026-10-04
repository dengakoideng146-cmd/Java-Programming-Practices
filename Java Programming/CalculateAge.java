import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        int currentYear = 2026;
        int age = currentYear - birthYear;

        System.out.println("Your age is: " + age + " years");

        input.close();
    }
}