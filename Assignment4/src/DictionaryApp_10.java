abstract class PairMap {
    protected String keyArray[]; // key들을 저장하는 배열
    protected String valueArray[]; // value들을 저장하는 배열

    abstract String get(String key); // key 값을 가진 value 리턴. 없으면 null 리턴

    abstract void put(String key, String value); // key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정

    abstract String delete(String key); // key 값을 가진 아이템 (value와 함께) 삭제. 삭제된 value 값 리턴

    abstract int length(); // 현재 저장된 아이템의 개수 리턴
}

class Dictionary extends PairMap {
    int cnt; // 사용되고 있는 배열의 용량을 나타내는 변수

    Dictionary(int capacity) { // Dictionary class의 생성자
        keyArray = new String[capacity];
        valueArray = new String[capacity];
        cnt = 0;
    }

    @Override
    String get(String key) { // key 값을 가진 value 리턴. 없으면 null 리턴
        for (int i = 0; i < keyArray.length; i++) { // 배열의 길이만큼 탐색.
            if (key.equals(keyArray[i])) { // key값이 keyArray[i]값과 같다면 value 값 리턴
                return valueArray[i];
            }
        }
        return null; // 탐색 다하고 나왔는데도 없으면 null 리턴
    }

    @Override
    void put(String key, String value) { // key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
        if (cnt == keyArray.length) { // cnt가 배열의 총길이와 같아지면 배열이 꽉 찼다는 메세지 출력
            System.out.println("배열이 꽉 찼습니다.");
            return;
        }

        for (int i = 0; i < keyArray.length; i++) { // 위의 if문을 안탄다면 for문으로 탐색시작.
            if (key.equals(keyArray[i])) { // key값과 keyArray[i]의 값이 같다면 그 위치의 value값에 value를 넣어주고 value값 리턴한 뒤 메소드 종료
                valueArray[i] = value;
                return;
            }
        }
        keyArray[cnt] = key; // 만약 기존의 key가 없으면 index cnt 위치에 key, value값을 넣어줌. 그후 cnt값 1 증가시킴
        valueArray[cnt] = value;
        cnt++;
    }

    @Override
    String delete(String key) { // key 값을 가진 아이템(value와 함께) 삭제. 삭제된 value 값 리턴
        for (int i = 0; i < keyArray.length; i++) {
            if (key.equals(keyArray[i])) {
                keyArray[i] = null;
                String answer = valueArray[i]; // 삭제된 value 값을 리턴해야하므로 answer에 value값 저장
                valueArray[i] = null;
                cnt--; // cnt 개수 하나 줄여줌
                return answer; // answer(삭제된 value값 리턴)
            }
        }
        return null;
    }

    @Override
    int length() {
        return cnt;
    }
}

public class DictionaryApp_10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태"); // 황기태 아이템 삭제
        System.out.println("황기태의 값은 " + dic.get("황기태")); // 삭제된 아이템 접근
    }
}