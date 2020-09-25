import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public interface GUI {
    public Screen CreateTerminalScreen(Terminal terminal) throws IOException;
    public Terminal CreateTerminal() throws IOException;
}
