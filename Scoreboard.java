
import java.util.Map;

class Scoreboard {
    public class Main {
        public static void main(String[] args) {
            Scoreboard scoreboard = new Scoreboard();
            Map<String, Integer> scores = Map.of("Alice", 80, "Bob", 90, "Charlie", 85);
            System.out.println("Top Player: " + scoreboard.findTopPlayer(scores)); // Output: Bob
        }
    }


    public static String findTopPlayer(Map<String, Integer> scores) {
        if (scores == null || scores.isEmpty()) {
            return null;
        }

        String topPlayer = null;
        int maxScore = -1;
        for (Map.Entry<String,Integer> newmap :scores.entrySet()){
            String playername = newmap.getKey();
            Integer Score = newmap.getValue();
            if (Score > maxScore){
                maxScore = Score;
                topPlayer = playername;

            }
        }


        return topPlayer; 
    }
}