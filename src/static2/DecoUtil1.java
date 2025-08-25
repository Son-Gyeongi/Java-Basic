package static2;

public class DecoUtil1 {

    // 문자열 꾸미는 기능 제공
    // 사용하는 인스턴스 변수도 없고 단순히 기능만 제공
    public String deco(String str) {
        String result = "*" + str + "*";
        return result;
        // return "*" + str + "*";
    }
}
