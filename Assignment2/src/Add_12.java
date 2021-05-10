public class Add_12 {
    public static void main(String[] args){
        int sum=0;
        int[] sumArray=new int[args.length]; // int형으로 변환한 값들을 저장할 배열 선언

        for (int i = 0; i < args.length; i++) { // 명령행에 입력된 인자 개수만큼 반복
            try {
                int n = Integer.parseInt(args[i]); // 문자열을 int형으로 바꾸는 걸 시도
                sumArray[i]=n; // 변환된 int형 값들을 배열에 저장해줌
            }
            catch(NumberFormatException e) { // int형 변환 실패시 for문을 continue하도록 함
                continue;
            }
        }

        for(int i=0; i<sumArray.length; i++){
            sum+=sumArray[i]; // int형값만 저장된 배열의 값들을 for문을 통해 sum에 누적시켜줌.
        }
        System.out.println(sum);
    }
}
