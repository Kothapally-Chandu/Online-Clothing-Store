package Project;
import java.util.*;

public class Mens {
	public static double Sum = 0;
    public static void display() {
	Ascii.mAscii();
        Scanner sc = new Scanner(System.in);
        
		System.out.println("1. Top Wear");
      		System.out.println("2. Bottom Wear");
        	System.out.println("3. Foot Wear");
        	System.out.println("4. Accessories");
        	int option = sc.nextInt();
	
	if(option==1){
		System.out.println("1. T-Shirts");
                System.out.println("2. Shirts");
                System.out.println("3. Jackets");
                System.out.println("4. Hoodies");
                int opt = sc.nextInt();
                
                if (opt == 1) { 
                    System.out.println("1. DnmX  Price = 350");
                    System.out.println("2. Nike Price = 750");
                    System.out.println("3. Puma Price = 1500");
                    System.out.println("4. Zara Price = 1250");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 350;
                    } else if (brand == 2) {
                        Sum += 750;
                    } else if (brand == 3) {
                        Sum += 1500;
                    } else if (brand == 4) {
                        Sum += 1250;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                } 
		else if (opt == 2) { 
                    System.out.println("1. Arrow Price = 999");
                    System.out.println("2. Van Heusen Price = 1299");
                    System.out.println("3. Peter England Price = 799");
                    System.out.println("4. Levi's Price = 1399");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 999;
                    } else if (brand == 2) {
                        Sum += 1299;
                    } else if (brand == 3) {
                        Sum += 799;
                    } else if (brand == 4) {
                        Sum += 1399;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                } 
		else if (opt == 3) { 
                    System.out.println("1. H&M Price = 2500");
                    System.out.println("2. Zara Price = 3500");
                    System.out.println("3. Levi's Price = 3000");
                    System.out.println("4. Tommy Hilfiger Price = 4500");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 2500;
                    } else if (brand == 2) {
                        Sum += 3500;
                    } else if (brand == 3) {
                        Sum += 3000;
                    } else if (brand == 4) {
                        Sum += 4500;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                } 
		else if (opt == 4) { 
                    System.out.println("1. Puma Price = 1999");
                    System.out.println("2. Nike Price = 2799");
                    System.out.println("3. Adidas Price = 2499");
                    System.out.println("4. Reebok Price = 1799");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 1999;
                    } else if (brand == 2) {
                        Sum += 2799;
                    } else if (brand == 3) {
                        Sum += 2499;
                    } else if (brand == 4) {
                        Sum += 1799;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                }
            } 
	else if (option == 2) {
                System.out.println("1. Jeans");
                System.out.println("2. Trousers");
                System.out.println("3. Shorts");
                System.out.println("4. Track Pants");
                int opt = sc.nextInt();

                if (opt == 1) { 
                    System.out.println("1. Denim  Price = 2500");
                    System.out.println("2. Mufti Price = 3500");
                    System.out.println("3. Lee Cooper Price = 2200");
                    System.out.println("4. Van Heusen Price = 3250");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 2500;
                    } else if (brand == 2) {
                        Sum += 3500;
                    } else if (brand == 3) {
                        Sum += 2200;
                    } else if (brand == 4) {
                        Sum += 3250;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                } 
		else if (opt == 2) { 
                    System.out.println("1. Van Heusen Price = 1800");
                    System.out.println("2. Peter England Price = 999");
                    System.out.println("3. Levi's Price = 1999");
                    System.out.println("4. Mufti Price = 2299");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 1800;
                    } else if (brand == 2) {
                        Sum += 999;
                    } else if (brand == 3) {
                        Sum += 1999;
                    } else if (brand == 4) {
                        Sum += 2299;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                }
		else if (opt == 3) { 
                    System.out.println("1. Adidas Price = 1299");
                    System.out.println("2. Puma Price = 999");
                    System.out.println("3. H&M Price = 899");
                    System.out.println("4. Nike Price = 1499");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 1299;
                    } else if (brand == 2) {
                        Sum += 999;
                    } else if (brand == 3) {
                        Sum += 899;
                    } else if (brand == 4) {
                        Sum += 1499;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                } 
		else if (opt == 4) { 
                    System.out.println("1. Adidas Price = 1299");
                    System.out.println("2. Nike Price = 1500");
                    System.out.println("3. Puma Price = 1299");
                    System.out.println("4. Reebok Price = 1000");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 1299;
                    } else if (brand == 2) {
                        Sum += 1500;
                    } else if (brand == 3) {
                        Sum += 1299;
                    } else if (brand == 4) {
                        Sum += 1000;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                }
            } 
	    else if (option == 3) {
                
                System.out.println("1. Casual Shoes");
                System.out.println("2. Formal Shoes");
                System.out.println("3. Boots");
                System.out.println("4. Sandals");
                int opt = sc.nextInt();

                if (opt == 1) { 
                    System.out.println("1. Nike Price = 2150");
                    System.out.println("2. Adidas Price = 3150");
                    System.out.println("3. Reebok Price = 2150");
                    System.out.println("4. Puma Price = 3150");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 2150;
                    } else if (brand == 2) {
                        Sum += 3150;
                    } else if (brand == 3) {
                        Sum += 2150;
                    } else if (brand == 4) {
                        Sum += 3150;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                } 
		else if (opt == 2) { 
                    System.out.println("1. Bata Price = 3250");
                    System.out.println("2. Woodland Price = 2750");
                    System.out.println("3. Clarks Price = 3350");
                    System.out.println("4. Allen Cooper Price = 2750");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 3250;
                    } else if (brand == 2) {
                        Sum += 2750;
                    } else if (brand == 3) {
                        Sum += 3350;
                    } else if (brand == 4) {
                        Sum += 2750;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                } 
		else if (opt == 3) { 
                    System.out.println("1. Caterpillar Price = 4000");
                    System.out.println("2. TimberLand Price = 5550");
                    System.out.println("3. Dr. Martens Price = 3800");
                    System.out.println("4. Saint Laurent Price = 2750");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 4000;
                    } else if (brand == 2) {
                        Sum += 5550;
                    } else if (brand == 3) {
                        Sum += 3800;
                    } else if (brand == 4) {
                        Sum += 2750;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                } 
		else if (opt == 4) { 
                    System.out.println("1. Sparx Price = 850");
                    System.out.println("2. Sketchers Price = 1250");
                    System.out.println("3. Adidas Price = 2150");
                    System.out.println("4. Puma Price = 1950");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 850;
                    } else if (brand == 2) {
                        Sum += 1250;
                    } else if (brand == 3) {
                        Sum += 2150;
                    } else if (brand == 4) {
                        Sum += 1950;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                }
            } 
	    else if (option == 4) {
                System.out.println("1. Watches");
                System.out.println("2. Sunglasses");
                System.out.println("3. Hats");
                System.out.println("4. Belts");
                int opt = sc.nextInt();

                if (opt == 1) { // Watches
                    System.out.println("1. Titan Price = 3250");
                    System.out.println("2. Fastrack Price = 1750");
                    System.out.println("3. Fossil Price = 1500");
                    System.out.println("4. Omega Price = 1450");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 3250;
                    } else if (brand == 2) {
                        Sum += 1750;
                    } else if (brand == 3) {
                        Sum += 1500;
                    } else if (brand == 4) {
                        Sum += 1450;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                } 
		else if (opt == 2) { 
                    System.out.println("1. Ray-Ban Price = 2500");
                    System.out.println("2. Oakley Price = 3000");
                    System.out.println("3. Vogue Price = 1700");
                    System.out.println("4. Persol Price = 4000");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 2500;
                    } else if (brand == 2) {
                        Sum += 3000;
                    } else if (brand == 3) {
                        Sum += 1700;
                    } else if (brand == 4) {
                        Sum += 4000;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                } 
		else if (opt == 3) { 
                    System.out.println("1. Adidas Price = 700");
                    System.out.println("2. Nike Price = 850");
                    System.out.println("3. Puma Price = 650");
                    System.out.println("4. Reebok Price = 600");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 700;
                    } else if (brand == 2) {
                        Sum += 850;
                    } else if (brand == 3) {
                        Sum += 650;
                    } else if (brand == 4) {
                        Sum += 600;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                } 
		else if (opt == 4) { 
                    System.out.println("1. Allen Cooper Price = 500");
                    System.out.println("2. Wildhorn Price = 850");
                    System.out.println("3. Tommy Hilfiger Price = 950");
                    System.out.println("4. Levi's Price = 750");
                    int brand = sc.nextInt();
                    if (brand == 1) {
                        Sum += 500;
                    } else if (brand == 2) {
                        Sum += 850;
                    } else if (brand == 3) {
                        Sum += 950;
                    } else if (brand == 4) {
                        Sum += 750;
                    } else {
                        System.out.println("Please select a correct brand.");
                    }
                }

		}
	}
}