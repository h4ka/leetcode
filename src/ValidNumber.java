public class ValidNumber {

    public boolean isNumber(String s) {

        boolean result = false;

        s = s.trim();

        String[] tokens = s.split("e");

        String digitString;
        String expString;

        if (tokens.length == 2) {
            digitString = tokens[0];
            expString = tokens[1];
        }
        else if (tokens.length == 1){
            if (s.startsWith("e") || s.endsWith("e")){
                return false;
            }
            digitString = tokens[0];
            expString = null;
        } else {
            return false;
        }

        return (validateDigit(digitString) && validateExp(expString));
    }

    private boolean validateExp(String expString) {



    }

    private boolean validateDigit(String digitString) {

    }

}
