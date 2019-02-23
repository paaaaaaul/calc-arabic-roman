package Calc;

import java.util.Scanner;

public class CalculatorInput {
    public static void main(String[] args) {


        // узнаем, что хочет вводить пользователь
        Scanner whatTypeOfNumberInput = new Scanner(System.in);
        System.out.println("Print 'A' for arabic calculation or 'R' for Roman calculation");
        String type = whatTypeOfNumberInput.next();


        if (type.equals("A")) {
            System.out.println("You choose Arabic calculation");
            System.out.println("Insert Arabic number");
            Scanner input = new Scanner(System.in);
            String expression = input.next();
//            String calcAr = "10+(20+90)";
            CalcWithBrackets.calculate(expression);


        } else if (type.equals("R")) {
            RomanCalculation.getRomanConvertToArabReturnString();
        } else {
            System.out.println("! ! ! WRONG CALCULATION TYPE ! ! ! ");
        }




//                String calcAr = "10+(20+90)";
//                CheckIfNumberIsArabicOrRoman.splitString(calcAr);

//        String calc = "III+(VI+XX)";
//        splitString(calc);
//        System.out.println(getDecimalNumber(calc));
//        romanToArabStringConvertor2(calc);
    }

    public static void romanToArabStringConvertor(String string) {

        StringBuilder builder = new StringBuilder();
        String[] arr;
        int counter = 0;

        arr = string.split("");


        for (int i = 0; i < string.length(); i++) {
            if (arr[i].equals("+")) {
                builder.append("+");
                System.out.println("+");
                counter = 0;

                continue;
            } else if (arr[i].equals("-")) {
                builder.append("-");
                counter = 0;

                continue;
            } else if (arr[i].equals("*")) {
                builder.append("*");
                counter = 0;

                continue;
            } else if (arr[i].equals("/")) {
                builder.append("/");
                counter = 0;

                continue;
            } else if (arr[i].equals(")")) {
                builder.append(")");
                counter = 0;

                continue;
            } else if (arr[i].equals("(")) {
                builder.append("(");
                counter = 0;
                continue;
            } else {
               //конвертируем римские в арабские

                // переводим римское число в арабское
                counter += RomanToArabic.romanToDecimalTransform(arr[i]);

                //вот тут нужно сложить все числа, которые идут до +,-,*,/,),(


                builder.append(counter);

//                System.out.println("if counter: " + counter);
            }
//            System.out.println("for counter: " + counter);
        }
        System.out.println(builder);
    }

    public static int getDecimalNumber(String number) {
        int result = 0;
        final int len = number.length();
        for (int i = 0; i < len - 1; i++) {
            if (getValue(number.charAt(i)) >= getValue(number.charAt(i + 1)))
                result += getValue(number.charAt(i));
            else
                result = result + getValue(number.charAt(i + 1)) - getValue(number.charAt(i));
        }
        result += getValue(number.charAt(len - 1));
        return result;
    }

    private static int getValue(char symbol) {
        if (symbol == 'I') { return 1; }
        if (symbol == 'V') { return 5; }
        if (symbol == 'X') { return 10; }
        if (symbol == 'L') { return 50; }
        if (symbol == 'C') { return 100; }
        if (symbol == 'D') { return 500; }
        if (symbol == 'M') { return 1000; }
        return -1;
    }

    public static void romanToArabStringConvertor2(String string) {
        StringBuilder builder = new StringBuilder();
        String[] arr;
        int counter = 0;
        arr = string.split("");
        for (int i = 0; i < string.length(); i++) {
            if (
                    arr[i].equals("+") ||
                    arr[i].equals("-") ||
                    arr[i].equals("*") ||
                    arr[i].equals("/") ||
                    arr[i].equals(")") ||
                    arr[i].equals("(")

                    ) {

                builder.append(arr[i]);
               counter = 0;
                System.out.println();
            } else {
                //конвертируем римские в арабские

                counter = RomanToArabic.romanToDecimalTransform(arr[i]) + counter;
                builder.append(counter);
            }
        }
        System.out.println(builder);

    }


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
