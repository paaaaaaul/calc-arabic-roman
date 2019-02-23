package Calc;

import java.util.Scanner;

import static Calc.CalculatorInput.getDecimalNumber;

public class RomanCalculation {

    public static void main(String[] args) {
        getRomanConvertToArabReturnString();
    }

    public static String getRomanConvertToArabReturnString() {
        System.out.println("You choose Roman calculation");
        System.out.println("Insert Roman number");

        System.out.println("Or press 'q' to quit");

        String n;
        Scanner input = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        n = input.nextLine();

        while (!input.toString().equals("calculate")/*  ???????????????  */) {
            System.out.println("Input Roman uppercase (Important) number, than press Enter button");
            if (
                    n.equals("+")
                            || n.equals("-")
                            || n.equals("/")
                            || n.equals("*")
                            || n.equals("(")
                            || n.equals(")")
                    ) {
                System.out.println("you entered:" + n);
                builder.append(n);
            } else if (input.toString().equals("calculate")){
                System.out.println("here's the result");
                System.out.println(CalcWithBrackets.calculate(builder.toString()));
                break;
            } else {
                System.out.println(getDecimalNumber(n));
                builder.append(getDecimalNumber(n));
                System.out.println("You entered " + n);
//                continue;
            }
        }
        System.out.println("builder in while: " + builder);
        return builder.toString();
    }

}
