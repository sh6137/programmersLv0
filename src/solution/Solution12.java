package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution12 {
    public String 한번만등장한문자(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str);
        List<String> stringList = Arrays.asList(str);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < stringList.size(); i++) {
            int finalI1 = i;
            if (stringList.stream().filter(f -> f.contains(stringList.get(finalI1))).count() == 1) {
                result.add(stringList.get(i));
            }
        }
        for (int i = 0; i < result.size(); i++) {
            answer += result.get(i);
        }
        return answer;
    }

    public int 공던지기(int[] numbers, int k) {
        int answer = 0;
        answer = numbers[(k - 1) * 2 % numbers.length];
        return answer;
    }

    public String 이진수더하기(String bin1, String bin2) {
        String answer = "";
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int num3 = num1 + num2;
        answer = Integer.toString(num3,2);
        return answer;
    }

    public int 칠의개수(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String[] str = String.valueOf(array[i]).split("");
            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }

}
