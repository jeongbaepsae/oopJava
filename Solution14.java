import java.util.Scanner;
public class Solution14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] course={"Java","C++","HTML5","컴퓨터구조","안드로이드"};
        int[] score={95,88,76,62,55};
        while (true) {
            System.out.print("과목이름>>");
            String name = scanner.next();
            if (name.equals("그만"))
                break;
            int i;
            for (i=0;i<score.length;i++){
                if(course[i].equals(name)){
                    System.out.println(name+"의 점수는 "+score[i]);
                    break;
                }
            }
            if (i==score.length)
                System.out.println("없는 과목입니다.");
        }

    }
}
