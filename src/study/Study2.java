package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Study2 {
    public int 숫자문자열과영단어(String s) {
        int answer = 0;
        String[] numberArray = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight",
                "nine"};
        for (int i = 0; i < numberArray.length; i++) {
            if (s.contains(numberArray[i])) {
                s = s.replaceAll(numberArray[i], String.valueOf(i));
            }
        }
        answer = Integer.valueOf(s);
        return answer;
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for (int i = 0; i < places.length; i++) {
            String[][] arrays = new String[places.length][places[0].length];
            for (int j = 0; j < places[i].length; j++) {
                arrays[j] = places[i][j].split("");
            }
            ArrayList<Integer> integerArrayList1 = new ArrayList<>();
            ArrayList<Integer> integerArrayList2 = new ArrayList<>();

            for (int j = 0; j < arrays.length; j++) {
                for (int k = 0; k < arrays[i].length; k++) {
                    if (arrays[j][k].equals("P")) {
                        integerArrayList1.add(j);
                        integerArrayList2.add(k);
                    }
                }
            }
            int ntrue = 1;
            for (int j = 0; j < integerArrayList1.size(); j++) {
                for (int k = 0; k < integerArrayList1.size(); k++) {
                    int r1 = integerArrayList1.get(j);
                    int c1 = integerArrayList2.get(j);
                    int r2 = integerArrayList1.get(k);
                    int c2 = integerArrayList2.get(k);
                    int manhattan = Math.abs(r1 - r2) + Math.abs(c1 - c2);
                    if (manhattan <= 2 && manhattan > 0) {
                        for (int l = 0; l < integerArrayList1.get(l); l++) {
                            for (int m = 0; m < integerArrayList2.get(m); m++) {
                                if (arrays[l][m].equals("X")) {
                                    manhattan++;
                                }
                            }
                        }
                    }
                    if (manhattan <= 2 && manhattan > 0) {
                        ntrue = 0;
                    }
                }
                answer[i] = ntrue;
            }
        }
        System.out.println(answer[0]);
        return answer;
    }
}
