package NHN.자바클래식.코딩테스트.insub2004_240624.example.exam6;

public class Rectangle extends Shape implements Shape2D {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.print(getArea() + " ");
    }
}
