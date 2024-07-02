package NHN.자바클래식.코딩테스트.caboooom_240624.exam.src.example.ex6;

public class Ball extends Shape implements Shape3D {

    private int radius;
    private double volume;

    public Ball(int radius) {
        shape = this;
        this.radius = radius;
        build();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public void build() {
        this.volume = 4/3 * Math.PI * Math.pow(radius, 3);
    }
}
