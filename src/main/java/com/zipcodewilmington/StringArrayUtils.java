package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];
        int count = 0;
        for(int i = array.length-1; i >= 0; i--){
            reverseArray[count] = array[i];
            count++;
        }

        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reverseArray = new String[array.length];
        int count = 0;
        for(int i = array.length-1; i >= 0; i--){
            reverseArray[count] = array[i];

            if(reverseArray[count] != array[count]){
                return false;
            }
            count++;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        int index = 0;
        boolean[] visited = new boolean[26];
        String tester = "";

        for(int i = 0; i < array.length; i++){
            tester += array[i];
        }
        tester = tester.replace(" ","");

        System.out.println(tester);

        for(int j = 0; j < tester.length(); j++){
            if('a' <= tester.charAt(j) && tester.charAt(j) <= 'z'){
                index = tester.charAt(j) - 'a';
            }
            else if('A' <= tester.charAt(j) && tester.charAt(j) <= 'Z'){
                index = tester.charAt(j) - 'A';
            }
            visited[index] = true;
        }

        for(int i = 0; i <= 25; i++){
            //System.out.println(visited[i]);
            if(!visited[i]){
                return false;
            }
        }

        return true;
    }
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;

        for(int i = 0; i < array.length; i++){
            if(value.equals(array[i])){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int count = 0;
        String[] newArray = new String[8];
        for(int i = 0; i < array.length; i++){
            if(valueToRemove != array[i]){
                newArray[count] = array[i];
                count++;
            }
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
       ArrayList<String> removed = new ArrayList<String>();
        removed.add(array[0]);
        for(int i = 1; i < array.length; i++){
            if(array[i] != array[i-1]){
                removed.add(array[i]);
            }
        }




//        Set<String> removed = new HashSet<String>();
//        for(String i : array){
//            removed.add(i);
//
//        }
//        for(String i : removed){
//            System.out.println(i);
//        }
       return removed.toArray(new String[removed.size()]);


    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> removed = new ArrayList<String>();
//        removed.add(array[0]);
        String tempArray = array[0];
        String build = "";
        for(int i = 0; i < array.length; i++){
            if(tempArray.equals(array[i])){
                build += array[i];
            }else{
                tempArray = array[i];
                build += " " + array[i];
            }
        }
        String[] newArray = build.split(" ");
        
        return newArray;
    }


}
