package NHN.자바클래식.코딩테스트.caboooom_240624.exam.src.example.ex6;

public class Box extends Shape implements Shape3D {

    private int width;
    private int height;
    private int depth;
    private double volume;

    public Box(int width, int height, int depth) {
        shape = this;
        this.width = width;
        this.height = height;
        this.depth = depth;
        build();
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

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public void build() {
        this.volume = width * height * depth;
    }
}
