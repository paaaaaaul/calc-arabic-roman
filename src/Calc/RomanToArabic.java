package Calc;

public class RomanToArabic {

//    public static void romanToArabicMethod() {

    public static void main(String[] args) {
        RomanToArabic romanToArabic = new RomanToArabic();

        String string = "III";
        System.out.println("RomantoArabic" + RomanToArabic.romanToDecimalTransform(string));
    }

    static int value(char romanChar) {
        if (romanChar == 'I') return 1;
        if (romanChar == 'V') return 5;
        if (romanChar == 'X') return 10;
        if (romanChar == 'L') return 50;
        if (romanChar == 'C') return 100;
        if (romanChar == 'D') return 500;
        if (romanChar == 'M') return 1000;
        return -1;
    }

    public static int romanToDecimalTransform(String string) {
        int res = 0;
        for (int i = 0; i < string.length(); i++) {
            int s1 = value(string.charAt(i));

            if (i + 1 < string.length()) {
                int s2 = value(string.charAt(i + 1));

                if (s1 >= s2) {
                    res = res + s1;
                } else {
                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
                i++;
            }
        }
        return res;
    }

//    }

}
