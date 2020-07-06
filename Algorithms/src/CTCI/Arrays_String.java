package CTCI;

import java.util.*;

public class Arrays_String {

    public static void main(String[] args) {
    String s = "aaabcccccaaabb";
    System.out.println(stringCompression(s));
    }

    private static boolean isUnique(String s){
        String str = "abcdefghijklmnopqrstuvwxyz1234567890";
        int counter =0;
        for(int i =0; i< s.length(); i++){
            for(int k=0; k< str.length(); k++) {
                if(s.charAt(i) == str.charAt(k)) {
                    counter ++;
                }
            }
        }
        if(counter == s.length()){ System.out.println("This string contains all unique characters."); return  true;  }
        System.out.println("This string doesn't contain all unique characters. ");
        return false;
    }

    private static boolean checkPermutation(String s , String k){

        char[] sarr = s.toCharArray();
        char[] karr = k.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(karr);

        String newSarr = new String(sarr);
        String newKarr = new String(karr);

        if(newSarr.equals(newKarr)){
            System.out.println("Strings are permutation of another");
            return true;
        }
        System.out.println("Strings aren't permutations of one another");
        return false;
    }

    private static String URLify(String s){
        StringBuilder sb = new StringBuilder();

        for(int i =0; i< s.length() - 2; i++){

            if(s.charAt(i) == ' '){
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        String newString = new String(sb.toString());
        System.out.println(newString);
        return newString;
    }

    // Palindrome Permutation
    // One Array - Spell Checking Algorithm Does This


    // String Compression

    private static String stringCompression(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i=0; i < s.length(); i++){
            count ++;

            if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)){
                sb.append(s.charAt(i));
                sb.append(count);
                count = 0;
            }
        } return sb.length() < s.length() ? sb.toString() : s;
    }

    // Rotate Matrix
    // Zero Matrix
    // String Rotation


}
