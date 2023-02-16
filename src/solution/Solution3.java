package solution;

import java.util.Arrays;

public class Solution3 {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (j != i) {
                    int multy = numbers[i] * numbers[j];
                    if (answer < multy) {
                        answer = multy;
                    }
                }
            }
        }
        return answer;
    }

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer = Arrays.copyOfRange(numbers, num1, num2);
        return answer;
    }

    public String solution(String my_string, int n) {
        String answer = "";
        String[] strings = my_string.split("");

        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].repeat(n);
        }
        for (int i = 0; i < strings.length; i++) {
            answer += strings[i];
        }
        return answer;
    }

    public int[] solution(int n) {
        int[] answer;
        if (n % 2==0) {
            answer = new int[n/2];
        }else{
            answer = new int[n/2+1];
        }
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                answer[count] = i;
                count++;
            }
        }
        return answer;
    }

}
