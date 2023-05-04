package com.techdealers.passport.utils;

import jakarta.persistence.AttributeConverter;
import org.jasypt.util.password.StrongPasswordEncryptor;

public class PasswordConverter implements AttributeConverter<String, String> {

    private final StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();


    @Override
    public String convertToDatabaseColumn(String s) {
        return passwordEncryptor.encryptPassword(s);
    }

    @Override
    public String convertToEntityAttribute(String s) {
        return s;
    }
}