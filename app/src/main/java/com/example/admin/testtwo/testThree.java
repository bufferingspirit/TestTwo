package com.example.admin.testtwo;

import java.util.Arrays;

/**
 * Created by Admin on 8/18/2017.
 */

public class testThree {

    public static void main(String[] args) {
        /*1. Sort the array with multiple same values in the array in an ascending order.
        Input: {2,8,9,3,4,3,2,6,6,2,4,9,8}
        Output: {2,2,2,3,3,4,4,6,6,8,8,9,9}
        2. Say you have a string of characters. Write an algorithm to collect
        and return a list of all substrings such that order is maintained
        but characters may be skipped. So “frog” can produce fog, fg, rg, etc.*/

        int[] myArray = {2, 8, 9, 3, 4, 3, 2, 6, 6, 2, 4, 9, 8};
        //sortArray(myArray);

        //getSubstring("Hello");
        getSubstringRec("Hello");

    }

    public static void getSubstring(String baseString){
        //counter = length-2
        String outString;
        for(int i = 0; i < baseString.length() - 1; i++) {
            for (int j = i; j < baseString.length() - 1; j++) {
                outString = baseString.charAt(i) + baseString.substring(j + 1);
                System.out.println(outString);
            }
        }
    }

    public static String getSubstringRec(String baseString){
        if(baseString.length() == 1){
            return baseString;
        }
        else{
            for(int i = 0; i < baseString.length() - 1; i++) {
                for (int j = 0; j < baseString.length() - 1; j++) {
                    System.out.println(getSubstringRec(baseString.substring(i, j+1)));
                    System.out.println(getSubstringRec(baseString.substring(j, baseString.length()-1)));
                }
            }
        }
        return "";
    }

    public static void sortArray(int[] intArray) {
        boolean check = true;
        while (check == true) {
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    int foo = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = foo;
                    System.out.println(Arrays.toString(intArray));

                }
                else {
                    check = false;
                }

            }
        }
        System.out.println("Sorted Array");
    }
}