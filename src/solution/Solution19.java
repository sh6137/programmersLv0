package solution;

import java.util.ArrayList;
import java.util.List;

public class Solution19 {
    public int 다음에_올_숫자(int[] common) {
        int answer = 0;
        int num1 = Math.abs(common[0] - common[1]);
        int num2 = Math.abs(common[1] - common[2]);

        if (num2 == num1) {
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }

        return answer;
    }

    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        List<Integer> integerList;
        int a = 0;
        while (true) {
            int sum = 0;
            integerList = new ArrayList<>();
            for (int i = a; i < num + a; i++) {
                sum = i + sum;
                integerList.add(i);
            }
            if (sum == total) {
                break;
            } else if (sum > total) {
                a--;
            } else if (sum < total) {
                a++;
            }

        }
        return integerList.stream().mapToInt(f->f.intValue()).toArray();
    }
}
