public class RecursiveDigitSum {

    static int superDigit(String n, int k) {


        char[] charDigits = n.toCharArray();

        if (charDigits.length == 1)
            return charDigits[0] - 48;

        int sum = 0;

        for (char c : charDigits){
            sum += c - 48;
        }

        sum = sum * k;

        return superDigit(String.valueOf(sum), 1);
    }

}
