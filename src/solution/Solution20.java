package solution;

import java.util.*;
import java.util.stream.Collectors;

public class Solution20 {
    public static void main(String[] args) {
        System.out.println(
                안전지대(new int[][]{
                        {1, 0, 1, 1, 0, 1, 1, 1, 1, 1},
                        {0, 0, 1, 1, 0, 1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
                        {0, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                        {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},

                }));
    }

    public static int 안전지대(int[][] board) {
        int answer = board.length * board[0].length;
        Set<String> mineList = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    if (i - 1 != -1) {
                        if (j - 1 != -1) {
                            mineList.add((i - 1) + "" + (j - 1));
                        }
                        if (j + 1 != board.length) {
                            mineList.add((i - 1) + "" + (j + 1));
                        }
                        mineList.add((i - 1) + "" + j);
                    }
                    mineList.add(i + "" + j);
                    if (j - 1 != -1) {
                        mineList.add(i + "" + (j - 1));
                    }
                    if (j + 1 != board.length) {
                        mineList.add(i + "" + (j + 1));
                    }
                    if (i + 1 != board.length) {
                        mineList.add((i + 1) + "" + j);
                        if (j + 1 != board.length) {
                            mineList.add((i + 1) + "" + (j + 1));
                        }
                        if (j - 1 != -1) {
                            mineList.add((i + 1) + "" + (j - 1));
                        }
                    }

                }
            }
        }
        List<String> stringList = new ArrayList<>(mineList.stream().collect(Collectors.toList()));
        System.out.println(stringList.stream().sorted().collect(Collectors.toList()));

        System.out.println(stringList.stream().sorted().collect(Collectors.toList()));
        System.out.println(stringList.size());
        answer = answer - stringList.size();
        for (int i = 0; i < 100; i++) {

        }
        return answer;
    }
}
