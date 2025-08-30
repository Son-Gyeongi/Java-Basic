package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        // this 자기자신, super 내 부모
        System.out.println("this.value = " + this.value); // this 생략 가능
        System.out.println("super.value = " + super.value);

        this.hello(); // this 생략 가능
        super.hello();
    }
}
