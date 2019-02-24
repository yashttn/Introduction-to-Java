package Collections_and_Date;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ques2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string:- ");
        String s = sc.nextLine();

        Set<Character> set = new HashSet<>();
        for (Character i : s.toCharArray()) {
            set.add(i);
        }

        System.out.println("Total unique characters in the string are " + set.size());
    }
}
