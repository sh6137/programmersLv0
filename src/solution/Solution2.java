package solution;

import java.util.*;

public class Solution2 {
//    public int[] solution(int[] numbers) {
//        int[] answer = new int[numbers.length];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = numbers[i] * 2;
//        }
//        return answer;
//    }

//    public int[] solution(int money) {
//        int[] answer = new int[2];
//        int coffee = 5500;
//        answer[0] = money / coffee;
//        answer[1] = money % coffee;
//        return answer;
//    }

//    public int solution(int[] dot) {
//        int answer = 0;
//        if (dot[0] > 0 && dot[1] > 0) {
//            answer = 1;
//        } else if (dot[0] < 0 && dot[1] > 0) {
//            answer = 2;
//        } else if (dot[0] < 0 && dot[1] < 0) {
//            answer = 3;
//        } else if (dot[0] > 0 && dot[1] < 0) {
//            answer = 4;
//        }
//        return answer;
//    }

    //todo : 문자열 뒤집기
//    public String solution(String my_string) {
//        String answer = "";
//        StringBuffer buffer = new StringBuffer(my_string);
//        answer = buffer.reverse().toString();
//        return answer;
//    }

    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    //todo : 삼각형의 완선조건
//    public int solution(int[] sides) {
//        int answer = 0;
//        Arrays.sort(sides);
//        if (sides[2] < sides[0] + sides[1]) {
//            answer = 1;
//        } else {
//            answer = 2;
//        }
//        return answer;
//    }

    public int 중앙값구하기(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int middle = (array.length - 1) / 2;
        answer = array[middle];
        return answer;
    }

    public int 최빈값구하기(int[] array) {
        int answer = 0;
        int[] count = new int[array.length];
        int countInt = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                count[countInt] = 1;
                hash.put(array[i], count[i]);
            } else if (array[i] == array[i - 1]) {
                count[countInt] += 1;
                hash.put(array[i], count[countInt]);
            } else {
                countInt += 1;
                count[countInt] += 1;
                hash.put(array[i], count[countInt]);
            }
        }
        System.out.println("++");
        System.out.println(hash);
        System.out.println("++");
        int [] keys = new int[hash.size()] ;
        int num = 0;
        for (int key: hash.keySet()) {
            keys[num] = key;
            num++;
        }
        int maxKey = 0;
        int maxValue = 0;
        for (int i = 0; i < hash.size(); i++) {
            if (maxValue < hash.get(keys[i])) {
                maxKey = keys[i];
                maxValue = hash.get(keys[i]);
            }
        }
        int count2 = 0;
        for (int i = 0; i < hash.size(); i++) {
            if (maxValue == hash.get(keys[i])) {
                count2++;
            }
        }
        if (count2 == 1) {
            answer = maxKey;
        }else{
            answer = -1;
        }

        return answer;
    }

    public int solution(int n) {
        int answer = 0;
        int split = 7;
        if (n % split == 0) {
            answer = n / split;
        } else {
            answer = n / split + 1;
        }
        return answer;
    }

    public int solution(int slice, int n) {
        int answer = 0;
        if (n % slice == 0) {
            answer = n / slice;
        } else {
            answer = n / slice + 1;
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        int slice = 6;
        int mod;
        if (n > slice) {
            mod = eucd(n, slice);
            System.out.println("mod : " + mod);
        } else {
            mod = eucd(slice, n);
            System.out.println("mod : " + mod);
        }
        answer = mod * n / mod * slice / mod;
        answer = answer / slice;
        return answer;
    }

    //유클리드 호제법 : 최대공약수
    //최소공배수 = 최대공약수 * (수 1 / 최대공약수) * (수 2/ 최대공약수)
    public int eucd(int big, int small) {
        int result = big % small;
        if (result == 0) {
            return small;
        } else {
            return eucd(small, result);
        }
    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                answer[0] = answer[0] + 1;
            } else {
                answer[1] = answer[1] + 1;
            }
        }
        return answer;
    }

    public int solution(String message) {
        int answer = 0;
        answer = message.length() * 2;
        return answer;
    }

}
