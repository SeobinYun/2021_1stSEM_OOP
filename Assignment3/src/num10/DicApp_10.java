package num10;

import java.util.Scanner; // Scanner 사용 

public class DicApp_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true) { // true로 계속 실행
            System.out.print("한글 단어?");
            String wordInput = scanner.next(); // 입력받음
            if(wordInput.equals("그만")){ // wordInput이 "그만"이라는 문자열이면 그만함
                break;
            }
            else{
                String eng = Dictionary.kor2Eng(wordInput); // Dictionary class의 kor2Eng 메소드 실행해서 리턴값을 받는 eng 선언
                if(eng.equals("-1")){ // kor2Eng의 리턴값이 "-1"이라는 문자열이면 없다는 문구를 출력
                    System.out.println(wordInput + "는 저의 사전에 없습니다.");
                }
                else{ // 있으면 결과값 출력
                    System.out.println(wordInput + "은 " + eng);
                }
            }
        }
    }
}

class Dictionary{
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word) {
        for (int i = 0; i < kor.length; i++) { // kor 배열의 길이까지 탐색
            if (kor[i].equals(word)) { // kor[i]의 문자열과 word이 같다면 eng[i]를 리턴함
                return eng[i];
            }
        }
        return "-1";
    }
}
