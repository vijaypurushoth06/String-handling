package code;

import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String args[]) {
        String str = "", ans = "";
        String arr[] = new String[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three letter Abbreviation");
        str = scan.nextLine();
        arr = str.split(" ");
        if (arr.length != 3) {
            System.out.println("Enter a valid Abbreviation" + arr.length);

            return;
        }
        for (int i = 0; i < 3; i++) {
            ans += arr[i].charAt(0);
        }
        System.out.println(ans.toUpperCase());
    }
}package code;

import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String args[]) {
        String str = "", ans = "";
        String arr[] = new String[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three letter Abbreviation");
        str = scan.nextLine();
        arr = str.split(" ");
        if (arr.length != 3) {
            System.out.println("Enter a valid Abbreviation" + arr.length);

            return;
        }
        for (int i = 0; i < 3; i++) {
            ans += arr[i].charAt(0);
        }
        System.out.println(ans.toUpperCase());
    }
}
