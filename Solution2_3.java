import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args){
        System.out.println("2자리수 정수 입력(10~99)");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int first= num/10;
        int second=num%10;

        if (first==second)
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        else
            System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
    }
}
