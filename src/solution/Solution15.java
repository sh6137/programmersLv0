package solution;

import java.util.Arrays;
import java.util.List;

public class Solution15 {
    public int[] 캐릭터의좌표(String[] keyinput, int[] board) {
        String[] targets = new String[]{"right", "left", "up", "down"};
        int[] answer = new int[2];
        int[] width = new int[2];
        int[] height = new int[2];
        List<String> keyList = Arrays.asList(keyinput);

        width[0] = board[0] / 2;
        width[1] = -(board[0] / 2);

        height[0] = board[1] / 2;
        height[1] = -(board[1] / 2);

        for (int i = 0; i < keyList.size(); i++) {
            if (keyinput[i].equals(targets[0])) {
                answer[0]++;
                if (answer[0] > width[0]) {
                    answer[0] = width[0];
                }
            } else if (keyinput[i].equals(targets[1])) {
                answer[0]--;
                if (answer[0] < width[1]) {
                    answer[0] = width[1];
                }
            } else if (keyinput[i].equals(targets[2])) {
                answer[1]++;
                if (answer[1] > height[0]) {
                    answer[1] = height[0];
                }
            } else if (keyinput[i].equals(targets[3])) {
                answer[1]--;
                if (answer[1] < height[1]) {
                    answer[1] = height[1];
                }
            }
        }
        return answer;
    }

    public int 직사각형_넓이_구하기(int[][] dots) {
        int answer = 0;
        int[] sample = new int[2];
        int[] result = new int[2];
        sample[0] = dots[0][0];
        sample[1] = dots[0][1];

        for (int i = 0; i < dots.length; i++) {
            if (dots[i][0] != sample[0]) {
                result[0] = dots[i][0];
            }
            if (dots[i][1] != sample[1]) {
                result[1] = dots[i][1];
            }
        }

        int a = (sample[0]+256) - (result[0]+256);
        int b = (sample[1]+256) - (result[1]+256);

        answer = Math.abs(a * b);
        return answer;
    }
}
