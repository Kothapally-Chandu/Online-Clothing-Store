package Project;
import java.util.*;

public class Women {
public static double sum = 0;
    public static void display() {
	Ascii.wAscii();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Top Wear");
        System.out.println("2. Bottom Wear");
        System.out.println("3. Foot Wear");
        System.out.println("4. Accessories");
        int option = sc.nextInt();

        if (option == 1) {  // Women's Top Wear
            System.out.println("1. T-Shirts");
            System.out.println("2. Tops");
            System.out.println("3. Blouses");
            System.out.println("4. Dresses");
            int opt = sc.nextInt();

            if (opt == 1) {
                System.out.println("1. H&M Price = 599");
                System.out.println("2. Zara Price = 899");
                System.out.println("3. Mango Price = 1299");
                System.out.println("4. Forever 21 Price = 799");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 599;
                } else if (brand == 2) {
                    sum += 899;
                } else if (brand == 3) {
                    sum += 1299;
                } else if (brand == 4) {
                    sum += 799;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 2) {
                System.out.println("1. Zara Price = 1299");
                System.out.println("2. H&M Price = 799");
                System.out.println("3. Forever 21 Price = 1199");
                System.out.println("4. Mango Price = 1499");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 1299;
                } else if (brand == 2) {
                    sum += 799;
                } else if (brand == 3) {
                    sum += 1199;
                } else if (brand == 4) {
                    sum += 1499;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 3) {
                System.out.println("1. H&M Price = 1599");
                System.out.println("2. Mango Price = 1799");
                System.out.println("3. Zara Price = 1899");
                System.out.println("4. Forever 21 Price = 1699");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 1599;
                } else if (brand == 2) {
                    sum += 1799;
                } else if (brand == 3) {
                    sum += 1899;
                } else if (brand == 4) {
                    sum += 1699;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 4) {
                System.out.println("1. Zara Price = 2999");
                System.out.println("2. H&M Price = 2499");
                System.out.println("3. Forever 21 Price = 1999");
                System.out.println("4. Mango Price = 3199");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 2999;
                } else if (brand == 2) {
                    sum += 2499;
                } else if (brand == 3) {
                    sum += 1999;
                } else if (brand == 4) {
                    sum += 3199;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            }
        } else if (option == 2) {  // Women's Bottom Wear
            System.out.println("1. Jeans");
            System.out.println("2. Skirts");
            System.out.println("3. Trousers");
            System.out.println("4. Leggings");
            int opt = sc.nextInt();

            if (opt == 1) {
                System.out.println("1. Levi's Price = 1799");
                System.out.println("2. Wrangler Price = 1599");
                System.out.println("3. Lee Price = 1699");
                System.out.println("4. H&M Price = 1299");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 1799;
                } else if (brand == 2) {
                    sum += 1599;
                } else if (brand == 3) {
                    sum += 1699;
                } else if (brand == 4) {
                    sum += 1299;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 2) {
                System.out.println("1. Forever 21 Price = 899");
                System.out.println("2. H&M Price = 799");
                System.out.println("3. Zara Price = 1299");
                System.out.println("4. Mango Price = 1499");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 899;
                } else if (brand == 2) {
                    sum += 799;
                } else if (brand == 3) {
                    sum += 1299;
                } else if (brand == 4) {
                    sum += 1499;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 3) {
                System.out.println("1. H&M Price = 1499");
                System.out.println("2. Zara Price = 1799");
                System.out.println("3. Mango Price = 1999");
                System.out.println("4. Forever 21 Price = 1699");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 1499;
                } else if (brand == 2) {
                    sum += 1799;
                } else if (brand == 3) {
                    sum += 1999;
                } else if (brand == 4) {
                    sum += 1699;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 4) {
                System.out.println("1. H&M Price = 799");
                System.out.println("2. Zara Price = 899");
                System.out.println("3. Puma Price = 1099");
                System.out.println("4. Nike Price = 1299");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 799;
                } else if (brand == 2) {
                    sum += 899;
                } else if (brand == 3) {
                    sum += 1099;
                } else if (brand == 4) {
                    sum += 1299;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            }
        } else if (option == 3) {  // Women's Foot Wear
            System.out.println("1. Flats");
            System.out.println("2. Heels");
            System.out.println("3. Boots");
            System.out.println("4. Sneakers");
            int opt = sc.nextInt();

            if (opt == 1) {
                System.out.println("1. H&M Price = 799");
                System.out.println("2. Zara Price = 999");
                System.out.println("3. Mango Price = 1299");
                System.out.println("4. Forever 21 Price = 699");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 799;
                } else if (brand == 2) {
                    sum += 999;
                } else if (brand == 3) {
                    sum += 1299;
                } else if (brand == 4) {
                    sum += 699;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 2) {
                System.out.println("1. H&M Price = 1499");
                System.out.println("2. Zara Price = 1899");
                System.out.println("3. Mango Price = 1699");
                System.out.println("4. Forever 21 Price = 1299");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 1499;
                } else if (brand == 2) {
                    sum += 1899;
                } else if (brand == 3) {
                    sum += 1699;
                } else if (brand == 4) {
                    sum += 1299;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 3) {
                System.out.println("1. H&M Price = 2499");
                System.out.println("2. Zara Price = 2999");
                System.out.println("3. Mango Price = 2299");
                System.out.println("4. Forever 21 Price = 1999");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 2499;
                } else if (brand == 2) {
                    sum += 2999;
                } else if (brand == 3) {
                    sum += 2299;
                } else if (brand == 4) {
                    sum += 1999;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 4) {
                System.out.println("1. Nike Price = 2599");
                System.out.println("2. Puma Price = 2199");
                System.out.println("3. Adidas Price = 2799");
                System.out.println("4. Reebok Price = 2499");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 2599;
                } else if (brand == 2) {
                    sum += 2199;
                } else if (brand == 3) {
                    sum += 2799;
                } else if (brand == 4) {
                    sum += 2499;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            }
        } else if (option == 4) {  // Women's Accessories
            System.out.println("1. Bags");
            System.out.println("2. Watches");
            System.out.println("3. Sunglasses");
            System.out.println("4. Jewelry");
            int opt = sc.nextInt();

            if (opt == 1) {
                System.out.println("1. Gucci Price = 15999");
                System.out.println("2. Louis Vuitton Price = 24999");
                System.out.println("3. Zara Price = 4999");
                System.out.println("4. H&M Price = 2999");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 15999;
                } else if (brand == 2) {
                    sum += 24999;
                } else if (brand == 3) {
                    sum += 4999;
                } else if (brand == 4) {
                    sum += 2999;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 2) {
                System.out.println("1. Rolex Price = 25999");
                System.out.println("2. Casio Price = 3999");
                System.out.println("3. Fossil Price = 7999");
                System.out.println("4. Tommy Hilfiger Price = 4999");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 25999;
                } else if (brand == 2) {
                    sum += 3999;
                } else if (brand == 3) {
                    sum += 7999;
                } else if (brand == 4) {
                    sum += 4999;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 3) {
                System.out.println("1. Ray-Ban Price = 9999");
                System.out.println("2. Oakley Price = 5999");
                System.out.println("3. Prada Price = 19999");
                System.out.println("4. H&M Price = 2999");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 9999;
                } else if (brand == 2) {
                    sum += 5999;
                } else if (brand == 3) {
                    sum += 19999;
                } else if (brand == 4) {
                    sum += 2999;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 4) {
                System.out.println("1. Swarovski Price = 6999");
                System.out.println("2. Tanishq Price = 14999");
                System.out.println("3. Zales Price = 19999");
                System.out.println("4. Cartier Price = 49999");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 6999;
                } else if (brand == 2) {
                    sum += 14999;
                } else if (brand == 3) {
                    sum += 19999;
                } else if (brand == 4) {
                    sum += 49999;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            }
        }

       // System.out.println("Total Sum: " + sum);
    }
}
