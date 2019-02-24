package Collections_and_Date.Ques5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(183, 30, "Rohit", "Sharma"));
        students.add(new Student(220, 40, "Virender", "Sehwag"));
        students.add(new Student(300, 45, "Sachin", "Tendulkar"));
        students.add(new Student(300, 50, "Sunil", "Gavaskar"));

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o2.score-o1.score)  == 0 ? o1.first_name.toLowerCase().compareTo(o2.first_name.toLowerCase()) : (int)(o2.score-o1.score);
            }
        });

        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
