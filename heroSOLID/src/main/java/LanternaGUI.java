import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public abstract class LanternaGUI implements GUI {
    private Terminal terminal;
    private Screen screen;

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public Screen CreateTerminalScreen(Terminal terminal) throws IOException {
        return new TerminalScreen(terminal);
    }

    @Override
    public Terminal CreateTerminal() throws IOException {
        return new DefaultTerminalFactory().createTerminal();
    }

    public KeyStroke readInput() throws IOException {
        return new KeyStroke(KeyType.ArrowUp);
        //return screen.readInput();
    }
}
