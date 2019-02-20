package Java1.Ques10;

public class Main {
    public static void main(String[] args) {

        TestClass testClass = new TestClass();

        //Addition
        System.out.println("Adding two integers: " + testClass.add(5,6));
        System.out.println("Adding two doubles: " + testClass.add(5.23,6.68));

        //Multiplication
        System.out.println("Multiplying two integers: " + testClass.multiply(7,15));
        System.out.println("Multiplying two floats: " + testClass.multiply(7.47f, 9.36f));

        //Concatenation
        System.out.println("Concatenating two Strings: " + testClass.concat("Hello", " World"));
        System.out.println("Concatenating three Strings: " + testClass.concat("Hello", " World", " Java"));
    }
}
