package com.apolis;

public class Main {

    public static void main(String[] args) {
        for (int i=0; i<6; i++)
        {
            for (int j=0; j<i*2+1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
