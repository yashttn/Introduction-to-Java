package Collections_and_Date;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ques1 {

    public static void main(String[] args) {

        List<Float> floatList = new ArrayList<>();
        floatList.add(4.32f);
        floatList.add(7.356f);
        floatList.add(6.22f);
        floatList.add(2.58f);
        floatList.add(11.533f);

        System.out.print("ELements in List are:- ");
        float sum = 0;
        Iterator<Float> iterator = floatList.iterator();
        while(iterator.hasNext()){
            float y = iterator.next();

            if(!iterator.hasNext()) System.out.print(y);
            else System.out.print(y + ", ");

            sum += y;
        }

        System.out.println("\nThe sum of all elements of List are:- " + sum);
    }
}
