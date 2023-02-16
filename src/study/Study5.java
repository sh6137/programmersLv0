package study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Data_2{
    int value;

    public Data_2(int value) {
        this.value = value;
    }
}
public class Study5 {
    public static void main(String[] args) {
        Data_2 d2 = new Data_2(2);
        int value = d2.value;
        d2.value = 3;
        System.out.println(d2.value);
        System.out.println(value);
        Stack<String> a = new Stack<>();
        LinkedList<String> ab = new LinkedList<>();
    }
}
