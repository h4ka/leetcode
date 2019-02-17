public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {

        int numOfCandles = 0;
        int maxCandle = 0;

        for (int e : ar){
            if (e > maxCandle) {
                maxCandle = e;
                numOfCandles = 1;
            } else if(e == maxCandle) {
                numOfCandles++;
            }
        }

        return numOfCandles;


    }


}
