package com.example.mercansqatestassignment.utils;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomDataGenerator {
    public static String generateEmail() {
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedEmail = RandomStringUtils.random(length, useLetters, useNumbers) + "@example.com";
        return generatedEmail;
    }

    public static String generatePassword() {
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedPassword = RandomStringUtils.random(length, useLetters, useNumbers);
        return generatedPassword;
    }
}