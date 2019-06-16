/***
 *
 * John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of
 * integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 *
 * For example, there are n = 7 socks with colors ar = [1,2,1,2,1,3,2]. There is one pair of color 1 and one of color 2.
 * There are three odd socks left, one of each color. The number of pairs is 2.
 *
 * Function Description
 *
 * Complete the sockMerchant function.
 * It must return an integer representing the number of matching pairs of socks that are available.
 *
 * sockMerchant has the following parameter(s):
 *
 * n: the number of socks in the pile
 * ar: the colors of each sock
 * Input Format
 *
 * The first line contains an integer , the number of socks represented in .
 * The second line contains  space-separated integers describing the colors  of the socks in the pile.
 *
 *
 * Sample Input
 * 9
 * 10 20 20 10 10 30 50 10 20
 *
 * Sample Output
 * 3
 *
 */

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;


public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : ar) {
            map.merge(i, 1, Integer::sum);
        }

        AtomicReference<Integer> sum = new AtomicReference<>(0);

//        for (Integer v : map.values()) {
//            Integer pairs = v / 2;
//            sum.updateAndGet(v1 -> v1 + pairs);
//        }

        map.forEach((k,v) -> {
            Integer pairs = v / 2;
            sum.updateAndGet(v1 -> v1 + pairs);
        });

        return sum.get();

    }


}
