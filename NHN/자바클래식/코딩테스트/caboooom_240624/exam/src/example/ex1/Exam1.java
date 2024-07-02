package NHN.자바클래식.코딩테스트.caboooom_240624.exam.src.example.ex1;

import java.util.Arrays;

public class Exam1 {

    static void arraycopy(int[] src, int srcPos, int[] dest, int destPos, int length) {
        if(srcPos > src.length || srcPos + length - 1 > src.length || destPos > dest.length || destPos + length - 1 > src.length) {
            throw new IndexOutOfBoundsException();
        }

        if(src == dest && srcPos < destPos) {
            for(int i = srcPos + length - 1, j = destPos + length - 1; i >= srcPos; i--, j--) {
                dest[j] = src[i];
            }
            return;
        }

        for(int i = srcPos, j = destPos; i < srcPos + length; i++, j++) {
            dest[j] = src[i];
        }
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] b = a.clone();
        int[] c = new int[a.length];
        int[] d = new int[a.length];

        // 1-1 서로 다른 배열로 복사(5)
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        System.out.println("c : " + Arrays.toString(c));
        System.out.println("d : " + Arrays.toString(d));
        System.out.println("System.arraycopy(a, 1, c, 3, 5)");
        arraycopy(a, 1, c, 3, 5);
        System.out.println("c : " + Arrays.toString(c));
        System.out.println("arraycopy(b, 1, d, 3, 5)");
        System.arraycopy(b, 1, d, 3, 5);
        System.out.println("d : " + Arrays.toString(d));
        System.out.println("Arrays.equals(c, d) = " + Arrays.equals(c, d));

        // 1-2 같은 배열로 복사(5)
        System.out.println("System.arraycopy(a, 1, a, 3, 5)");
        System.arraycopy(a, 1, a, 3, 5);
        System.out.println("arraycopy(b, 1, b, 3, 5)");
        arraycopy(b, 1, b, 3, 5);
        System.out.println("Arrays.equals(a, b) = " + Arrays.equals(a, b));
        System.out.println("System.arraycopy(a, 4, a, 2, 5)");
        System.arraycopy(a, 4, a, 2, 5);
        System.out.println("arraycopy(b, 4, b, 2, 5)");
        arraycopy(b, 4, b, 2, 5);
        System.out.println("Arrays.equals(a, b) = " + Arrays.equals(a, b));
    }

}
