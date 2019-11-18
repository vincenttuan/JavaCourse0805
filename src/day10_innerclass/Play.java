package day10_innerclass;

public class Play {
    public void run(String name) {
        
        class Game {
            void printGameName() {
                System.out.println(name);
            }
        }
        
        Game game = new Game();
        game.printGameName();
        
    }
}
