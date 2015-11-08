package com.vtyurin.solution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    
    private static final String quote = "\"You don’t mean — you can’t mean the people"
            + " who live here?\""
            + " cried Professor McGonagall, jumping to her feet and pointing at number"
            + " four. \"Dumbledore — you can’t."
            + " I’ve been watching them all day. You couldn’t find two people"
            + " who are less like us. And they’ve got this son —"
            + " I saw him kicking his mother all the way up the street,"
            + " screaming for sweets. Harry Potter come and live here!\"";
    
    public static void main(String[] args) {
        System.out.println(inPhrase("McGonagall"));
        System.out.println(inPhrase("Dumbledore"));
    }
    
    public static boolean inPhrase(String word) {
        Pattern p = Pattern.compile("\"([^\"]*)\"");
        Matcher m = p.matcher(quote);
        boolean result = false;
        while(m.find()) {
            result = m.group(1).contains(word);
        }
        
        return result;
    }

}
