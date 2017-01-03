package assignment2.userinterface;

import assignment2.domain.Train;
import assignment2.parser.RichRailLexer;
import assignment2.parser.RichRailParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;


/**
 * Renders the UI and manages interactions with it.
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 20-12-16 @ 16:21
 */

public class Main {
    public static void main(String[] args) {
        ANTLRInputStream input = new ANTLRInputStream("new wagon w3");
        RichRailLexer lex = new RichRailLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        RichRailParser parser = new RichRailParser(tokens);
        parser.command();
    }
}