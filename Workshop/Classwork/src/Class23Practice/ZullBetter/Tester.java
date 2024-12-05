package ZullBetter;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tester {

    // Test the "processCommand" method

    @Test
    public static void main(String[] args) {

        Game game = new Game();

        assertEquals(true, game.processCommand(new Command("go", "east")));

    }
        
}
