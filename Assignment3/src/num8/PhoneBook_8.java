package num8;

import java.util.Scanner;

public class PhoneBook_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int peopleCount = scanner.nextInt();
        Phone[] infoArray = new Phone[peopleCount];
        for(int i=0; i<peopleCount; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String nameInput = scanner.next();
            String telInput = scanner.next();
            infoArray[i] = new Phone(nameInput, telInput);
        }
        System.out.println("저장되었습니다...");

        while(true){
            System.out.print("검색할 이름>>");
            String findInfo = scanner.next();
            if(findInfo.equals("그만")){
                break;
            }
            else{
                for(int i=0; i<infoArray.length; i++){
                    if(infoArray[i].getName().equals(findInfo)){
                        System.out.println(infoArray[i].getName() + "의 번호는 "+infoArray[i].getTel()+" 입니다.");
                        break;
                    }
                    else if(i==infoArray.length-1){
                        System.out.println(infoArray[i].getName() + "이 없습니다.");
                    }
                }
            }
        }
    }
}

class Phone{
    private String name;
    private String tel;

    Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
    public String getName(){
        return name;
    }
    public String getTel(){
        return tel;
    }
}
