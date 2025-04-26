package org.example.app.validate;

import org.example.app.exception.AppException;

public class AppValidator {
    public void validatePasswordLength(int length) throws AppException {
        if(length < 1){
            throw new AppException("Length of password can not be less than 1");
        }
    }
}
