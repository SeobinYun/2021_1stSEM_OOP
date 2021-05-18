package num8;

import java.util.Scanner; // Scanner 사용

public class PhoneBook_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int peopleCount = scanner.nextInt(); // 인원수 입력받음

        Phone[] infoArray = new Phone[peopleCount]; // 입력받은 인원수만큼 Phone[] 배열 객체 생성
        for(int i=0; i<peopleCount; i++){ // 입력받은 인원수만큼 이름, 연락처 입력받기
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String nameInput = scanner.next();
            String telInput = scanner.next();
            infoArray[i] = new Phone(nameInput, telInput); // 생성자로 넘겨줌
        }
        System.out.println("저장되었습니다...");

        while(true){
            System.out.print("검색할 이름>>");
            String findInfo = scanner.next();
            if(findInfo.equals("그만")){ // 입력된 findInfo가 "그만"이라는 문자열이면 그만함
                break;
            }
            else{
                for(int i=0; i<infoArray.length; i++){ // infoArray 배열의 길이만큼 for문을 돌려 정보가 있는지 탐색
                    if(infoArray[i].getName().equals(findInfo)){ // 있으면 sout으로 출력
                        System.out.println(infoArray[i].getName() + "의 번호는 "+infoArray[i].getTel()+" 입니다.");
                        break;
                    }
                    else if(i==infoArray.length-1){ // 마지막까지 탐색했는데 없으면 없다고 출력
                        System.out.println(findInfo + "이 없습니다.");
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
