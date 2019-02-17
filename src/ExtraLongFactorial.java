import java.math.BigInteger;

public class ExtraLongFactorial {

    static String extraLongFactorials(int n) {

        BigInteger factor = BigInteger.valueOf(n);

        for ( n = n-1; n > 1; n--){
            factor = factor.multiply(BigInteger.valueOf(n));
        }

        return String.valueOf(factor);
    }


}
