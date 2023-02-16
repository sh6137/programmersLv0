package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution16 {
    public String 다항식_더하기(String polynomial) {
        String answer = "";
        String[] a = polynomial.split(" ");
        List<String> pList = new ArrayList<>(Arrays.asList(a));
        List<String> includeX = new ArrayList<>();
        List<String> numberList = new ArrayList<>();
        int totalNumber = 0;
        int totalX = 0;
        for (int i = 0; i < pList.size(); i++) {
            if (pList.get(i).contains("+")) {
                pList.remove(i);
                --i;
            }
        }

        for (int i = 0; i < pList.size(); i++) {
            if (pList.get(i).contains("x")) {
                includeX.add(pList.get(i));
            } else {
                numberList.add(pList.get(i));
            }
        }

        for (int i = 0; i < includeX.size(); i++) {
            if (includeX.get(i).length() > 1) {
                totalX = totalX + Integer.valueOf(includeX.get(i).replaceAll("x", ""));
            } else {
                totalX++;
            }
        }
        for (int i = 0; i < numberList.size(); i++) {
            totalNumber = totalNumber + Integer.valueOf(numberList.get(i));
        }

        if (totalX == 0) {
            answer = String.valueOf(totalNumber);
        } else if (totalX == 1) {
            if (totalNumber == 0) {
                answer = String.valueOf(totalX).replaceAll("1", "") + "x";
            } else {
                answer = String.valueOf(totalX).replaceAll("1", "") + "x" + " + " + totalNumber;
            }
        } else{
            if (totalNumber == 0) {
                answer = String.valueOf(totalX) + "x";
            } else {
                answer = String.valueOf(totalX) + "x" + " + " + totalNumber;
            }
        }


        return answer;
    }
}
