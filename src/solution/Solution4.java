package solution;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution4 {
    public int 옷가게할인받기(int price) {
        int answer = 0;
        BigDecimal bigPrice = new BigDecimal(price);
        if (bigPrice.intValue() >= 100000 && bigPrice.intValue() < 300000) {
            bigPrice = bigPrice.multiply(new BigDecimal("0.95"));
        } else if (bigPrice.intValue() >= 300000 && bigPrice.intValue() < 500000) {
            bigPrice = bigPrice.multiply(new BigDecimal("0.90"));
        } else if (bigPrice.intValue() >= 500000) {
            bigPrice = bigPrice.multiply(new BigDecimal("0.80"));
        }
        answer = bigPrice.intValue();
        return answer;
    }

    public int 배열의유사도(String[] s1, String[] s2) {
        int answer = 0;
        List<String> list1 = new ArrayList<>(Arrays.asList(s1));
        List<String> list2 = new ArrayList<>(Arrays.asList(s2));

        list1.retainAll(list2);

        answer = list1.size();
        return answer;
    }

    public int 문자열안에문자열(String str1, String str2) {
        int answer = 0;
        if (str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    public int 자릿수더하기(int n) {
        int answer = 0;
        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public int 순서쌍의개수(int n) {
        int answer = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        answer = count;
        return answer;
    }

    public int 제곱수판별하기(int n) {
        int answer = 0;
        int test = (int) Math.sqrt(n);
        if (test * test == n) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    //직각삼각형 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public int 숨어있는숫자의덧셈(String my_string) {
        int answer = 0;
        String[] str = my_string.split("");
        for (int i = 0; i < str.length; i++) {
            if (Character.isDigit(str[i].charAt(0))) {
                answer += Integer.valueOf(str[i]);
            }
        }
        return answer;
    }
}
