import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 입력>>");

        double centerx1=scanner.nextDouble();
        double centery1=scanner.nextDouble();
        double radius1=scanner.nextDouble();

        System.out.print("두번째 원의 중심과 반지름 입력>>");

        double centerx2=scanner.nextDouble();
        double centery2=scanner.nextDouble();
        double radius2=scanner.nextDouble();


        double length= Math.pow(centerx1-centerx2,centerx1-centerx2)+Math.pow(centery1-centery2,centery1-centery2);

        if (Math.sqrt(length)<=(radius1+radius2))
            System.out.println("두 원은 서로 겹친다.");
        else
            System.out.println("두 원은 서로 겹치지 않는다.");


   }
}
