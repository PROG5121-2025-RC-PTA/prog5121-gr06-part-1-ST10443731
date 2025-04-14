/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newproject;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class NewProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password, phone; // Declarations

        System.out.print("Enter Username: ");
        username = input.nextLine();

        System.out.print("Enter Password: ");
        password = input.nextLine();

        System.out.print("Enter Phone Number (starting with  South Sfrican internatitional code{+27): ");
        phone = input.nextLine();

        //  Login object
        Login login = new Login(); 

       boolean  validatePhone = login.checkCellPhoneNumber(phone);
        boolean validateUsername = login.checkUserName(username);
        boolean validatePassword = login.checkPasswordComplexity(password);

        // Validate Username
        if (validateUsername) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username not correctly formatted; please ensure that the username " +
                    "contains an underscore and is more than five characters in length.");
        }

        // Validate Password
        if (validatePassword) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password " +
                    "contains at least 8 characters, a capital and small letter, a number, and a special character.");
        }

        // Validate Phone Number
        if (validatePhone) {
            System.out.println("Cellphone number successfully added.");
        } else {
            System.out.println("Cellphone number incorrectly formatted or does not contain international code.");
        }

       // Close the scanner to prevent resource leaks
        System.out.println("---Login---");
        
        System.out.println("Enter your Username:");
           String loginUsername = input.nextLine();
            System.out.println("Enter your password:");
            String loginPassword = input.nextLine();
             
            
            if (login.loginUser(loginUsername, loginPassword)) {
        System.out.println("Welcome"+ username+",it is great to see you again.");
    }else{
            System.out.println("Username or password incorrect, try again.");
    }
      
    }
}
