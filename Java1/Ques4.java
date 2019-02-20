package Java1;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");

        String s = sc.nextLine();

        int lowerCase = 0, upperCase = 0, specialChars = 0, digits = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                lowerCase++;
            }
            else if(Character.isUpperCase(s.charAt(i))){
                upperCase++;
            }
            else if(Character.isDigit(s.charAt(i))){
                digits++;
            }
            else{
                specialChars++;
            }
        }
        System.out.println("Count & Percentage of Lowercase characters: " + lowerCase + ", " + lowerCase*100/s.length());
        System.out.println("Count & Percentage of Uppercase characters: " + upperCase + ", " + upperCase*100/s.length());
        System.out.println("Count & Percentage of Digits: " + digits + ", " + digits*100/s.length());
        System.out.println("Count & Percentage of Special characters: " + specialChars + ", " + specialChars*100/s.length());

    }

}
