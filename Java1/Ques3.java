package Java1;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1,s2;
        System.out.print("Enter the string: ");
        s1 = sc.nextLine();
        System.out.print("\nEnter the character whose occurence to be calculated: ");
        s2 = sc.nextLine();

        int charcount = s1.length() - s1.replaceAll(s2, "").length();
        System.out.println("\nOccurrence Of the Char In String: " + charcount);

    }
}
