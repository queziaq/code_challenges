package org.challenge.onemonthprep;

public class StringXOR {
    public static String stringsXOR(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(Character.toString(s.charAt(i)).equals(Character.toString(t.charAt(i))))
                res += "0";
            else
                res += "1";
        }

        return res;
    }
}
