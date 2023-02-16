package solution;

import java.util.*;
import java.util.stream.Collectors;

public class Solution17 {
    public int 문자열_밀기(String A, String B) {
        int answer = 0;
        int count = 0;
        String a = A;
        if (!A.equals(B)) {
            for (int i = 0; i < A.length(); i++) {
                a = A.substring(A.length() - 1);
                a = a + A.substring(0, A.length() - 1);
                if (a.equals(B)) {
                    count++;
                    break;
                } else {
                    count++;
                }
                A = a;
            }
            if (count == A.length()) {
                if (!A.equals(B)) {
                    count = -1;
                }
            }
        }
        answer = count;
        return answer;
    }

    public int 문자열_밀기_다른사람풀이(String A, String B) {
        return (B + B).indexOf(A);
    }

    public String 로그인_성공(String[] id_pw, String[][] db) {
        String answer = "";
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < db.length; i++) {
            if (db[i].length != 0) {
                if (!hashMap.containsKey(db[i][0])) {
                    hashMap.put(db[i][0], db[i][1]);
                }
            }
        }
        if (hashMap.get(id_pw[0]) != null) {
            if (hashMap.get(id_pw[0]).equals(id_pw[1])) {
                answer = "login";
            } else {
                answer = "wrong pw";
            }
        } else {
            answer = "fail";
        }

        return answer;
    }

    public int 유한소수_판별하기(int a, int b) {
        int answer = 0;
        int gcd = gcd(b, a);
        int bunMo = b / gcd;

        Set<Integer> integerSet = new HashSet<>();
        for (int i = 2; i <= bunMo; i++) {
            while (bunMo % i == 0) {
                integerSet.add(i);
                bunMo = bunMo / i;
            }
        }
        integerSet = integerSet.stream().filter(f -> !f.equals(2)).filter(f -> !f.equals(5)).collect(Collectors.toSet());
        if (integerSet.size() == 0) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    //최대공약수
    public int gcd(int big, int small) {
        int result = big % small;
        if (result == 0) {
            return small;
        } else {
            return gcd(small, result);
        }
    }

    public int[] 등수매기기(int[][] score) {
        int[] answer = {};
        List<Double> avgList = new ArrayList<>();
        List<Integer> avgRank = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            avgList.add((score[i][0] + score[i][1]) / 2.0);
        }
        for (int i = 0; i < avgList.size(); i++) {
            avgRank.add(1);
            for (int j = 0; j < avgList.size(); j++) {
                if (i!=j && avgList.get(i) < avgList.get(j)) {
                    avgRank.set(i,avgRank.get(i)+1);
                }
            }
        }
        answer = avgRank.stream().mapToInt(f -> f.intValue()).toArray();

        return answer;
    }

}
