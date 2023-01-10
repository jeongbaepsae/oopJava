import java.util.Scanner;

public class Solution12_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("연산>>");
        double num1=scanner.nextInt();
        String cal=scanner.next();
        double num2=scanner.nextInt();

        double result;

        if (cal.equals("+")){
            result= num1+num2;
            System.out.println(num1+cal+num2+"의 계산 결과는"+result);
        }
        else if (cal.equals("-")){
            result=num1-num2;
            System.out.println(num1+cal+num2+"의 계산 결과는"+result);
        }
        else if (cal.equals("*")){
            result= num1*num2;
            System.out.println(num1+cal+num2+"의 계산 결과는"+result);
        }
        else if (cal.equals("/")){
            if (num2!=0){
                result= num1/num2;
                System.out.println(num1+cal+num2+"의 계산 결과는"+result);
            }
            else
                System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
