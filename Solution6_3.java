import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        System.out.println("1~99사이의 정수를 입력하시오");
        Scanner scanner = new Scanner(System.in);

        int num=scanner.nextInt();
        int first= num/10;
        int second= num%10;

        if (first==0){
            if (second%3==0)
                System.out.println("박수짝");
        }
        else if (first>=1) {
            if ((first % 3 == 0) && (second % 3 == 0))
                System.out.println("박수짝짝");
            else if (first % 3 == 0 || second % 3 == 0)
                System.out.println("박수짝");

        }
    }
}
