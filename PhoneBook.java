import java.util.Scanner;

class Phone{
    private String name;
    private String tel;
    public Phone(String name, String tel){
        this.name=name;
        this.tel=tel;
    }
    public String getName(){
        return name;
    }
    public String getTel(){
        return tel;
    }
}
public class PhoneBook{
    Scanner scanner=new Scanner(System.in);
    Phone[] phone;
    int num;
    String name;
    String tel;

    public void getNum() {
        System.out.print("인원수>>");
        num= scanner.nextInt();
        phone=new Phone[num];
    }
    public void getNameTel(){
        for (int i=0;i<num;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            name= scanner.next();
            tel= scanner.next();
            phone[i]=new Phone(name,tel);
        }
        System.out.println("저장되었습니다...");
    }
    public void Find(){
        boolean result=false;
        while (true){
            System.out.print("검색할 이름>>");
            name= scanner.next();
            if (name.equals("그만")) {break;}
            //if (result!=true) System.out.println(name + "이 없습니다.");
            for (int i=0;i<num;i++) {
                if (name.equals(phone[i].getName())) {
                    System.out.println(name + "의 번호는" + phone[i].getTel() + "입니다.");
                    result = true;
                }
                //else result=false;
            }
            if (result!=true) System.out.println(name + "이 없습니다.");
            result=false;
        }
    }
    public static void main(String[] args) {
        PhoneBook phonebook=new PhoneBook();
        phonebook.getNum();
        phonebook.getNameTel();
        phonebook.Find();
    }
}

