import java.util.Scanner;

public class CalculateChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: Rp");
        double purchaseAmount = input.nextDouble();

        System.out.print("Enter the amount paid: Rp");
        double amountPaid = input.nextDouble();

        if (amountPaid >= purchaseAmount) {
            double change = amountPaid - purchaseAmount;
            System.out.println("Change: Rp" + change);
        } else {
            double shortage = purchaseAmount - amountPaid;
            System.out.println("Payment is insufficient.");
            System.out.println("You need Rp" + shortage + " more.");
        }

        input.close();
    }
}