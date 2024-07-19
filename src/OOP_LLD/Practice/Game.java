package OOP_LLD.Practice;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private int gameGuess;
    int total_players;
    Player[] players;
    ArrayList<Player> winners;

    public Game(int n){
        // total players in game
        this.total_players = n;
        this.players = new Player[n];
        this.winners = new ArrayList<>();
        // init players
        for(int i=0; i<n; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter Player " + i + 1 + " name, email and streak");
            String player_name = sc.nextLine();
            String player_email = sc.nextLine();
            int streak = sc.nextInt();
            players[i] = new Player(player_name, player_email,streak);
        }
    }

    public void makeGuess(){
        this.gameGuess = (int)(Math.random()*9) + 1;
    }

    public void declareWinners(ArrayList<Player> winners) {
        String res = "";
        for(int i=0; i<winners.size(); i++){
            res += winners.get(i).getName();
        }
        System.out.println(res + " are winners of game !!");
    }

    public boolean isWinner(){
        boolean winner = false;
        for(int i=0; i<this.total_players; i++){
            int playerGuess = this.players[i].getGuess();
            if(playerGuess == this.gameGuess) {
                winners.add(this.players[i]);
                winner = true;
            }
        }
        return winner;
    }

    public void Start(){
        // game guess
        makeGuess();
        while(true) {

            for(int i=0; i<this.total_players; i++){
                this.players[i].guessNumber();
            }

            if(isWinner()) {
                declareWinners(this.winners);
                System.out.println("Game over!! secret the game guess is 🚀 " + this.gameGuess);
                break;
            }
        }
    }
}
