package prog.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class StringRev2{
    public static void main(String args[]){
    String str[] = "He is the one".split(" ");
    String finalStr="";
        for(int i = str.length-1; i>= 0 ;i--){
            finalStr += str[i]+" ";
        }
        System.out.println(finalStr);
    }
    
    private static void reverse(char[] buf, int start, int end) {
        for (int i = start, j = end - 1; i < j; i++, j--) {
            char swap = buf[i];
            buf[i] = buf[j];
            buf[j] = swap;
        }
    }

    public static String reverseWords1(String sentence) {
        char[] buf = sentence.toCharArray();

        // Reverse the string, character-wise
        reverse(buf, 0, buf.length);

        // Within each word, reverse the characters again
        int wordEnd = 0;
        for (int wordStart = 0; wordStart < buf.length; wordStart = wordEnd + 1) {
            for (wordEnd = wordStart; wordEnd < buf.length && buf[wordEnd] != ' '; wordEnd++) {}

            // wordStart is at the start of a word.
            // wordEnd is just past the end of the word.
            reverse(buf, wordStart, wordEnd);
        }
        return new String(buf);
    }
    public static String reverseWords2(String sentence) {
        StringBuilder sb = new StringBuilder(sentence.length() + 1);
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(' ');
        }
        sb.setLength(sb.length() - 1);  // Strip trailing space
        return sb.toString();
    }
    private static String reverse(String string) {
        if (string.isEmpty()) {
            return string;
        }
        int last = string.length();
        StringBuilder sb = new StringBuilder(string.length());
        boolean contextspace = ' ' == string.charAt(string.length() - 1);
        for (int i = string.length() - 1; i >= 0; i--) {
            if (contextspace != (string.charAt(i) == ' ')) {
                sb.append(string.substring(i + 1, last));
                last = i + 1;
                contextspace = !contextspace;
            }
        }
        sb.append(string.substring(0, last));
        return sb.toString();
    }
    public static String reverseWords (String s) 
    {
        String delimiter = " ";
        List<String> words = Arrays.asList(s.split(delimiter));
        Collections.reverse(words);
        return String.join(delimiter, words);
    }
/*
    public static void main(String[] args) 
    {
        System.out.println(reverseWords("He is the one"));
    } */

}