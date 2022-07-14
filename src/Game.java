public class Game {
    Player player1 = new Player();
    Player player2 = new Player();
    Player player3 = new Player();
    int p1guess;
    int p2guess;
    int p3guess;
    boolean p1correct;
    boolean p2correct;
    boolean p3correct;
    int toguess;

    public void startGame() {

        while (true) {
            toguess = (int) (Math.random() * 10);
            System.out.println("Thinking of a number .. guess?");
            player1.guess();
            player2.guess();
            player3.guess();

            if (player1.number == toguess) {
                p1correct = true;
            }
            if (player2.number == toguess) {
                p2correct = true;
            }
            if (player3.number == toguess) {
                p3correct = true;
            }

            if (p1correct || p2correct  || p3correct  ) {
                System.out.println("We have a winner!");
                if (p1correct) {System.out.println("Player 1 is right!");}
                if (p2correct) {System.out.println("Player 2 is right!");}
                if (p3correct) {System.out.println("Player 3 is right!");}
                System.out.println("Correctly guessed: " + toguess);
                break;
            } else {
                System.out.println("guess again!!");
            }

        }
    }
}
