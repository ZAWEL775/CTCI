package CTCI;

import java.util.Arrays;

public class Arrays_String {

    public static void main(String[] args) {
        URLify("Mr John Smith  ");
    }

    static boolean isUnique(String s){
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

    static boolean checkPermutation(String s , String k){

        char[] sarr = s.toCharArray();
        char[] karr = k.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(karr);

        String newSarr = new String(sarr);
        String newKarr = new String(karr);

        int counter =0;

        for(int i=0; i< s.length(); i++){
            if(newSarr.equals(newKarr)){
                counter ++;
            }
        }

        if(counter == s.length()){
            System.out.println("Strings are permutation of another");
            return true;
        }
        System.out.println("Strings aren't permutations of one another");
        return false;
    }

    static String URLify(String s){
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
    // One Array
    // String Compression
    // Rotate Matrix
    // Zero Matrix
    // String Rotation


}