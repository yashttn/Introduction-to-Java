package Collections_and_Date.Ques4;

public class Employee {
    double age, salary;
    String name;

    Employee(double age, double salary, String name){
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[age=" + age + ", salary=" + salary + ", name=" + name + "]" ;
    }
}
