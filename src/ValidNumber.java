public class ValidNumber {

    public boolean isNumber(String s) {

        boolean result = false;

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
        } else {
            return false;
        }



        return result;
    }

}
