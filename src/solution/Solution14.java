package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution14 {
    public String[] 잘라서배열로저장하기(String my_str, int n) {
        String[] answer = {};
        int range = my_str.length();
        int count = range / n;
        if (range % n != 0) {
            count++;
        }
        answer = new String[count];

        for (int i = 0; i < count; i++) {
            if (my_str.length() < n) {
                answer[i] = my_str;
            } else {
                answer[i] = my_str.substring(0, n);
                my_str = my_str.substring(n);
            }
        }
        return answer;
    }

    public int 외계어사전(String[] spell, String[] dic) {
        int answer = 0;
        String[] aaa = new String[dic.length];
        for (int i = 0; i < dic.length; i++) {
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j])) {
                    aaa[i] = "1";
                } else {
                    aaa[i] = "2";
                    break;
                }
            }
        }
        List<String> stringList = Arrays.asList(aaa);
        if (stringList.contains("1")) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    public int 삼각형의완성조건2(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        int low = max - min;
        int high = max + min;

        answer = high - low - 1;
        return answer;
    }

    public String[] OX퀴즈(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < answer.length; i++) {
            String[] str = quiz[i].split(" ");
            List<String> stringList = Arrays.asList(str);
            if (stringList.get(1).equals("-")) {
                int a = Integer.valueOf(stringList.get(0)) - Integer.valueOf(stringList.get(2));
                if (a == Integer.valueOf(stringList.get(4))) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                int a = Integer.valueOf(stringList.get(0)) + Integer.valueOf(stringList.get(2));
                if (a == Integer.valueOf(stringList.get(4))) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }

    public int 종이자르기(int M, int N) {
        int answer = 0;
        answer = M * N - 1;
        return answer;
    }

}
