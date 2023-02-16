package study;

import java.util.Arrays;

public class Study {
    public int 문자열계산(String my_string) {
        int answer = 0;
        String[] qu = my_string.split(" ");
        int sum = Integer.valueOf(qu[0]);
        for (int i = 0; i < qu.length; i++) {
            if (qu[i].equals("+")) {
                sum = sum + Integer.valueOf(qu[i + 1]);
            } else if (qu[i].equals("-")) {
                sum = sum - Integer.valueOf(qu[i + 1]);
            }
        }
        answer = sum;
        return answer;
    }

    public int 문자열계산스트림(String my_string) {
        int answer = 0;
        answer = Arrays.stream(my_string.replaceAll(" -", "-")
                .replaceAll("[+] ", "").split(" ")).mapToInt(Integer::valueOf).sum();
        return answer;
    }

    public int 치킨쿠폰(int chicken) {
        int originChicken = chicken;
        int answer = -1;
        int count = 0;
        for (int i = 0; i < chicken; i++) {
            count++;
            if (count % 10 == 0) {
                chicken++;
            }
        }
        System.out.println("치킨 : " + chicken);
        System.out.println(chicken - originChicken);
        answer = chicken - originChicken;
        return answer;
    }


}
