package Calc;

public class CalculatorInput {
    //место для мейна или тестов

    public static void main(String[] args) {
//        String calc = "10+(20+90)";
//        CheckIfNumberIsArabicOrRoman.splitString(calc);


        String calc = "II+(XV+II)";
        splitString(calc);
//        System.out.println(RomanToArabic.romanToDecimalTransform("III"));

//        romanToArabStringConvertor(calc);



    }


//    public static String romanToArabStringConvertor(String string) {
//
//
//
//        for (int i = 0; i < string.length(); i++) {
//            if (string.contentEquals())
//
//
//
//        }
//        return ;
//
//    }

    static void splitString(String str)
    {
        StringBuffer alpha = new StringBuffer(),
                num = new StringBuffer(), special = new StringBuffer();

        for (int i=0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i))) {
                num.append(str.charAt(i));

            } else if(Character.isAlphabetic(str.charAt(i))) {
               if (!Character.isAlphabetic(str.charAt(i)) && !Character.isDigit(str.charAt(i))) {
                   System.out.println(RomanToArabic
                           .romanToDecimalTransform(
                                   Character.toString(str.charAt(i)) +
                                        Character.toString(str.charAt(i))));
               }
//                alpha.append(str.charAt(i));

//                System.out.println( RomanToArabic.romanToDecimalTransform(Character.toString(str.charAt(i)) +
//                        Character.toString(str.charAt(i))));
                System.out.println(" " + RomanToArabic.romanToDecimalTransform(Character.toString(str.charAt(i))));
            }else {
                special.append(str.charAt(i));
            }
        }

        System.out.println("alpha: " + alpha);
        System.out.println("num: " + num);
        System.out.println("special: " + special);
    }

}
