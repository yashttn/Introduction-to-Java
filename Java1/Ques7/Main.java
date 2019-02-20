package Java1.Ques7;

public class Main {
    static int age;
    static String firstName, lastName;

    static int age2 = 30;
    static String firstName2 = "MS", lastName2 = "Dhoni";

    static {
        age = 25;
        firstName = "Virat";
        lastName = "Kohli";
    }

    public static void main(String[] args) {
        System.out.print("Using static block: ");
        System.out.print("\nAge: " + age + ", First Name: " + firstName +", Last Name: " + lastName);

        System.out.print("\nUsing static method: ");
        StaticMethodDemo.show();
        System.out.print("\nAge: " + StaticMethodDemo.age1 + ", First Name: " + StaticMethodDemo.firstName1 +", Last Name: " + StaticMethodDemo.lastName1);

        System.out.print("\nUsing static variable");
        System.out.print("\nAge: " + age2 + ", First Name: " + firstName2 +", Last Name: " + lastName2);

    }
}