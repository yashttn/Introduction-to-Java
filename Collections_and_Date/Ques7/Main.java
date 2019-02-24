package Collections_and_Date.Ques7;

public class Main {
    public static void main(String[] args) {

        SpecialStack stack = new SpecialStack();
        stack.setSize(5);

        System.out.println(stack.isEmpty());
        stack.push(2);
        stack.push(3);
        System.out.println(stack.getSpecialStack());
        System.out.println(stack.isEmpty());
        stack.push(6);
        stack.push(5);
        stack.push(4);
        System.out.println(stack.getSpecialStack());
        System.out.println(stack.isFull());
        stack.push(11);
        System.out.println(stack.getMin());
        System.out.println(stack.getSpecialStack());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.getSpecialStack());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.getMin());
    }
}
