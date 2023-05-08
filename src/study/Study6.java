package study;

public class Study6 {
    public String 문자열의_뒤의_n글자(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length() - n);
        return answer;
    }

    public int 길이에_따른_연산(int[] num_list) {
        int answer = 0;
        if (num_list.length >= 11) {
            for (int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
        } else {
            answer = 1;
            for (int i = 0; i < num_list.length; i++) {
                answer *= num_list[i];
            }
        }
        return answer;
    }

    public String 대문자로_바꾸기(String myString) {
        String answer = "";
        answer = myString.toUpperCase();
        return answer;
    }

    public String solution(String myString) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        Study6 study6 = new Study6();
        System.out.println(study6.문자열의_뒤의_n글자("ProgrammerS123", 11));
    }
}
