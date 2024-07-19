package OOP_LLD.Practice;

public class Player {
    String name;
    String email;
    int streak;
    int guess;

    public Player(String name, String email, int streak){
        this.name = name;
        this.email = email;
        this.streak = streak;
    }


    public String getName(){
        return this.name;
    }

    public int getGuess(){
        return this.guess;
    }

    public void guessNumber(){
       int number = (int) (Math.random() * 9) + 1;
       this.guess = number;
    }
}
