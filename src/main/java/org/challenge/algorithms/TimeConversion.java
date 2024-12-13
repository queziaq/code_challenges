package org.challenge.algorithms;

public class TimeConversion {
    public static String timeConversion(String s) {
        // Write your code here
        String period = s.substring(s.length() -2);
        s = s.replace("AM", "").replace("PM", "");
        String[] timeSplit = s.split(":");

        Integer firstPart = Integer.parseInt(timeSplit[0]);
        Integer hour = 0;

        if(period.equals("AM")) {
            hour = firstPart == 12 ? 0 : firstPart;
        } else if(period.equals("PM")) {
            hour =  firstPart == 12 ? 12 : firstPart + 12;
        }

        String transformedHour = String.format("%02d", hour);

        return transformedHour + ":" + timeSplit[1] + ":" + timeSplit[2];
    }
}
