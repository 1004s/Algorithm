package NHN.자바클래식.코딩테스트.caboooom_240624.exam.src.example.ex6;

import java.util.Arrays;

public class World {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        // 6-1 Circle을 구현하라.(5)
        Circle circle = new Circle(3);
        System.out.println(circle + "의 넓이는 " + circle.getArea() + " 입니다.");

        // 6-2 Box을 구현하라.(5)
        Box box = new Box(7, 8, 9);
        System.out.println(box + "의 부피는 " + box.getVolume() + " 입니다.");

        shapes[0] = circle;
        shapes[1] = new Rectangle(4,5);
        shapes[2] = new Ball(6);
        shapes[3] = box;

        // 6-3 도형 종류를 출력하라(10)
        System.out.println("Shapes : " + Arrays.toString(shapes));

        // 6-4 2차원 도형만 출력하라(20)
        System.out.print("2차원 도형은 ");
        for (Shape shape : shapes) {
            if(shape instanceof Shape2D) {
                System.out.print(shape + " ");
            }
        }
        System.out.print("이며, 넓이는 ");
        for (Shape shape : shapes) {
            if(shape instanceof Shape2D) {
                System.out.print(((Shape2D) shape).getArea() + " ");
            }
        }
        System.out.println("입니다.");

        // 6-5 3차원 도형만 출력하라(30)
        // 주석 처리된 부분에만 코드를 추가한다.
        // Java Stream을 이용해 구현한다.
        Object[] shape3ds = Arrays.stream(shapes)
                .filter(shape -> shape instanceof Shape3D)
                .toArray();

        System.out.println("3차원 도형은 " + Arrays.toString(shape3ds) + " 이며, " +
                "부피는 " + Arrays.toString(Arrays.stream(shape3ds).map(s -> ((Shape3D)s).getVolume()).toArray()) + "입니다.");
    }
}
