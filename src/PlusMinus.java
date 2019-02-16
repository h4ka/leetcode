public class PlusMinus {



    static void plusMinus(int[] arr) {

        double positive = 0;
        double negative = 0;
        double zero = 0;

        for (int e : arr){
            if (e > 0) positive++;
            else if (e < 0) negative++;
            else zero++;
        }

        System.out.printf("%.6f\n", (positive / arr.length));
        System.out.printf("%.6f\n", (negative / arr.length));
        System.out.printf("%.6f\n", (zero / arr.length));

    }

    public static void main(String[] args) {
        int[] arr = {-4 ,3 ,-9 ,0 ,4 ,1};
        PlusMinus.plusMinus(arr);
    }


}
