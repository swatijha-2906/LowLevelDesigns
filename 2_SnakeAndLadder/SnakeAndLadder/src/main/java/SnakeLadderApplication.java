import model.Game;

public class SnakeLadderApplication {
    public static void main(String args[])
    {
        Game game= new Game();
        game.setDice(2);
        game.setBoard(100, 4, 3);
        game.addPlayers(1, "Swati");
        game.addPlayers(2, "Shristi");
        game.addPlayers(3, "Shivani");
        game.addPlayers(4, "Sonal");
        game.startGame();


    }
}
