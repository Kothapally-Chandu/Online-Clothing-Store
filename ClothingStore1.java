package Project;
import java.util.*;
import java.util.regex.*;

public class ClothingStore1 {
    static int Sum = 0;
    
    public static boolean isAuthenticated = false;

    public static void main(String[] args) {
	Ascii.wel();
         Scanner sc = new Scanner(System.in);
         boolean mainMenu = true;

      while (!isAuthenticated) {
            System.out.println("Welcome to the Clothing Store!");
            System.out.println("1. Login");
            System.out.println("2. Signup");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                Authenticated obj = new Authenticated();
		obj.Login();
            } 
	    else if (choice == 2) {
                Authenticated obj = new Authenticated();
		obj.SignUp();
		
                //System.out.println("Signup successful! You can now login with your credentials.");
            } 
	    else if (choice == 3) {
                System.out.println("Exiting the store. Goodbye!");
                return; 
            } 
	    else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        while (mainMenu) {
		
		System.out.println("Please Select Your Cateogry");
		System.out.println("1. Mens wear");
		System.out.println("2. Women's wear");
		System.out.println("3. Kids wear");
		System.out.println("4. Payments Options");
		System.out.println("5. Exit");

	int select = sc.nextInt();
	if(select==1){
		Mens obj1 = new Mens();
		obj1.display();
	}
	else if(select==2){
		Women obj2 = new Women();
		obj2.display();
	}
	else if(select==3){
		Kids obj3 = new Kids();
		obj3.display();
	}
	else if(select==4){
		Payments obj4 = new Payments();
		
		obj4.display();
		double bill=Mens.Sum+Women.sum+Kids.sum;
		 System.out.println("Your Total bill = " +bill); 
	}
	else if(select==5){
		mainMenu=false;
	}
      }  
	if(!mainMenu){
		 double bill=Mens.Sum+Women.sum+Kids.sum;
		 System.out.println("Your Total bill = " +bill); 
		System.out.println("Thank you for visiting our store. Have a great day!");             
	}
        sc.close();
    }
}
