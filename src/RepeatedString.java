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
        numOfAs += getNumOfAs(s) * (n / s.length());
        numOfAs += getNumOfAs(s.substring(0,(int)(n % s.length())));

        return numOfAs;
    }

}
