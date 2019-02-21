package Java2;

import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ques6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(a/b);
        }catch (ArithmeticException e1){
            System.out.println("Arithmetic Exception");
        }catch (InputMismatchException e2){
            System.out.println("Input Mismatch Exception");
        }
        finally {
            System.out.println("Closed the program");
        }

    }
}
