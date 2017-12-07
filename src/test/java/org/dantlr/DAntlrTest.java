package org.dantlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.dantlr.autogner.cab.HelloLexer;
import org.dantlr.autogner.cab.HelloParser;

/**
 * @author xh.d
 * @date 2017/12/7 9:35
 */
public class DAntlrTest {
    /**
     * test first ANTLR example 'Hello.g4'
     * */
    public static void main(String[] args) {
        String sentence = "hello parrt";
        /**
         * lexer analysis
         * */
        HelloLexer lexer = new HelloLexer(new ANTLRInputStream(sentence));
        CommonTokenStream stream = new CommonTokenStream(lexer);
        /**
         * Syntax analysis
         * */
        HelloParser parser = new HelloParser(stream);
        parser.getContext().getChildCount();
        System.out.println(parser.getContext().getChildCount());
        System.out.println(parser.getBuildParseTree());
    }
}
