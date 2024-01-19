package Q10828;

import java.util.Scanner;

class MyStack {
    private int[] num;
    private int index = -1;

    public MyStack(int size) {
        num = new int[size];
    }

    public int command(String command) {
        if (command.contains("push")) {
            String[] s = command.split(" ");
            push(Integer.parseInt(s[1]));
            return 100001;
        } else if (command.contains("pop")) {
            return pop();
        } else if (command.contains("size")) {
            return size();
        } else if (command.contains("empty")) {
            return empty();
        }
        return top();
    }

    private void push(int n) {
        num[index+1] = n;
        index++;
    }

    private int pop() {
        if (index == -1) {
            return -1;
        }
        int n = num[index];
        index--;
        return n;
    }

    private int size() {
        return index + 1;
    }

    private int empty() {
        if (index == -1) {
            return 1;
        }
        return 0;
    }

    private int top() {
        if (index == -1) {
            return -1;
        }
        return num[index];
    }
}

public class Q_10828 {
    private final static int PUSH_NUM = 100001;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = Integer.parseInt(scn.nextLine());
        MyStack myStack = new MyStack(size);

        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = myStack.command(scn.nextLine());
        }

        for (int n : result) {
            if (n != PUSH_NUM) {
                System.out.println(n);
            }
        }
    }
}
