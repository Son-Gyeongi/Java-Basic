package static1;

// 특정 클래스를 통해서 생성된 객체의 수를 세는 단순한 프로그램
public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count=" + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count=" + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count=" + data3.count);
    }
}
