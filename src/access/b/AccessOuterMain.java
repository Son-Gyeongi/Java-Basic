package access.b;

import access.a.AccessData;

// 필드, 메서드 레벨의 접근 제어자
public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능 - 어디서나 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지 default 호출 불가
        // data.defaultField = 2;
        // data.defaultMethod();

        // private 호출 불가
        // data.privateField = 3;
        // data.privateMethod();

        // innerAccess() 는 public 으로 외부에서 호출가능하다.
        data.innerAccess();
    }
}
