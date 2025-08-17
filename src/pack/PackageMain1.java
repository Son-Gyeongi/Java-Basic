package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지
        pack.a.User user = new pack.a.User(); // 다른 패키지에 있다. 전체 경로 포함
    }
}
