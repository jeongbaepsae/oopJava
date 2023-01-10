import java.util.Scanner;
class Seat{
    private String[] seat;
    public Seat(){ //좌석 생성
        seat = new String[10];
        for(int i=0; i<seat.length; i++) {
            seat[i] = "---";
        }
    }
    public void state(){ //현재상태확인
        for (String s : seat) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public void setSeat(String name, int num){ //예약받은 좌석에 이름넣기
        seat[num-1]=name;
    }
    public boolean reReserve(String name){ //취소한좌석에서 이름빼기
        for(int i=0; i<seat.length; i++) {
            if(name.equals(seat[i])) {
                seat[i] = "---";
                return true;
            }
        }
        return false;
    }
}

class Reservation{
    Scanner scanner=new Scanner(System.in);
    private Seat[] s;
    private String[] seatGrade={"S","A","B"};
    public Reservation(){
        s= new Seat[3];
        for (int i=0;i<s.length;i++){
            s[i]=new Seat();
        }
    }
    public void Reserve(){
        System.out.print("좌석구분 S(1), A(2), B(3)>> ");
        int grade=scanner.nextInt();
        System.out.println(seatGrade[grade-1]+">>");
        s[grade-1].state();
        System.out.print("이름>> ");
        String name=scanner.next();
        System.out.print("번호>> ");
        int num= scanner.nextInt();
        s[grade-1].setSeat(name,num);
    }
    public void Check(){
        for (int i=0;i<s.length;i++){
            System.out.println(seatGrade[i]+">>");
            s[i].state();
        }
        System.out.println("조회를 완료하였습니다.");
    }
    public void Cancel(){
        System.out.print("좌석 S:1, A:2, B:3>> ");
        int grade=scanner.nextInt();
        System.out.print(seatGrade[grade-1]+">> ");
        s[grade-1].state();
        System.out.print("이름>> ");
        String name = scanner.next();
        boolean result=s[grade-1].reReserve(name);
        if (result==true)
            System.out.println("취소를 완료하였습니다.");
        else
            System.out.println("존재하지 않는 정보입니다.");
    }
    public void System(){
        int menu;
        while (true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
            menu= scanner.nextInt();
            switch(menu) {
                case 1:
                    Reserve();
                    break;
                case 2:
                    Check();
                    break;
                case 3:
                    Cancel();
                    break;
                case 4:
                    return;
            }
        }
    }
}
public class TicketingSystem {
    public static void main(String[] args) {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Reservation reservation=new Reservation();
        reservation.System();
    }
}
