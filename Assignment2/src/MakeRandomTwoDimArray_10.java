public class MakeRandomTwoDimArray_10 {
    public static void main(String[] args){
        int[][] arr = new int[4][4];
        int count=0; // 0의 개수를 셀 변수 선언

        for(int i=0; i<arr.length; i++){ // 우선 모든 배열에 무작위 값을 넣어준다.
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*10+1); // 1~10 사이의 숫자를 무작위로 넣어줌
            }
        }

        while(count!=6){ // 0의 개수가 6이 아닐시에만 이 while문을 실행한다.
            int random1 = (int) (Math.random() * 3); // 배열 인덱스값인 0~3 사이에서 랜덤값을 뽑아준다.
            int random2 = (int) (Math.random() * 3); // 배열 인덱스값인 0~3 사이에서 랜덤값을 뽑아준다.
            if (arr[random1][random2] != 0) { // while문을 계속해서 실행했을 때, 이미 값이 0인 원소에 접근할 수 있으므로,
                arr[random1][random2] = 0; // 접근한 배열의 값이 0이 아닐 경우에만 0을 할당한 뒤
                count++; // count값을 증가시켜준다. (0의 개수가 6이 될 경우 while문 탈출)
            }
        }

        for(int i=0; i<arr.length; i++){ // 배열값 출력
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
