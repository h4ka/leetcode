/***

 Sample Input:

 1 1 1 0 0 0
 0 1 0 0 0 0
 1 1 1 0 0 0
 0 0 2 4 4 0
 0 0 0 2 0 0
 0 0 1 2 4 0

 Sample Output: 19

 Explanation:

 2 4 4
   2    - this is the hourglass with largest sum in the arr
 1 2 4

 ***/


class HourGlassSum {


    static int getSum(int[][] arr){

        int max = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length-1; i++){

            for (int j = 1; j < arr[i].length-1; j++){

                int sum = 0;

                // summing upper part
                sum += arr[i-1][j-1];
                sum += arr[i-1][j];
                sum += arr[i-1][j+1];
                // summing middle part
                sum += arr[i][j];
                // summing lower part
                sum += arr[i+1][j-1];
                sum += arr[i+1][j];
                sum += arr[i+1][j+1];

                if (sum > max) max = sum;

            }
        }

        return max;

    }

}
