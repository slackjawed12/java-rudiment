package chap06.exercise;

public class Exercise6_18 {
    public static boolean isNumber(String s) {
        if (s == null || s.equals("")) {
            return false;
        } else {
            int i;
            for (i = 0; i < s.length(); i++) {
                char x = s.charAt(i);
                if (x < '0' || x > '9') {
                    break;
                }
            }
            return i == s.length();
        }
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }


}
