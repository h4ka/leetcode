public class ValidNumber {

    public boolean isNumber(String s) {

        s = s.trim();

        if (s.startsWith("e") || s.endsWith("e")){
            return false;
        }

        String[] tokens = s.split("e");

        String digitString;
        String expString;

        if (tokens.length == 2) {
            digitString = tokens[0];
            expString = tokens[1];
        }
        else if (tokens.length == 1){
            digitString = tokens[0];
            expString = null;
        } else {
            return false;
        }

        return (validateDigit(digitString) && validateExp(expString));
    }

    private boolean validateExp(String expString) {

        if (expString == null) return true;

        char[] chars = expString.toCharArray();

        int idx = 0;

        for (char c : chars) {

            if (idx == 0){
                if (c == '+' || c == '-') {
                    idx++;
                    continue;
                }
            }

            if (c < 48 || c > 57) {
                return false;
            }

            idx++;
        }

        return true;

    }

    private boolean validateDigit(String digitString) {


        char[] chars = digitString.toCharArray();

        boolean plusMinus = false;
        boolean floating = false;
        boolean zero = false;

        int idx = 0;

        for (char c : chars) {

            if (idx == 0){
                if (c == '+' || c == '-') {
                    plusMinus = true;
                    idx++;
                    continue;
                }
                else if (c == '0') {
                    zero = true;
                    idx++;
                    continue;
                } else if (c < 49 || c > 57)
                    return false;

            }
            else if (idx == 1) {

                if (plusMinus) {
                    if (c == '0') {
                        zero = true;
                        idx++;
                        continue;
                    }
                }
                else if ( zero ){
                    if (c != '.') {
                        return false;
                    } else {
                        floating = true;
                        idx++;
                        continue;
                    }
                }

            }
            else if (idx == 2) {
                if (plusMinus && zero) {
                    if (c == '.') {
                        floating = true;
                        idx++;
                        continue;
                    } else {
                        return false;
                    }
                }
            }

            if (c < 48 || c > 57) {
                if (c == '.'){
                    if (floating) {
                        return false;
                    }
                    else {
                        floating = true;
                    }
                } else {
                    return false;
                }
            }
            idx++;
        }

        return true;
    }

}
