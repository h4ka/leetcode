


public class BalancedBrackets {

    static String isBalanced(String s){

        if (s.length() % 2 != 0) return "NO";

        for (int i = 0, j = s.length()-1; i < s.length()/2; i++, j--) {
            switch(s.charAt(i)){
                case '(': if (s.charAt(j) == ')') break;
                case '{': if (s.charAt(j) == '}') break;
                case '[': if (s.charAt(j) == ']') break;
                default: return "NO";
            }
        }
        return "YES";
    }

}
