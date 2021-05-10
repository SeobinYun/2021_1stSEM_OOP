import java.util.Scanner;
public class AlphabetPrint_4 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String smallLetter = scanner.next(); // 우선 String형으로 입력받음
        if(smallLetter.charAt(0)>='a' && smallLetter.charAt(0)<='z') {
            // 소문자로 범위를 제한해주고, smallLetter가 String형이기 때문에 charAt()을 이용해 원하는 값을 char형으로 접근해줌
            for (char c1 = smallLetter.charAt(0); c1 >= 'a'; c1--) { // 한문자씩 줄여줌
                for (char c2 = 'a'; c2 <= c1; c2++) { // 처음 출력값을 'a'로 설정해주고 입력받은 값까지 출력, 출력을 끝냈으면 위의 for문을 통해 출력 길이를 조절해줌
                    System.out.print(c2);
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
