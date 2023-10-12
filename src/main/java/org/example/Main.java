package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new
    Scanner(System.in);
            String correctPassword = "Mirza123";
            boolean isAuthenticated = false;
            while (!isAuthenticated){
                System.out.println("Enter the password:");
                String userPassword = scanner.nextLine();
                if (userPassword.equals(correctPassword)){
                    isAuthenticated = true;
                    System.out.println("Correct password");
                }
                else{
                    System.out.println("Incorrect password");
                }

        }
            scanner.close();
    }
}


