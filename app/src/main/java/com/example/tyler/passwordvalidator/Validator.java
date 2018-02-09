package com.example.tyler.passwordvalidator;

/**
 * Created by Tyler on 2018-02-06.
 */

public class Validator {
    public static boolean validatePW (String password) {
        //making sure the password isn't "password"
        if(password.toLowerCase().equals("password")) return false;
            //making sure the length is at least 8 characters
        else if(password.length()<8) return false;
            //making sure there is both upper case and lower case
        else if(password.equals(password.toUpperCase()) || password.equals(password.toLowerCase())) {
            return false;
        }
        //making sure there is a special character
        //the characters listed below are what i deem to be "special characters"
        else if(!password.contains("!") && !password.contains("@") && !password.contains("#") &&
                !password.contains("$") && !password.contains("%") && !password.contains("^") &&
                !password.contains("&") && !password.contains("*"))
            return false;
            //making sure there is a number
        else if(!password.contains("1") && !password.contains("2") && !password.contains("3") &&
                !password.contains("4") && !password.contains("5") && !password.contains("6") &&
                !password.contains("7") && !password.contains("8") && !password.contains("9") &&
                !password.contains("0"))
            return false;
            //else return true
        else return true;
    }
}

