package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Study4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(거리두기_확인하기(
                new String[][]{
                        {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                        {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                        {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                        {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                        {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
                })));

    }

    public static int[] 거리두기_확인하기(String[][] places) {
        int[] answer = new int[5];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 1;
        }
        for (int i = 0; i < places.length; i++) {
            String[][] str = new String[5][5];
            for (int j = 0; j < str.length; j++) {
                str[j] = places[i][j].split("");
            }
            List<int[]> person = new ArrayList<>();
            List<int[]> partition = new ArrayList<>();
            for (int j = 0; j < str.length; j++) {
                for (int k = 0; k < str[0].length; k++) {
                    if (str[j][k].equals("P")) {
                        person.add(new int[]{j, k});
                    } else if (str[j][k].equals("X")) {
                        partition.add(new int[]{j, k});
                    }
                }
            }
            //  (r1,c1), (r2,c2)
            // |r1 - r2| + |c1 - c2|
            int result = 1;
            for (int j = 0; j < person.size(); j++) {
                for (int k = i + 1; k < person.size(); k++) {
                    if (j != k) {
                        int[] point = person.get(j);
                        int[] point2 = person.get(k);
                        int num = Math.abs(point[0] - point2[0]) + Math.abs(point[1] - point2[1]);
                        if (num == 2) {
                            for (int l = 0; l < partition.size(); l++) {
                                int[] check = new int[2];
                                check[0] = partition.get(l)[0] + 1;
                                check[1] = partition.get(l)[1];
                                int[] check2 = new int[2];
                                check[0] = partition.get(l)[0];
                                check[1] = partition.get(l)[1] + 1;
                                int count = 0;
                                int count2 = 0;
                                if (check2[0] == 5 || check2[1] == 5) {
                                    count2 = 1;
                                }
                                if (check[0] == 5 || check[1] == 5) {
                                    count = 1;
                                }
                                if (partition.get(l) == check) {
                                    count = 1;
                                }
                                if (partition.get(l) == check2) {
                                    count2 = 1;
                                }
                                if (count2 == 1 && count == 1) {

                                } else {
                                    result = 0;
                                }
                            }
                        } else if (num > 2) {

                        } else if (num < 2) {
                            result = 0;
                        }

                    }
                }
            }
            answer[i] = result;
        }

        System.out.println(answer[0]);
        return answer;
    }

}
