import java.util.Scanner;

public class Solution12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산>>");

        double num1= scanner.nextDouble();
        String cal=scanner.next();
        double num2=scanner.nextDouble();

        double result;

        switch (cal){
            case "+":
                result=num1+num2;
                System.out.println(num1+cal+num2+"의 계산 결과는"+result);
                break;
            case "-":
                result=num1-num2;
                System.out.println(num1+cal+num2+"의 계산 결과는"+result);
                break;
            case "*":
                result=num1*num2;
                System.out.println(num1+cal+num2+"의 계산 결과는"+result);
                break;
            case "/":
                if (num2!=0){
                    result=num1/num2;
                    System.out.println(num1+cal+num2+"의 계산 결과는"+result);
                }
                else
                    System.out.println("0으로 나눌 수 없습니다.");
                break;
        }

    }
}
