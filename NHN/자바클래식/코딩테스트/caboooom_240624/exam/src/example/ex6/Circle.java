package NHN.자바클래식.코딩테스트.caboooom_240624.exam.src.example.ex6;

public class Circle extends Shape implements Shape2D {

    private int radius;
    private double area;

    public Circle(int radius) {
        shape = this;
        this.radius = radius;
        draw();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public void draw() {
        this.area = Math.PI * Math.pow(radius, 2);
    }
}
