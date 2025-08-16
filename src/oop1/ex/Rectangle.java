package oop1.ex;

public class Rectangle {
    // 속성
    int width; // 가로
    int height; // 세로

    // 기능
    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
