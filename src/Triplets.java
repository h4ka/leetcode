import java.util.Arrays;
import java.util.List;

public class Triplets {

    static List<Integer> compare(List<Integer> a, List<Integer> b) {

        List<Integer> scores = Arrays.asList(0,0);

        for(int i = 0; i < 3; i++){
            Integer n = a.get(i) - b.get(i);
            if  (n > 0) {scores.set(0, scores.get(0) + 1);}
            else if ( n < 0) {scores.set(1, scores.get(1) + 1);}
        }

        return scores;

    }


}
