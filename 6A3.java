// File: Game.java
import java.util.Objects;

class Game {
    private String title;
    private int playerCount;

    public Game(String title, int playerCount) {
        this.title = title;
        this.playerCount = playerCount;
    }

    @Override
    public String toString() {
        return "Game: " + title + ", Players: " + playerCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Game game = (Game) obj;
        return playerCount == game.playerCount && Objects.equals(title, game.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, playerCount);
    }
}

// File: CardGame.java
import java.util.Objects;

class CardGame extends Game {
    private int deckCount;

    public CardGame(String title, int playerCount, int deckCount) {
        super(title, playerCount);
        this.deckCount = deckCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Decks: " + deckCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CardGame cardGame = (CardGame) obj;
        return deckCount == cardGame.deckCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), deckCount);
    }
}

// File: Main.java
public class Main {
    public static void main(String[] args) {
        Game g1 = new Game("Monopoly", 4);
        Game g2 = new Game("Monopoly", 4);
        Game g3 = new Game("Chess", 2);

        System.out.println("Game 1: " + g1);
        System.out.println("Game 2: " + g2);
        System.out.println("Game 3: " + g3);

        System.out.println("\nTesting equality:");
        System.out.println("g1 equals g2? " + g1.equals(g2));
        System.out.println("g1 equals g3? " + g1.equals(g3));

        System.out.println("\nTesting CardGame:");
        CardGame cg1 = new CardGame("Poker", 5, 1);
        CardGame cg2 = new CardGame("Poker", 5, 1);
        CardGame cg3 = new CardGame("Go Fish", 3, 1);
        CardGame cg4 = new CardGame("Poker", 5, 2);

        System.out.println("CardGame 1: " + cg1);
        System.out.println("CardGame 2: " + cg2);
        System.out.println("CardGame 3: " + cg3);
        System.out.println("CardGame 4: " + cg4);

        System.out.println("\nTesting CardGame equality:");
        System.out.println("cg1 equals cg2? " + cg1.equals(cg2));
        System.out.println("cg1 equals cg3? " + cg1.equals(cg3));
        System.out.println("cg1 equals cg4? " + cg1.equals(cg4));
    }
}