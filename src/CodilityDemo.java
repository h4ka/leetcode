import java.util.Iterator;
import java.util.TreeSet;

public class CodilityDemo {

    static int solution(int[] A) {

        if (A.length == 0) return 1;

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < A.length; i++){
            if (A[i] > 0) set.add(A[i]);
        }

        Iterator<Integer> itr = set.iterator();

        int prev = 0;

        while (itr.hasNext()){

            int cur = itr.next();

            if (cur > prev + 1){
                return prev + 1;
            }
            prev = cur;

        }

        return ++prev;

    }



}
