package com.example;

import java.util.Locale;

public class MessageLocation {
    public static String getMessageByLoc(String loc) {
        loc=loc.trim();
        loc=loc.toLowerCase();
        return switch(loc) {
            case "kolkata" -> "Your city is"+loc;
            case "bengaluru" -> "Your city is"+loc;
            case "mumbai" -> "Your city is"+loc;
            case "delhi" -> "Your city is"+loc;
            default-> "NA";
        };
    }
}
