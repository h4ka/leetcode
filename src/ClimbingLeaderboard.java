public class ClimbingLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int games = alice.length;
        int[] places = new int[games];


        int idxS = 0;
        int idxA = alice.length - 1;

        int currentRank = 1;
        int currentScore = scores[idxS];
        int lastScore = scores[idxS];


        while(true){

            if (idxA < 0){
                break;
            }

            if (idxS > scores.length-1){
                currentScore = 0;
            } else {
                currentScore = scores[idxS];
            }

            if (lastScore > currentScore){
                currentRank++;
            }

            if (alice[idxA] >= currentScore){
                places[idxA] = currentRank;
                idxA--;
            } else {
                idxS++;
            }
            lastScore = currentScore;

        }


        return places;

    }

}
