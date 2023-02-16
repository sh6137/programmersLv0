package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Study3 {
    public int solution(int[] number) {
        int answer = 0;
        Set<String> arrayList = new HashSet<>();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                for (int k = 0; k < number.length; k++) {
                    if (i != j && i != k && k != j) {
                        if (number[i] + number[j] + number[k] == 0) {
                            int[] a = new int[3];
                            a[0] = i;
                            a[1] = j;
                            a[2] = k;
                            Arrays.sort(a);
                            arrayList.add(String.valueOf(a[0])+String.valueOf(a[1])+String.valueOf(a[2]));
                        }
                    }
                }
            }
        }
        return arrayList.size();
    }
}
