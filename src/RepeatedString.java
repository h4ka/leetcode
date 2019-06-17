public class RepeatedString {


    static long getNumOfAs(String s) {

        long cnt = 0;

        for (char c : s.toCharArray()) {
            if (c == 'a') ++cnt;
        }
        return cnt;
    }


    static long repeatedString(String s, long n){

        long numOfAs = 0;

        long whole = n / s.length();
        long remainder = n % s.length();

        long aInS = getNumOfAs(s);

        numOfAs += aInS * whole;

        aInS = getNumOfAs(s.substring(0,(int) remainder));

        numOfAs += aInS;

        return numOfAs;
    }

}
