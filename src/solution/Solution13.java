package solution;

import java.util.*;

public class Solution13 {
    public int 숨어있는숫자의덧셈2(String my_string) {
        int answer = 0;
        String pattern = "^[0-9]*$";
        String[] str = my_string.split("[a-zA-Z]");
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                stringList.add(str[i]);
            }
        }
        answer = stringList.stream().mapToInt(f -> Integer.valueOf(f)).sum();

        return answer;
    }

    public int[] 소인수분해(int n) {
        int[] answer = {};
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                integerSet.add(i);
                n = n / i;
            }
        }
        answer = integerSet.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public int 컨트롤제트(String s) {
        int answer = 0;
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("Z")) {
                str[i] = "-" + str[i - 1];
                str[i] = str[i].replaceAll("--", "");
            }
        }
        List<String> stringList = Arrays.asList(str);
        answer = stringList.stream().mapToInt(f -> Integer.valueOf(f)).sum();
        return answer;
    }

    public long 영어가싫어요(String numbers) {
        long answer = 0;
        String[] numberArray = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight",
                "nine"};
        for (int i = 0; i < numberArray.length; i++) {
            if (numbers.contains(numberArray[i])) {
                numbers = numbers.replaceAll(numberArray[i], String.valueOf(i));
            }
        }
        answer = Long.valueOf(numbers);

        return answer;
    }
}
