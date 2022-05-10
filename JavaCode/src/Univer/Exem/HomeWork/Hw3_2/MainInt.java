package Univer.Exem.HomeWork.Hw3_2;

import java.util.Scanner;

public class MainInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerStack stackint = new IntegerStack();

        System.out.println("Please input 5 element:");
        for(int i=0; i<stackint.stack.length;i++){
            stackint.push(scanner.nextInt()) ;
        }
        stackint.show();

        System.out.println("\n\nDou you won't to remove last element? \nYes(1) delete last element!\nNo(0) delete all element");
        stackint.yes = scanner.nextInt();

        if(stackint.yes > 0){
            stackint.peek();
            System.out.print("Last element removed: ");
            stackint.show();

        }
        else if (stackint.yes == 0){
            System.out.println("All element removed");
            stackint.pop();
            stackint.show();

        }





    }
}