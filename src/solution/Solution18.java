package solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution18 {
    public int[] 특이한정렬(int[] numlist, int n) {
        int[] answer = {};
        List<Integer> integerList = Arrays.stream(numlist).boxed().collect(Collectors.toList());
        List<Integer> a = integerList.stream().sorted((o1, o2) -> {
                    int abs1 = Math.abs(o1 - n);
                    int abs2 = Math.abs(o2 - n);

                    if (abs2 == abs1) {
                        if (o1 > o2) {
                            return -1;
                        } else if (o1 < 02) {
                            return 1;
                        }
                    } else {
                        return abs1 - abs2;
                    }
                    return 0;
                }

        ).collect(Collectors.toList());


        return a.stream().mapToInt(value -> value).toArray();
    }

    public int 저주의_숫자_3(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).contains("3") || i % 3 == 0) {
                n++;
            }
//            if (i % 3 == 0) {
//                n++;
//            }
        }
        answer = n;
        return answer;
    }


}
