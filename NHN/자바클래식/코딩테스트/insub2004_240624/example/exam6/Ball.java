package NHN.자바클래식.코딩테스트.insub2004_240624.example.exam6;

public class Ball extends Shape implements Shape3D {

    private final double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 3);
    }

    @Override
    public void build() {
        System.out.print(getVolume());
    }
}
