package org.example.app;


import org.example.app.exception.AppException;
import org.example.app.validate.AppValidator;

import java.util.Random;

public class Generator {

    public static String generateRandomPassword(String inputLength) {
        AppValidator validate = new AppValidator();
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        int length = 0;
        try {
            length = Integer.parseInt(inputLength);
            validate.validatePasswordLength(length);
        } catch (AppException | NumberFormatException e) {
            System.out.print(e.getMessage());
        }

        for (int i = 0; i < length; i++) {
            password.append(random.nextInt(0, 9));
        }
        return password.toString();
    }
}