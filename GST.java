 import java.util.Scanner;

public class gst {

    
    public static double calculateGST(double amount, double gstRate) {
        return (amount * gstRate) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter original amount: ₹ ");
        double amount = sc.nextDouble();

        System.out.print("Enter GST rate (%): ");
        double gstRate = sc.nextDouble();

        
        double gstAmount = calculateGST(amount, gstRate);
        double totalAmount = amount + gstAmount;

        
        System.out.println("GST Amount: ₹ " + gstAmount);
        System.out.println("Total Amount with GST: ₹ " + totalAmount);
        
        sc.close();
    }
}
