package Project;
import java.util.*;

public class Payments {
	Scanner sc = new Scanner(System.in);
	public void display(){
		System.out.println("Select Payment Method:");
                System.out.println("1. Credit/Debit Card");
                System.out.println("2. UPI (Google Pay, Paytm, etc.)");
                System.out.println("3. Cash on Delivery (COD)");
                System.out.println("4. Digital Wallet (PayPal, Amazon Pay)");
                int paymentOption = sc.nextInt();

                String selectedPaymentMethod = "";
                switch (paymentOption) {
                    case 1:
                        selectedPaymentMethod = "Credit/Debit Card";
                        break;
                    case 2:
                        selectedPaymentMethod = "UPI (Google Pay, Paytm, etc.)";
                        break;
                    case 3:
                        selectedPaymentMethod = "Cash on Delivery (COD)";
                        break;
                    case 4:
                        selectedPaymentMethod = "Digital Wallet (PayPal, Amazon Pay)";
                        break;
                    default:
                        System.out.println("Invalid payment option.");
                        break;
                }

                System.out.println("You have selected: " + selectedPaymentMethod);
		ClothingStore1 obj = new ClothingStore1();
               // System.out.println("Total Amount: " + obj.bill);
                System.out.println("Do you want to confirm the payment and proceed to the payment page?");
                System.out.println("1. Yes, Confirm Payment");
                System.out.println("2. No, Change Payment Option");
                int confirmChoice = sc.nextInt();

                if (confirmChoice == 1) {
                    
                    System.out.println("Redirecting to the Payment Page...");
			                } 
		else if (confirmChoice == 2) {
                    System.out.println("You can change your payment option.");
                } 
		else {
                    System.out.println("Invalid choice. Returning to main menu.");
                }
	}
}