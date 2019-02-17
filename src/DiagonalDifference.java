public class DiagonalDifference {

    static int diagonalDifference(int[][] arr) {

        int left2rightSum = 0;
        int right2leftSum = 0;
        for(int i = 0; i < arr.length; i++){
           left2rightSum += arr[i][i];
           right2leftSum += arr[i][(arr.length-1)-i];
        }
        return Math.abs(left2rightSum - right2leftSum);

    }

}
