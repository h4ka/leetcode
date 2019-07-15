import java.util.Arrays;

public class MinAbsDiff {

    static int minimumAbsoluteDifference(int[] arr) {

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length-1; i++) {
            int n = Math.abs(arr[i]-arr[i+1]);
            if (min > n ) min = n;
        }

        return min;

    }


}
