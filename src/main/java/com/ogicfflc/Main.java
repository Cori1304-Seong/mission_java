package com.ogicfflc;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int maxNumber = getMaxFromUser();
        System.out.println("더 큰 숫자: " + maxNumber);


        int sumNumber = getSumFromUser();
        System.out.println("두 숫자의 합: " + sumNumber);
    }

    public static int getSumFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        return num1 + num2;
    }

    public static int getMaxFromUser() {
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 두 숫자를 입력받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        // 더 큰 숫자 반환
        return Math.max(num1, num2);
    }
}