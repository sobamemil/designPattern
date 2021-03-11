package adapter.pattern.demo;

class Rect {
    public double l;
    public double w;
}

class Triangle {
    public double b; // base
    public double h; // height

    public Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }
}

// Calculator는 사각형의 넓이를 계산해줍니다.
// 입력값으로 사각형 즉, 사각형의 가로 정보와 세로 정보가 필요합니다.
class Calculator {
    Rect rectangle;
    public double getArea(Rect r) {
        rectangle = r;
        return rectangle.l * rectangle.w;
    }
}

// 삼각형의 넓이를 계산해줍니다.
// 이번엔 삼각형의 정보가 필요합니다.
class CalculatorAdapter {
    Calculator calculator;
    Triangle triangle;

    public double getArea(Triangle t) {
        calculator = new Calculator();
        triangle = t;
        Rect r = new Rect();

        // 삼각형의 넓이 = 0.5 * 밑변 * 높이
        r.l = triangle.h;
        r.w = 0.5 * triangle.b;
        return calculator.getArea(r);
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        System.out.println("***Adapter Pattern Demo***");
        CalculatorAdapter cal = new CalculatorAdapter();
        Triangle t = new Triangle(20, 10);
        System.out.println("\nAdapter Pattern Example\n");
        System.out.println(" Area of Triangle is :" + cal.getArea(t));
    }
}
