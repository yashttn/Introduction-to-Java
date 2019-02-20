package Java1;

import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2, str3, str4;

        System.out.print("Enter a string: ");
        str1 = sc.nextLine();
        System.out.print("Enter the string you want to be replaced: ");
        str2 = sc.nextLine();
        System.out.print("Enter the string you want to replace: ");
        str3 = sc.nextLine();

        str4 = str1.replace(str2, str3);

        System.out.println(str4);
    }

}
