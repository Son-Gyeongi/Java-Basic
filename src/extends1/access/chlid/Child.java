package extends1.access.chlid;

import extends1.access.parent.Parent;

public class Child extends Parent {

    // 부모의 기능을 가져올 수 있는 범위
    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속 관계 or 같은 패키지
        // defaultValue = 1; // 다른 패키지 접근 불가, 컴파일 오류
        // privateValue = 1; // 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); // 상속 관계 or 같은 패키지
        // defaultMethod(); // 다른 패키지 접근 불가, 컴파일 오류
        // privateMethod(); // 접근 불가, 컴파일 오류

        printParent();
    }
}
