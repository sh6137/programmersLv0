package solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution11 {

    public int A로B만들기(String before, String after) {
        int answer = 0;
        int beforeDigit = 0;
        int afterDigit = 0;

        for (int i = 0; i < before.length(); i++) {
            beforeDigit += before.charAt(i);
            afterDigit += after.charAt(i);
        }
        if (afterDigit == beforeDigit) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }

    public int[][] 이차원으로만들기(int[] num_list, int n) {
        int[][] answer = {};
        int row = num_list.length / n;
        answer = new int[row][n];
        int count = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = num_list[count];
                count++;
            }
        }
        System.out.println(Arrays.deepToString(answer));
        return answer;
    }

    public int k의개수(int i, int j, int k) {
        int answer = 0;
        for (int l = i; l <= j; l++) {
            String number = String.valueOf(l);
            String[] numberArrays = number.split("");
            for (int m = 0; m < numberArrays.length; m++) {
                if (numberArrays[m].equals(String.valueOf(k))) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public int 가까운수(int[] array, int n) {
        int answer = 0;
        int[] cha = new int[array.length];
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            cha[i] = Math.abs(array[i] - n);
        }
        int a = cha[0];
        int b = 0;

        for (int i = 1; i < cha.length; i++) {
            if (a > cha[i]) {
                a = cha[i];
                b = i;
            }
        }
        answer = array[b];
        return answer;
    }

}
