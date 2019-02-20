package Java1;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine(), s1 = "";
        for(int i=s.length()-1; i>=0; i--){
            s1 += s.charAt(i);
        }
        System.out.println("\nReversed String: "+s1);

        StringBuffer stringBuffer = new StringBuffer(s1);
        stringBuffer.delete(4,10);
        System.out.println("String after deleting Characters from Index 4 to 9: " + stringBuffer);
    }
}
