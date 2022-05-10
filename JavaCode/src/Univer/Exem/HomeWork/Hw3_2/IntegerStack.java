package Univer.Exem.HomeWork.Hw3_2;

public class IntegerStack implements Stack{
    int stack[] = new int[5];
    int top = 0;
    int yes =0;

    @Override
    public void push(int data) {
        stack[top] =data;
        top++;
    }

    @Override
    public int pop() {
        int data;
        for(int n: stack){
        top--;
        data = stack[top];
        stack[top] = 0;}
        return 0;
    }

    @Override
    public int peek() {
        int data;
            top--;
            data = stack[top];
            stack[top] = 0;
        return 0;
        
    }

    @Override
    public void show() {
        System.out.print("Now stack is: ");
        for(int n : stack){
            System.out.print(n + " ");

        }


    }
}
