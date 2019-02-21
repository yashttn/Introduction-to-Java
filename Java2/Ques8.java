package Java2;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {

        System.out.println("Using 'while' statement:- ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while (!s.equals("done")){
            s = sc.nextLine();
        }

        System.out.println("Using 'do-while' statement:- ");
        do{
            s = sc.next();
        }
        while (!s.equals("done"));

    }
}
