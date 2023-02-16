package solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution5 {
    public String 모음제거(String my_string) {
        String answer = "";
        String[] replace = {"a", "e", "i", "o", "u"};
        for (int i = 0; i < replace.length; i++) {
            my_string = my_string.replaceAll(replace[i], "");
        }
        answer = my_string;
        return answer;
    }

    public int 개미군단(int hp) {
        int answer = 0;
        int[] ant = {5, 3, 1};
        int i = 0;
        int count = 0;
        while (hp > 0) {
            if (hp - ant[i] > 0) {
                hp = hp - ant[i];
                count++;
            } else if (hp - ant[i] == 0) {
                count++;
                break;
            } else if (hp - ant[i] < 0) {
                i++;
            }
        }
        answer = count;
        return answer;
    }

    public int[] n의배수고르기(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                integers.add(numlist[i]);
            }
        }
        answer = integers.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public String 대문자와소문자(String my_string) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 64 && chars[i] < 91) {
                chars[i] = (char) (chars[i] + 32);
            } else {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }

    public String 외계행성의나이(int age) {
        String answer = "";
        String str = String.valueOf(age);
        int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] sAge = {"a","b","c","d","e","f","g","h","i","j"};
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (number[j] == Integer.valueOf(String.valueOf(chars[i]))) {
                    answer += sAge[j];
                }
            }
        }
        return answer;
    }
}
