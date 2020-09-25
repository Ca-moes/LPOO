import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game  {
    private GUI gui = new LanternaGUI() {

    public Game() {
        try {
            /*GUI.getTerminal() = CreateTerminal();
            screen = CreateTerminalScreen(terminal);

            screen.setCursorPosition(null);   // we don't need a cursor
            screen.startScreen();             // screens must be started
            screen.doResizeIfNecessary();     // resize screen if necessary*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while(true) {
            try {
                /*if (draw() == 1) {
                    screen.close();
                    System.out.println("Game Over");
                    break;
                }*/
                KeyStroke key = screen.readInput();
                if (key.getKeyType() == KeyType.Character && (key.getCharacter() == 'q' || key.getCharacter() == 'Q')) screen.close();
                if (key.getKeyType() == KeyType.EOF) break;
                //processKey(key);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
