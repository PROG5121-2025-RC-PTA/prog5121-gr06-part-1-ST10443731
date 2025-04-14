/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newproject;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    // Default constructor
    public Login() {
    }

    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() > 5;
    }

    public boolean checkPasswordComplexity(String password) {
        String capital = ".*[A-Z].*";  // Checks capital letters
        String small = ".*[a-z].*";    // Checks small letters
        String special = ".*[!@#$%^&*(),.?\":{}|<>].*"; // Checks special characters
        String digit = ".*\\d.*";      // Checks digits

        return password.length() >= 8 &&
               password.matches(capital) &&
               password.matches(small) &&
               password.matches(digit) &&
               password.matches(special);
    }

    public boolean checkCellPhoneNumber(String phone) {
        String saCode = "+27";

        // Ensure phone number is at least 12 characters long to avoid index errors
        if (phone.length() != 12) {
            return false;
        }

        String firstThreeChars = phone.substring(0, 3);
        int fourthDigit = Character.getNumericValue(phone.charAt(3));

        return firstThreeChars.equals(saCode) && (fourthDigit >= 6 && fourthDigit <= 8);
    }

    public String registerUser(String username, String password, String phone) {
        boolean validatePhone = checkCellPhoneNumber(phone);
        boolean validateUsername = checkUserName(username);
        boolean validatePassword = checkPasswordComplexity(password);

        return (validatePhone && validateUsername && validatePassword) 
               ? "User is successfully registered" 
               : "User registration failed!";
    }

    public boolean loginUser(String username, String password) {
        return checkUserName(username) && checkPasswordComplexity(password);
    }

    public String returnLoginStatus(String username, String password) {
        return loginUser(username, password) 
               ? "A successful login" 
               : "A failed login";
    }
}
