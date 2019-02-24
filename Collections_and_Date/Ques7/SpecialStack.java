package Collections_and_Date.Ques7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpecialStack {
    private List<Integer> specialStack;
    private int size, stack_pointer;

    public SpecialStack() {
        this.stack_pointer = -1;
        this.specialStack = new ArrayList<>();
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int getStack_pointer() {
        return stack_pointer;
    }

    public List<Integer> getSpecialStack() {
        return specialStack;
    }

    public int push(int data){
        if(isFull()){
            return -1;
        }
        specialStack.add(data);
        stack_pointer++;
        return 1;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        return specialStack.remove(stack_pointer--);
    }

    public boolean isEmpty(){
        return stack_pointer == -1;
    }

    public boolean isFull(){
        return stack_pointer == size-1;
    }

    public int getMin(){
        if(isEmpty()){
            return -1;
        }
        return Collections.min(specialStack);
    }

}
