package Java1;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[101];

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        System.out.print("Enter elements in array: ");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int flag = 0;
        for(int i=0; i<n; i++){
            flag = 0;
            for(int j=0; j<n; j++){
                if(i!=j){
                    if (arr[i] == arr[j]) {
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag == 0){
                flag = arr[i];
                break;
            }

        }

        System.out.print("The element which is not repeated twice is " + flag);
    }
}
