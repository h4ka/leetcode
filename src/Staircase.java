
public class Staircase {


    static void staircase(int n) {

        for (int i = 1; i <= n; i++){
            int spaces = n - i;
            for (int j = 1; j <= n; j++){
                if (j <= spaces) System.out.print(' ');
                else System.out.print('#');
            }
            System.out.print('\n');
        }

    }

}
