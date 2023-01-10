import java.util.Scanner;
public class Solution16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str[] = {"가위", "바위", "보"};//가위는 0번째, 바위는 1번째, 보는 2번째 배열
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while (true) {
            System.out.print("가위 바위 보!>>");
            String user = scanner.next();
            int cpu = (int) (Math.random() * 3);
            if (user.equals("그만"))
                break;

            if (str[cpu].equals("가위")) {
                if (user.equals("가위")) {
                    System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[cpu] + " 비겼습니다");
                    continue;
                } else if (user.equals("바위")) {
                    System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[cpu] + " 사용자가 이겼습니다.");
                    continue;
                } else {
                    System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[cpu] + " 졌습니다.");
                    continue;
                }
            } else if (str[cpu].equals("바위")) {
                if (user.equals("가위")) {
                    System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[cpu] + " 졌습니다.");
                    continue;
                } else if (user.equals("바위")) {
                    System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[cpu] + " 비겼습니다.");
                    continue;
                } else {
                    System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[cpu] + " 사용자가 이겼습니다.");
                    continue;}}
            else if (str[cpu].equals("보")) {
                if (user.equals("가위")) {
                    System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[cpu] + " 사용자가 이겼습니다.");
                    continue;}
                else if (user.equals("바위")) {
                    System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[cpu] + " 졌습니다.");
                    continue;}
                else {
                    System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[cpu] + " 비겼습니다.");
                    continue;}}
        }
        System.out.print("게임을 종료합니다...");
    }
}
