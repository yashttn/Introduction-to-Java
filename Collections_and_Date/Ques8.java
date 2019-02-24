package Collections_and_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ques8 {

    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(date.format(new Date()));
    }
}
