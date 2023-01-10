import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        System.out.println("정수 3개를 입력하시오");
        Scanner scanner = new Scanner(System.in);

        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();

        if (num1<num2 && num1>num3 || num1<num3 && num1>num2)
            System.out.println("중간 값은 "+num1);
        else if (num2<num1 && num2>num3 || num2<num3 && num2>num1)
            System.out.println("중간 값은 "+ num2);
        else
            System.out.println("중간 값은 "+num3);
    }
}
