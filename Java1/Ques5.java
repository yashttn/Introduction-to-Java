package Java1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ar1[] = new int[101];
        int ar2[] = new int[101];

        System.out.print("Enter length of the array 1: ");
        int n1 = sc.nextInt();

        System.out.print("Enter items of the array 1: ");
        for(int i=0; i<n1; i++){
            ar1[i] = sc.nextInt();
        }

        System.out.print("Enter length of the array 2: ");
        int n2 = sc.nextInt();

        System.out.print("Enter items of the array 2: ");
        for(int i=0; i<n2; i++){
            ar2[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                if (ar1[i] == ar2[j]) list.add(ar1[i]);
            }
        }
        System.out.println("\nCommom elements in both arrays are: " + list);
    }
}
