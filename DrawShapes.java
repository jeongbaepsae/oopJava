interface Shape{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle implements Shape{
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("반지름이 " + this.radius + "인 원입니다.");
    }
    public double getArea() {
        return PI * radius * radius;
    }
}

class Oval implements Shape{
    private int a, b;
    public Oval(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void draw() {
        System.out.println(this.a+"x"+this.b+"에 내접하는 타원입니다.");
    }
    public double getArea() {
        return PI * a * b;
    }
}

class Rect implements Shape{
    private int a, b;
    public Rect(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void draw() {
        System.out.println(this.a+"x"+this.b+"크기의 사각형입니다.");
    }
    public double getArea() {
        return a*b;
    }
}

public class DrawShapes {
    public static void main(String[] args) {
        Shape[] list = new Shape[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
        list[0] = new Circle(10); // 반지름이 10인 원 객체
        list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
        list[2] = new Rect(10, 40); // 10x40 크기의 사각형
        for(int i=0; i<list.length; i++) list[i].redraw();
        for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
    }
}
