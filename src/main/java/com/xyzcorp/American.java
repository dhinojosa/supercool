package com.xyzcorp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class American extends Person {
    private final String ssn;

    public American(String firstName, String lastName, String ssn) {
        super(firstName, lastName);
        if (!isValidAmericanSSN(ssn)) {
            throw new IllegalArgumentException("SSN is invalid");
        }
        this.ssn = ssn;
    }

    public static boolean isValidAmericanSSN(String possibleSSN) {
        String regex = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(possibleSSN);
        return matcher.matches();
    }

    public String getSsn() {
        return ssn;
    }
}
