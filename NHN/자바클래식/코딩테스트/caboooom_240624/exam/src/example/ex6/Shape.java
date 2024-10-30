package NHN.자바클래식.코딩테스트.caboooom_240624.exam.src.example.ex6;

public class Shape {

    protected Object shape;

    @Override
    public String toString() {
        return shape.getClass().getSimpleName();
    }
}
