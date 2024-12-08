package Project;

import java.util.*;
import java.util.regex.*;

public class Authenticated{
	 static Map<String, String> users = new HashMap<>(); // Username-password map
    	static Map<String, String> userEmails = new HashMap<>(); // Email-username map
	//boolean isAuthenticated = false;
	Scanner sc = new Scanner(System.in);

	public void Login(){
		System.out.print("Enter your username: ");
                String username = sc.nextLine();
                System.out.print("Enter your password: ");
                String password = sc.nextLine();

                if (users.containsKey(username) && users.get(username).equals(password)) {
                    System.out.println("Login successful! Welcome, " + username + "!");
                    ClothingStore1.isAuthenticated = true;
                    //displayShoppingMenu(sc);
                } else {
                    System.out.println("Invalid username or password. Try again.");
                }

	}
	
	public void SignUp(){
		String username;
                while (true) {
                    System.out.print("Enter a username to create an account: ");
                    username = sc.nextLine();
                    if (users.containsKey(username)) {
                        System.out.println("Username already exists. Please choose a different one.");
                    } else {
                        break;
                    }
                }

                String email;
                while (true) {
                    System.out.print("Enter your email: ");
                    email = sc.nextLine();
                    if (!isValidEmail(email)) {
                        System.out.println("Invalid email format. Please enter a valid email.");
                    } else if (userEmails.containsKey(email)) {
                        System.out.println("Email is already associated with an account. Please use a different email.");
                    } else {
                        break;
                    }
                }

                String password;
                while (true) {
                    System.out.print("Create a password: ");
                    password = sc.nextLine();
                    if (!isValidPassword(password)) {
                        System.out.println("Weak password! Ensure it meets all requirements.");
                    } else {
                        break;
                    }
                }

                users.put(username, password);
                userEmails.put(email, username);
                System.out.println("Signup successful! You can now login with your credentials.");
            }
		
	   public static boolean isValidEmail(String email) {
        	String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        	Pattern pattern = Pattern.compile(emailRegex);
        	Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    	}

    // Enhanced password validation function
    	public static boolean isValidPassword(String password) {
        	return password.length() >= 8 &&
               		password.matches(".*[A-Z].*") &&
               		password.matches(".*[a-z].*") &&
               		password.matches(".*[0-9].*") &&
               		password.matches(".*[!@#$%^&()].*");
    	}
}
