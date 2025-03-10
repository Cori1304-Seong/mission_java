package mission;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaBasic {

    public String getParity(int num){
        if (num %2 ==0) return "짝수";

        return "홀수";
    }

    // (Java) 1부터 10까지의 숫자 배열 출력하기
    public void printNumbers() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
    }

    // (Java) 5개의 정수 오름차순 정렬하기
    public void sortNumbers() {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("숫자를 입력하세요 : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("입력된 숫자: "+Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("정렬된 숫자"+Arrays.toString(arr));
    }

    // 두 개의 정수를 더하고 빼는 메서드 작성하기
    public void useCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("사용할 옵션을 선택하세요 ex) 더하기 or 빼기");
        String option = scanner.nextLine();
        if (option.equals("더하기") || option.equals("빼기")) {

            System.out.print("숫자1 입력 : ");
            int num1 = scanner.nextInt();
            System.out.print("숫자2 입력: ");
            int num2 = scanner.nextInt();

            System.out.println(option.equals("더하기")? "더하기 결과: " + (num1 + num2) : "빼기 결과: " + (num1 - num2));
        }
        else System.out.println("입력한 값이 이상합니다. 종료됩니다.");
    }

    // 사용자로부터 직사각형의 가로와 세로를 입력받아 넓이 출력하기
    public void calculateRectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("가로 길이: ");
        int x = scanner.nextInt();
        System.out.print("세로로 길이: ");
        int y = scanner.nextInt();

        System.out.println("직사각형의 넓이: " +(x*y) );

    }



    public int[] getAverage(int[] arr){
        String regex = "^\\d+\\s*,\\s*\\d+$";
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열 평균: " + Arrays.stream(arr).sum()/arr.length);

        while (true){
            System.out.println(" 배열의 원소를 바꾸고 싶다면 인데스와 값을 입력하세요 ex) \"1,50\" \n\t==== 아니면 N를 입력하세요 ====\n");
            String input = scanner.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if(input.equals("N") || input.equals("n"))  break;
            else if (matcher.matches()){
                String[] numbers = input.split(",");
                int index = Integer.parseInt(numbers[0]);
                int value = Integer.parseInt(numbers[1]);
                if (index > arr.length || index < 0){
                    System.out.println("입력 값이 이상합니다. 다시 이력해주세요... \n");
                    continue;
                }
                arr[index] = value;
            }
            else System.out.println("입력 값이 이상합니다. 다시 이력해주세요... \n");
        }

        System.out.println("배열 평균: " + Arrays.stream(arr).sum()/arr.length);

        return arr;
    }
}
