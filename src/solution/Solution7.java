package solution;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class Solution7 {
    public int 주사위의개수(int[] box, int n) {
        int answer = 1;
        int[] diceCount = new int[box.length];
        for (int i = 0; i < box.length; i++) {
            diceCount[i] = box[i] / n;
            answer *= diceCount[i];
        }
        return answer;
    }

    public int[] 문자열정렬하기1(String my_string) {
        int[] answer = {};
        String[] str = my_string.split("");
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < str.length; i++) {
            if (Character.isDigit(str[i].charAt(0))) {
                arrayList.add(Integer.valueOf(str[i]));
            }
        }
        arrayList.sort(Comparator.naturalOrder());
        answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public int[] 가장큰수찾기(int[] array) {
        int[] answer = {0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }

    public int[] 약수구하기(int n) {
        int[] answer = {};
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                integers.add(i);
            }
        }
        answer = integers.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public int[] 배열회전시키기(int[] numbers, String direction) {
        int[] answer = {};
        if (direction.equals("right")) {
            int tmp = numbers[0];
            for (int i = 1; i <= numbers.length - 1; i++) {
                numbers[i - 1] = numbers[i];
            }
            numbers[numbers.length - 1] = tmp;
        } else if (direction.equals("left")) {
            int tmp = numbers[numbers.length - 1];
            for (int i = numbers.length - 1; i >= 1; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = tmp;
        }
        answer = numbers;
        return answer;
    }

}
