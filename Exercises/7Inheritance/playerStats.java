public class PlayerStats {

    protected String player;
    protected String team;
    protected int score;
    int totalPlayerScore;


    public PlayerStats(String player, String team) {

        this.player = player;
        this.team = team;
        this.score = 0;

    }

    public String getPlayer() {
        return this.player;

    }

    public String getTeam() {
        return this.team;
    }


    public int getScore() {

        return this.score;

    }

    public String toString () {

        String result = "Player : " + player + "\nTeam : " + team + "\nScore : " + score;
        return result;

    }
}
