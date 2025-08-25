package static2;

/*
정적 메서드를 사용할 때 해당 메서드를 다음과 같이 자주 호출해야 한다면
'static import' 기능을 고려하자.
 */
// import static static2.DecoData.staticCall;
//import static static2.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall(); // 클래스에 있는 메서드 바로 호출

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        System.out.println("4. 외부에서 참조값을 넘겨준다.");
        staticCall(data1);

        // 추가
        System.out.println("5. 정적 메서드를 호출할 때 2가지 방법");
        // 인스턴스를 통한 접근 -권장하지 않는다.
        // 인스턴스에 있는 메서드를 호출하는 것처럼 보인다.
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}
