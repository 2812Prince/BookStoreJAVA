import java.util.ArrayList;
import java.util.Scanner;

public class BSMS {   //Book Store Management System
    
    static ArrayList<BookD> bookList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static String username = "admin";
    static String password = "password";
    
    public static void main(String[] args) {
		System.out.println("\n\n***********************************************\n");
        System.out.println("\nWelcome to the Apna Book Store!");
		System.out.println("\n\n***********************************************\n");
        
		System.out.println("Please enter your login Details:");
        boolean authenticated = login();
		
        if (authenticated) {
            boolean exit = false;
            while (!exit) {
                System.out.println("\nPlease choose an option:");
                System.out.println("1. Add book");
                System.out.println("2. Remove book");
                System.out.println("3. Display book list");
                System.out.println("4. Exit");
                int choice = sc.nextInt();
                
                switch (choice) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        removeBook();
                        break;
                    case 3:
                        displayBooks();
                        break;
                    case 4:
                        exit = true;
                        System.out.println("Thank you for using the Book Store Management System!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        } else {
            System.out.println("Login failed. Please try again.");
        }
    }