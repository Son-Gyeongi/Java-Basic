package pack;

import pack.a.User;

// 클래스 구분 - 패키지를 포함한 전체 경로로 구분
public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
