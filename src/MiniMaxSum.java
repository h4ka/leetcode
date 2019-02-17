public class MiniMaxSum {


    static void miniMaxSum(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        long sum = 0;

        for(int el : arr){
            if (el > max) max = el;
            else if (el < min) min = el;
            sum+=el;
        }

        System.out.printf("%d %d", sum-max, sum-min);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        miniMaxSum(a);
    }

}
