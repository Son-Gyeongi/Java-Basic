package access.a;

// 필드, 메서드 레벨의 접근 제어자
public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateField);
    }

    // 내부 호출은 자기 자신에게 접근하는 것
    public void innerAccess() {
        System.out.println("내부 호출");
        // 메서드 내부에서 멤버변수, 메서드에 접근할 수 있는지 확인 - 다 가능
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
