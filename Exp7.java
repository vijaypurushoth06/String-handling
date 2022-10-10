package javaapplication1;

import java.util.*;
public class ThreeLetterAcronym {
    public static void main(String[] args) {
        // Write your code here
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter three words:");
    String[] str = new String[3];
    String m=""; 
    for(int i=0;i<3;i++)
    {
    str[i]=myObj.nextLine();
    m=m + String.valueOf(str[i].charAt(0)).toUpperCase();
    }
    System.out.println(" Three letter Acronym is: " + m);
}
}
