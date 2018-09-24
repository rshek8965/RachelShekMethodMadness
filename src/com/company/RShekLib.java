package com.company;

public class RShekLib {
    public static String dateStr(String input) {
        return input.substring(0,2) + " - " + input.substring(3,5) + " - " + input.substring(6);
    }

    public static boolean isPalindrome(String str) {
        String backwards = "";
        for (int i = str.length()-1; i > -1; i--) {
            backwards = backwards + str.charAt(i);
        }
        if (backwards.compareTo(str) == 0)
            return true;
        else return false;
    }
    /*rewrites the given string backwards and compares it to the original string*/


    public static String fooBarBaz(int num1) {
        String str = "";
        for (int i = 1; i < num1+1; i++) {
            if (i%3 == 0 && i%5 > 0)
            {str = str + "foo";}
            if (i%5 == 0 && i%3 > 0)
            {str = str + "bar";}
            if (i%3 == 0 && i%5 == 0)
            {str = str + "baz";}
            else {str = str + i;}
        }
        return str;
    }
    /*looks for numbers that have no remainder when divided and adds the corresponding term to the string when true else add the number and then returns the string*/

    public static String multiplicationTable(int base, int range) {
        String output = "";
        for (int i = 0; i < range; i++) {
            output = output + base + "*" + i + " equals " + base * i + " ";
        }
        return output; }
    /*returns an output string containing the product of the given base and range*/

    public static int sumUpTo(int input) {
        int output = 0;
        for (int i = 0; i < input+1; i++) {
            output = output+i;
        }
        return output;
    }
    /*looks for numbers that have no remainder when divided and adds the corresponding term to the string when true else add the number and then returns the string*/
}

