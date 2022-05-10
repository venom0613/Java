package Univer.Exem.HomeWork;

import java.util.Scanner;

public class Object {




    class StringStack implements Stack {
        private String arr[];
        private int top;
        public StringStack(int num) {
            arr = new String[num];
            top = 0;
        }
        @Override
        public int length() {
            return top;
        }
        @Override
        public int compacity() {
            return arr.length;
        }
        @Override
        public String pop() {
            if(top==0)
                return "비어있음";
            else {
                String str = arr[top-1];
                top--;
                return str;
            }
        }
        @Override
        public boolean push(String val) {
            if(top == arr.length)
                return false;
            else {
                arr[top] = val;
                top++;
                return true;
            }
        }
    }

    public class StackApp {
        public void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StringStack s;

            System.out.print("총 스택 저장 공간의 크기 입력 >> ");
            s = new StringStack(sc.nextInt());

            while(true) {
                System.out.print("문자열 입력 >> ");
                String str = sc.next();

                if(str.equals("그만")) {
                    break;
                }

                boolean result = s.push(str);
                if(result==false)
                    System.out.println("스택이 꽉 차서 푸시 불가!");
            }

            System.out.print("스택에 저장된 모든 문자열 팝 : ");
            int len = s.length();
            for(int i=0; i<(len); i++) {
                System.out.print(s.pop()+" ");
            }
        }
    }

}
interface Stack {
    int length(); // 현재 스택에 저장된 개수 리턴
    int compacity(); //스택의 전체 저장 가능한 개수 리턴
    String pop(); // 스택의 톱(top)에 실수 저장
    boolean push(String val); // 스택의 톱(top)에 저장된 문자 리턴
}