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
            //else return true
        else return true;
    }
}

