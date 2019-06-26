public class BubbleSort {

     static int countSwaps(int[] a){

         int cnt = 0;

         while(true){
             int chkr = cnt;
             for (int i = 0; i < a.length-1; i++) {
                 if (a[i] > a[i+1]){
                     int t = a[i];
                     a[i] = a[i+1];
                     a[i+1] = t;
                     ++cnt;
                 }
             }
             if(chkr == cnt) break;

         }

         System.out.println("Array is sorted in " + cnt + " swaps.");
         System.out.println("First Element: " + a[0]);
         System.out.println("Last Element: " + a[a.length-1]);


         return cnt;
     }

}
