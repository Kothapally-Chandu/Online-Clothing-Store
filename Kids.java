package Project;
import java.util.*;

public class Kids {
public static double sum = 0;
    public static void display() {
	Ascii.kAscii();
        Scanner sc = new Scanner(System.in);
        //public double sum = 0;

        System.out.println("1. Top Wear");
        System.out.println("2. Bottom Wear");
        System.out.println("3. Foot Wear");
        System.out.println("4. Accessories");
        int option = sc.nextInt();

        if (option == 1) {  // Kids' Top Wear
            System.out.println("1. T-Shirts");
            System.out.println("2. Tops");
            System.out.println("3. Sweatshirts");
            System.out.println("4. Dresses");
            int opt = sc.nextInt();

            if (opt == 1) {
                System.out.println("1. H&M Price = 499");
                System.out.println("2. Zara Price = 799");
                System.out.println("3. Mango Price = 999");
                System.out.println("4. Mothercare Price = 599");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 499;
                } else if (brand == 2) {
                    sum += 799;
                } else if (brand == 3) {
                    sum += 999;
                } else if (brand == 4) {
                    sum += 599;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 2) {
                System.out.println("1. Zara Price = 1299");
                System.out.println("2. H&M Price = 799");
                System.out.println("3. Mothercare Price = 999");
                System.out.println("4. Gap Price = 1499");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 1299;
                } else if (brand == 2) {
                    sum += 799;
                } else if (brand == 3) {
                    sum += 999;
                } else if (brand == 4) {
                    sum += 1499;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 3) {
                System.out.println("1. H&M Price = 799");
                System.out.println("2. Gap Price = 1099");
                System.out.println("3. Zara Price = 1299");
                System.out.println("4. Mothercare Price = 899");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 799;
                } else if (brand == 2) {
                    sum += 1099;
                } else if (brand == 3) {
                    sum += 1299;
                } else if (brand == 4) {
                    sum += 899;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 4) {
                System.out.println("1. Zara Price = 1599");
                System.out.println("2. H&M Price = 999");
                System.out.println("3. Mothercare Price = 1299");
                System.out.println("4. Gap Price = 1799");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 1599;
                } else if (brand == 2) {
                    sum += 999;
                } else if (brand == 3) {
                    sum += 1299;
                } else if (brand == 4) {
                    sum += 1799;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            }
        } else if (option == 2) {  // Kids' Bottom Wear
            System.out.println("1. Jeans");
            System.out.println("2. Shorts");
            System.out.println("3. Leggings");
            System.out.println("4. Trousers");
            int opt = sc.nextInt();

            if (opt == 1) {
                System.out.println("1. Levi's Price = 999");
                System.out.println("2. H&M Price = 799");
                System.out.println("3. Zara Price = 1299");
                System.out.println("4. Gap Price = 1099");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 999;
                } else if (brand == 2) {
                    sum += 799;
                } else if (brand == 3) {
                    sum += 1299;
                } else if (brand == 4) {
                    sum += 1099;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 2) {
                System.out.println("1. H&M Price = 499");
                System.out.println("2. Gap Price = 699");
                System.out.println("3. Zara Price = 799");
                System.out.println("4. Mothercare Price = 599");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 499;
                } else if (brand == 2) {
                    sum += 699;
                } else if (brand == 3) {
                    sum += 799;
                } else if (brand == 4) {
                    sum += 599;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 3) {
                System.out.println("1. H&M Price = 599");
                System.out.println("2. Zara Price = 799");
                System.out.println("3. Gap Price = 1099");
                System.out.println("4. Mothercare Price = 799");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 599;
                } else if (brand == 2) {
                    sum += 799;
                } else if (brand == 3) {
                    sum += 1099;
                } else if (brand == 4) {
                    sum += 799;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 4) {
                System.out.println("1. Zara Price = 799");
                System.out.println("2. Gap Price = 899");
                System.out.println("3. H&M Price = 799");
                System.out.println("4. Mothercare Price = 999");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 799;
                } else if (brand == 2) {
                    sum += 899;
                } else if (brand == 3) {
                    sum += 799;
                } else if (brand == 4) {
                    sum += 999;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            }
        } else if (option == 3) {  // Kids' Foot Wear
            System.out.println("1. Flats");
            System.out.println("2. Sandals");
            System.out.println("3. Boots");
            System.out.println("4. Sneakers");
            int opt = sc.nextInt();

            if (opt == 1) {
                System.out.println("1. H&M Price = 499");
                System.out.println("2. Zara Price = 699");
                System.out.println("3. Nike Price = 799");
                System.out.println("4. Skechers Price = 999");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 499;
                } else if (brand == 2) {
                    sum += 699;
                } else if (brand == 3) {
                    sum += 799;
                } else if (brand == 4) {
                    sum += 999;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 2) {
                System.out.println("1. Zara Price = 899");
                System.out.println("2. H&M Price = 799");
                System.out.println("3. Skechers Price = 1299");
                System.out.println("4. Adidas Price = 1499");
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
                System.out.println("1. H&M Price = 1299");
                System.out.println("2. Zara Price = 1499");
                System.out.println("3. Nike Price = 1799");
                System.out.println("4. Puma Price = 1599");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 1299;
                } else if (brand == 2) {
                    sum += 1499;
                } else if (brand == 3) {
                    sum += 1799;
                } else if (brand == 4) {
                    sum += 1599;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 4) {
                System.out.println("1. Nike Price = 1599");
                System.out.println("2. Adidas Price = 1699");
                System.out.println("3. Puma Price = 1399");
                System.out.println("4. Reebok Price = 1599");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 1599;
                } else if (brand == 2) {
                    sum += 1699;
                } else if (brand == 3) {
                    sum += 1399;
                } else if (brand == 4) {
                    sum += 1599;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            }
        } else if (option == 4) {  // Kids' Accessories
            System.out.println("1. Bags");
            System.out.println("2. Watches");
            System.out.println("3. Sunglasses");
            System.out.println("4. Jewelry");
            int opt = sc.nextInt();

            if (opt == 1) {
                System.out.println("1. H&M Price = 799");
                System.out.println("2. Zara Price = 999");
                System.out.println("3. Kipling Price = 1299");
                System.out.println("4. Disney Price = 599");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 799;
                } else if (brand == 2) {
                    sum += 999;
                } else if (brand == 3) {
                    sum += 1299;
                } else if (brand == 4) {
                    sum += 599;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 2) {
                System.out.println("1. Casio Price = 4999");
                System.out.println("2. Fossil Price = 7999");
                System.out.println("3. Timex Price = 1999");
                System.out.println("4. Disney Price = 2999");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 4999;
                } else if (brand == 2) {
                    sum += 7999;
                } else if (brand == 3) {
                    sum += 1999;
                } else if (brand == 4) {
                    sum += 2999;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 3) {
                System.out.println("1. Ray-Ban Price = 9999");
                System.out.println("2. H&M Price = 5999");
                System.out.println("3. Oakley Price = 7999");
                System.out.println("4. Disney Price = 3999");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 9999;
                } else if (brand == 2) {
                    sum += 5999;
                } else if (brand == 3) {
                    sum += 7999;
                } else if (brand == 4) {
                    sum += 3999;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            } else if (opt == 4) {
                System.out.println("1. Swarovski Price = 4999");
                System.out.println("2. Tanishq Price = 6999");
                System.out.println("3. Zales Price = 12999");
                System.out.println("4. Disney Price = 2999");
                int brand = sc.nextInt();
                if (brand == 1) {
                    sum += 4999;
                } else if (brand == 2) {
                    sum += 6999;
                } else if (brand == 3) {
                    sum += 12999;
                } else if (brand == 4) {
                    sum += 2999;
                } else {
                    System.out.println("Please select a correct brand.");
                }
            }
        }

        //System.out.println("Total Sum: " + sum);
    }
}
