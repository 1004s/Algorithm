package NHN.자바클래식.코딩테스트.insub2004_240624.example.exam1;

import java.util.Arrays;
import java.util.Objects;

public class Exam1 {

    static void arraycopy(int[] src, int srcPos, int[] dest, int destPos, int length) {

        if (Objects.isNull(src) || Objects.isNull(dest)) {
            throw new NullPointerException();
        }

        if (!src.getClass().equals(dest.getClass())) {
            throw new ArrayStoreException();
        }

        if ((srcPos + length > src.length) || (destPos + length) > dest.length || srcPos < 0 || destPos < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (srcPos >= destPos) {
            for ( int i = 0; i < length; i++ ) {
                dest[destPos + i] = src[srcPos + i];
            }
        } else {
            for ( int i = 1; i <= length; i++) {
                dest[destPos + length - i] = src[srcPos + length - i];
            }
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
