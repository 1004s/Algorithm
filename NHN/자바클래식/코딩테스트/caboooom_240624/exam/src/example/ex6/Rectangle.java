package NHN.자바클래식.코딩테스트.caboooom_240624.exam.src.example.ex6;

public class Rectangle extends Shape implements Shape2D {

    private int width;
    private int height;
    private double area;

    public Rectangle(int width, int height) {
        shape = this;
        this.width = width;
        this.height = height;
        draw();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public void draw() {
        this.area = width * height;
    }
}
