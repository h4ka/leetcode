import java.util.Comparator;

class Checker implements Comparator<Checker.Player> {
    // complete this method
    public int compare(Player a, Player b) {

        if (a.score > b.score) return -1;
        else if (a.score < b.score) return 1;
        else{
            char[] aname = a.name.toCharArray();
            char[] bname = b.name.toCharArray();

            int n = aname.length > bname.length ? bname.length : aname.length;

            for (int i = 0; i < n; i++) {
                if (aname[i] > bname[i]) return 1;
                else if (aname[i] < bname[i]) return -1;
            }

            return Integer.compare(aname.length, bname.length);
        }
    }


    class Player{
        String name;
        int score;
    }
}

