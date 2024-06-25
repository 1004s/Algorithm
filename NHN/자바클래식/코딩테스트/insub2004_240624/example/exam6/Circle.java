package NHN.자바클래식.코딩테스트.insub2004_240624.example.exam6;

public class Circle extends Shape implements Shape2D {

    private final double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.print(getArea() + " ");
    }
}
