package com.apolis;

public class Main {

    public static void main(String[] args) {
        //Generate * triangle
        for (int i=0; i<6; i++)
        {
            for (int k=0; k<6-i; k++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i*2+1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        String str = "apple";
        String str1 = "level";

        if(isPalindrome(str)) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }



     static boolean isPalindrome(String str) {
        int i=0;
        int j=str.length()-1;

        while(i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
}
