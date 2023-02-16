package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution9 {
    public String 인덱스바꾸기(String my_string, int num1, int num2) {
//        String answer = "";
//        String[] str = my_string.split("");
//        String a = str[num1];
//        String b = str[num2];
//        str[num1] = b;
//        str[num2] = a;
//        answer = Arrays.stream(str).collect(Collectors.joining(""));
//        return answer;

        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);
        return String.join("", list);
    }

    public int 숫자찾기(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        List<String> list = Arrays.stream(str.split("")).collect(Collectors.toList());
        answer = list.indexOf(String.valueOf(k));
        if (answer != -1) {
            answer += 1;
        }
        return answer;
    }

    public int 삼육구게임(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        List<String> list = Arrays.stream(str.split("")).collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("3") || list.get(i).equals("6") || list.get(i).equals("9")) {
                answer += 1;
            }
        }
        return answer;
    }

    public String 문자열정렬하기2(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] ch = my_string.toCharArray();
        Arrays.sort(ch);
        answer = String.valueOf(ch);
        return answer;
    }

    public int 합성수찾기(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            List<Integer> integerList = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    integerList.add(j);
                }
            }
            if (integerList.size() > 2) {
                answer++;
            }
        }
        return answer;
    }


}
