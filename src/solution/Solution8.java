package solution;

public class Solution8 {
    public int 최대값만들기2(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (j == 0) {
                    j = 1;
                    answer = numbers[i] * numbers[j];
                }
                if (numbers[i] != numbers[j]) {
                    if (answer < numbers[i] * numbers[j]) {
                        answer = numbers[i] * numbers[j];
                    }
                }
            }
        }
        return answer;
    }
}
