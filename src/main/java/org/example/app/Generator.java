package org.example.app;


import org.example.app.exception.AppException;
import org.example.app.validate.AppValidator;

import java.util.Random;

public class Generator {

    public static String generateRandomPassword(String inputLength) {
        AppValidator validate = new AppValidator();
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        boolean flag = false;
        int length = 0;
        try {
            length = Integer.parseInt(inputLength);
            validate.validatePasswordLength(length);
            flag = true;
        } catch (AppException | NumberFormatException e) {
            System.out.print(e.getMessage());

        }

        for (int i = 0; i < length; i++) {
            password.append(random.nextInt(0, 9));
        }
        if(flag){
            return "Your password was generate: " + password;
        }else{
            return"Your password was not generate " +
                    "because your length that you input contains of letters or other symbols" +
                    "or numbers that less than 1";
        }

    }
}