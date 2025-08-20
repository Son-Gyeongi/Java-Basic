package access.a;

// 접근 제어자 사용 - 클래스 레벨
// 하나의 파일 안에 여러 접근제어자 만들 수 있다.
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

// default == package private
class DefaultClass1 {

}

class DefaultClass2 {

}
