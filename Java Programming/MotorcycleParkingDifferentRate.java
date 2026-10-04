import java.util.Scanner;

public class MotorcycleParkingDifferentRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of parking hours: ");
        int hours = input.nextInt();

        int totalFee;

        if (hours <= 1) {
            totalFee = 3000;
        } else {
            totalFee = 3000 + (hours - 1) * 2000;
        }

        System.out.println("Total parking fee: Rp" + totalFee);

        input.close();
    }
}