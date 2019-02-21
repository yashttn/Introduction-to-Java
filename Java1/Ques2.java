package Java1;

import java.util.HashMap;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String[] arr = s.split(" ", -1);

        HashMap<String, Integer> hmap = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i], hmap.get(arr[i]) + 1);
            }
            else{
                hmap.put(arr[i], 1);
            }
        }
        //System.out.println(hmap);

        System.out.println("The no. of occurrences of the duplicate words in a string are: ");
        for(String i: hmap.keySet()){
            System.out.println(i + ": " + hmap.get(i));
        }



    }
}
