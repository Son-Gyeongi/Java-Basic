package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        // ctrl + alt + n => 인라인 변수
        // 변경 부위 최소화
        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Duck()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    // 동물을 추가해도 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
