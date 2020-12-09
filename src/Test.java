class Test {
    private int stck[];
    private int tos;

    Test(int size) {
        stck = new int[size];
        tos = -1;
    }

    int lengthStack() {
        return stck.length;
    }

    void push(int item) {
        if(tos == stck.length - 1) {
            System.out.println("Stack overflow");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if(tos < 0) {
            System.out.printf("Stack - p.");
            return 0;
        } else return stck[tos--];
    }
}

class StackApp {
    public static void main(String[] args) {
        Test stack1 = new Test(10);
        Test stack2 = new Test(20);

        for(int i = 0; i < stack1.lengthStack();i++) stack1.push(i);
        for(int i = 0; i < stack2.lengthStack();i++) stack2.push(i);

        for(int i = 0; i < stack1.lengthStack();i++) System.out.println("Stack1: " + stack1.pop());
        for(int i = 0; i < stack2.lengthStack();i++) System.out.println("Stack2: " + stack2.pop());


    }
}