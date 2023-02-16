package solution;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;

public class Solution21 {

    public static void main(String[] args) {
//        System.out.println(겹치는_선분의_길이(new int[][]{{0, 1}, {2, 5}, {3, 9}}));
//        System.out.println(평행(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
        System.out.println(옹알이(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
    }

    public static int 겹치는_선분의_길이(int[][] lines) {
        int answer = 0;
        int[] intArrayFirst = new int[lines.length];
        int[] intArrayLast = new int[lines.length];
        for (int i = 0; i < lines.length; i++) {
            intArrayFirst[i] = lines[i][0];
            intArrayLast[i] = lines[i][1];
        }
        Arrays.sort(intArrayFirst);
        Arrays.sort(intArrayLast);

        for (int i = intArrayFirst[0]; i < intArrayLast[intArrayLast.length - 1]; i++) {
            int count = 0;
            for (int j = 0; j < lines.length; j++) {
                if (i >= lines[j][0] && i < lines[j][1]) {
                    count++;
                }
            }
            if (count >= 2) {
                answer++;
            }
        }
        return answer;
    }

    public static int 평행(int[][] dots) {
        int answer = 0;
        //todo : 2차원 배열 정렬
        Arrays.sort(dots, Comparator.comparingInt(o1 -> o1[0]));

        Point a = new Point(dots[0][0], dots[0][1]);
        Point b = new Point(dots[1][0], dots[1][1]);
        Point c = new Point(dots[2][0], dots[2][1]);
        Point d = new Point(dots[3][0], dots[3][1]);


        double dx = a.x - b.x;
        double dy = a.y - b.y;
        double r = Math.toDegrees(Math.atan2(dy, dx));

        double dx2 = c.x - d.x;
        double dy2 = c.y - d.y;
        double r2 = Math.toDegrees(Math.atan2(dy2, dx2));

        if (r2 == r) {
            answer = 1;
        }

        return answer;
    }

    public static int 옹알이(String[] babbling) {
        int answer = 0;
        String[] exStr = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < exStr.length; j++) {
                babbling[i] = babbling[i].replaceAll(exStr[j], " ");
            }
        }

        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll(" ", "");
            if (babbling[i].equals("")) {
                answer++;
            }
        }

        return answer;
    }
}
