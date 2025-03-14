package mission_normal.calculator;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class Calculator {

    public void sortNums(int[] array) {
        Arrays.sort(array);
    }


/*예외 처리가 포함된 계산기 프로그램 작성하기*/
//    public static int addStringNumber(String num1, String num2) {
//        try {
//            int n1 = Integer.parseInt(num1);
//            int n2 = Integer.parseInt(num2);
//            return n1 + n2;
//        } catch (NumberFormatException e) {
//            System.out.println("숫자 문자가 아닙니다. : " + num1);
//            throw new IllegalArgumentException("숫자 문자가 아닙니다.: " + e.getMessage());
//        }
//    }


    /*람다 표현식을 활용한 간단한 계산기 프로그램 작성하기*/

    public IntBinaryOperator add = (a, b) -> a + b;

    public IntBinaryOperator minus = (a, b) -> a - b;

    public IntBinaryOperator multi = (a, b) -> a * b;

    public IntBinaryOperator divide = (a, b) -> a / b;





}
