package Calc;

public class CheckIfNumberIsArabicOrRoman {

    static void splitString(String str) {
//        StringBuffer alpha = new StringBuffer(),
//                        num = new StringBuffer(),
//                    special = new StringBuffer();

        for (int i=0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i))) {
                System.out.println("num");

            } else if(Character.isAlphabetic(str.charAt(i))) {
                System.out.println("roman");

            } else {
                System.out.println("else");
            }
        }


    }
}
