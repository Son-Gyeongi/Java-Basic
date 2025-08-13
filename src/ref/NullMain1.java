package ref;

/*
null은 값이 존재하지 않는, 없다는 뜻이다, 참조형에서 사용 가능
src/ref/Data.java 사용
 */
public class NullMain1 {

    public static void main(String[] args) {
        Data data = null; // 참조값이 없다.
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null; // 더이상 참조값을 쓰지 않을때
        System.out.println("3. data = " + data);
    }
}
