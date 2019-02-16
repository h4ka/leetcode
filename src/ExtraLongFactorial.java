import java.math.BigInteger;

public class ExtraLongFactorial {

    static String extraLongFactorials(int n) {

        BigInteger factor = BigInteger.valueOf(n);

        for (int i = n-1; i > 1; i--){
            factor = factor.multiply(BigInteger.valueOf(i));
        }

        return String.valueOf(factor);
    }


}
