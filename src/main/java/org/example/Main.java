package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*Task#1
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
*/
/*Task#4
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the last number: ");
        int lastNumber = scanner.nextInt();

        if (firstNumber > lastNumber) {
            System.out.println("First number is grater than last number.");
        }

        else{
                System.out.println("Numbers between " + firstNumber + "and" + lastNumber + ":");
            }


                while (firstNumber <= lastNumber) {
                    System.out.println(firstNumber + "");
                    firstNumber++;
                }


            scanner.close();

    }
}
*/

//Task#5
/*public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = scanner.nextInt();

        int sum = 0;
        for(int i = 0; i <= n; i++){
            int term = (int) Math.pow(2,i);
            sum += term;
        }
        System.out.println("The sum of the series is: " + sum);
    }
}
*/
//Task#2
/*public class Main{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.println("Enter the first number: ");
        read = reader.nextInt();
        sum += read;

        System.out.println("Enter the second number: ");
        read = reader.nextInt();
        sum += read;

        System.out.println("Enter the third number: ");
        read = reader.nextInt();
        sum += read;

        System.out.println("Sum: " + sum);

        reader.close();
    }
}

 */

//Task#3
public class Main{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter a number(or 0 to stop): ");
            int read = Integer.parseInt(reader.nextLine());

            if (read == 0) {
                break;
            }
            sum += read;
            System.out.println("Sum now:" + sum);
        }
        System.out.println("Sum in the end: " + sum);

    }

}