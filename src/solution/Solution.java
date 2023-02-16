package solution;

public class Solution {
//    public int solution(int num1, int num2) {
//        int answer = 0;
//        if (num1 == num2) {
//            answer = 1;
//        } else {
//            answer = -1;
//        }
//        return answer;
//    }

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        //de 분자,
        int[] answer = new int[2];
        int bunJa = (denum1 * num2) + (denum2 * num1);
        int bunMo = num1 * num2;
        int mod = eucd(bunJa, bunMo);
        bunJa /= mod;
        bunMo /= mod;
        answer[0] = bunJa;
        answer[1] = bunMo;
        return answer;
    }

    //최대공약수
    public int eucd(int big, int small) {
        int result = big % small;
        if (result == 0) {
            return small;
        } else {
            return eucd(small, result);
        }
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                answer = answer + i;
            }
        }
        return answer;
    }

    public double solution(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        answer = answer / numbers.length;
        return answer;
    }

    public int solution(int n, int k) {
        int answer = 0;
        int yamg = 12000;
        int drink = 2000;
        System.out.println(n / 10);
        System.out.println(n % 10);
        if (n / 10 != 0) {
            int discount = n / 10;
            k = k - discount;
            if (k <= 0) {
                k = 0;
            }
        }
        answer = yamg * n + drink * k;
        return answer;
    }

    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                answer = answer + 1;
            }
        }
        return answer;
    }

}
