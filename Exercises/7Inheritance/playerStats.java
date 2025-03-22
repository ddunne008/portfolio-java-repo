public class PlayerStats {

    protected String player;
    protected String team;
    protected int score;

    public Stats(String player, String team) {

        player = this.player;
        team = this.team;
        score = 0;

    }

    public footballCalc() {

    }
    public String getPlayer() {
        return player;

    }
    public int getScore() {

        return score;

    }

    public String toString () {

        String result = "Player : " + player + "\nTeam : " + team + "\nScore : " + score;
        return result;

    }
}
