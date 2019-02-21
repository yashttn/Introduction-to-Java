package Java2;

import java.util.Scanner;

public class Ques2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to sort: ");
        char[] s = sc.nextLine().toCharArray();

        //Bubble sort
        int n = s.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++) {
                if (s[j] > s[j + 1]) {
                    char temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted string is ");
        System.out.println(s);

    }
}
