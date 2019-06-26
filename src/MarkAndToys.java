import java.util.Arrays;

public class MarkAndToys {

    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);

        int toys = 0;

        for (int price : prices) {
            k -= price;
            if (k >= 0)
                toys++;
            else
                break;
        }
        return toys;
    }

}
