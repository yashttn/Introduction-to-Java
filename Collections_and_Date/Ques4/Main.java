package Collections_and_Date.Ques4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(40, 50000, "Dhoni"));
        employees.add(new Employee(20, 10000, "Sachin"));
        employees.add(new Employee(50, 40000, "Sunil"));
        employees.add(new Employee(30, 70000, "Kapil"));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o2.salary-o1.salary);
            }
        });

        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
