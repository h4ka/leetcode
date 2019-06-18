import java.util.Arrays;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {

        if (d % a.length == 0) return a;
        if (d > a.length) d %= a.length;

        int[] append = Arrays.copyOf(a, d);
        int[] prepend = Arrays.copyOfRange(a, d, a.length);

        int[] res = Arrays.copyOf(prepend, prepend.length + append.length);
        System.arraycopy(append, 0, res, prepend.length, append.length);

        return res;

    }



}
