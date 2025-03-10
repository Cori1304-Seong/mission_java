package mission;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaBasic {

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
