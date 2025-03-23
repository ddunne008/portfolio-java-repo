public class PlayerStats {

    protected String player;
    protected String team;
    protected int score;
    int totalPlayerScore;
    String typeOfSport;


    public PlayerStats(String player, String team, int score, String typeOfSport) {

        this.player = player;
        this.team = team;
        this.score = 0;
        this.typeOfSport = typeOfSport;


    }

    public String getPlayerStats(String player, String team, String score, String typeOfSport) {
        return player + "\t" + team + "\t" + score + "\t" + typeOfSport;
    }


    public String toString () {

        String result = "Player : " + player + "\nTeam : " + team + "\nScore : " + score;
        return result;

    }
}
