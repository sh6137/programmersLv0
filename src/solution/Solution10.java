package solution;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Solution10 {
    public int 팩토리얼(int n) {
        int answer = 1;
        while (true) {
            if (factorial(answer) <= n) {
                answer++;
            } else {
                answer--;
                break;
            }
        }
        return answer;
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public String 중복된문자제거(String my_string) {
        String answer = "";
        char[] toCharArray = my_string.toCharArray();
        for (int i = 0; i < toCharArray.length; i++) {
            if (!answer.contains(String.valueOf(toCharArray[i]))) {
                answer = answer + toCharArray[i];
            }
        }
        return answer;
    }

    public String 모스부호1(String letter) {
        String answer = "";
        String[] letterSplit = letter.split(" ");
        Map<String, String> alphabetMap = new HashMap<>() {
            {
                put(".-", "a");
                put("-...", "b");
                put("-.-.", "c");
                put("-..", "d");
                put(".", "e");
                put("..-.", "f");
                put("--.", "g");
                put("....", "h");
                put("..", "i");
                put(".---", "j");
                put("-.-", "k");
                put(".-..", "l");
                put("--", "m");
                put("-.", "n");
                put("---", "o");
                put(".--.", "p");
                put("--.-", "q");
                put(".-.", "r");
                put("...", "s");
                put("-", "t");
                put("..-", "u");
                put("...-", "v");
                put(".--", "w");
                put("-..-", "x");
                put("-.--", "y");
                put("--..", "z");
            }
        };

        for (int i = 0; i < letterSplit.length; i++) {
            answer += alphabetMap.get(letterSplit[i]);
        }
        return answer;
    }

    public BigDecimal 구슬을나누는경우의수(int balls, int share) {
        BigDecimal[] n = new BigDecimal[31];
        n[0] = new BigDecimal("1");
        n[1] = new BigDecimal("1");
        for (int i = 2; i <= 30; i++) {
            n[i] = n[i - 1].multiply(new BigDecimal(Integer.toString(i)));
        }
        return n[balls].divide(n[balls-share].multiply(n[share]));
    }
}
