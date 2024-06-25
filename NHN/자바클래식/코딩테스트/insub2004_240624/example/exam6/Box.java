package NHN.자바클래식.코딩테스트.insub2004_240624.example.exam6;

public class Box extends Shape implements Shape3D {

    private final double width;
    private final double height;
    private final double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public void build() {
        System.out.print(getVolume());
    }
}
