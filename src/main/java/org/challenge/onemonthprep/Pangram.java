package org.challenge.onemonthprep;

import java.util.List;

public class Pangram {
    public static String pangrams(String s) {
        List<String> alphabet = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

        String formatted = s.toLowerCase().trim();

        for(int i=0; i < alphabet.size(); i++) {
            if(!formatted.contains(alphabet.get(i))) {
                return "not pangram";
            }
        }

        return "pangram";

    }
}
