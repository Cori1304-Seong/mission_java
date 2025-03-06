package com.ogicfflc;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 =0;

    System.out.println("작성자 이름: 성종민, 나이: 27살");


    System.out.println("\t< 가능 옵션>");
    System.out.println("1: 두 수의 합 구하기\n2: 더 큰 숫자 출력하기");
    System.out.println("원하는 기능에 숫자를 입력하고 enter를 눌러 주세요");

    Scanner sc = new Scanner(System.in);
    String userNum = sc.nextLine();

    System.out.println("입력한 옵션 값은:" + userNum);
    System.out.println("숫자 2개를 입력해 주세요");
    switch (userNum){

        case "1":
           num1 = scanNumber();
           num2 = scanNumber();
           System.out.println("두 숫자의 합은" + (num1 + num2));
           break;
        case "2":
            num1 = scanNumber();
            num2 = scanNumber();
            System.out.println("두 숫자중 더 큰 값은" + Math. max(num1, num2));
            break;

            default: System.out.println("입력된 옵션 값이 이상합니다.");
    }
        System.out.println("\n프로그램을 종료합니다. \n");

    }
    private static int scanNumber(){

        Scanner sc = new Scanner(System.in);
        String userNum = sc.nextLine();
        return  Integer.parseInt(userNum);

    }
}