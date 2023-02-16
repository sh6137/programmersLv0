package solution;

import java.util.*;
import java.util.stream.Collectors;

public class Solution6 {
    public int[] 진료순서정하기(int[] emergency) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(emergency)        // IntStream
                .boxed()          // Stream<Integer>
                .collect(Collectors.toList());
        List<Integer> clone = new ArrayList<>(list);
        Collections.sort(clone, Collections.reverseOrder());

        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            int a = clone.indexOf(list.get(i)) + 1;
            arrayList.add(a);
        }
        answer = arrayList.stream().mapToInt(i -> i).toArray();
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }

    public int 세균증식(int n, int t) {
        int answer = 0;
        for (int i = 0; i < t; i++) {
            n *= 2;
        }
        answer = n;
        return answer;
    }

    public String 가위바위보(String rsp) {
        String answer = "";
        String[] split = rsp.split("");
        for (int i = 0; i < split.length; i++) {
            if (Integer.valueOf(split[i]) == 2) {
                answer += "0";
            } else if (Integer.valueOf(split[i]) == 0) {
                answer += "5";
            } else if (Integer.valueOf(split[i]) == 5) {
                answer += "2";
            }
        }
        return answer;
    }

    public String 암호해독(String cipher, int code) {
        String answer = "";
        int count = 1;
        String[] split = cipher.split("");
        for (int i = 0; i < split.length; i++) {
            if (count % code == 0) {
                answer += split[i];
            }
            count++;
        }
        return answer;
    }

}
