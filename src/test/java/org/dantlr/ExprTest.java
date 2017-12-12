package org.dantlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.dantlr.gner.expr.ExprLexer;
import org.dantlr.gner.expr.ExprParser;
import org.dantlr.gner.expr.ext.MyExprBaseVistor;

/**
 * @author xh.d
 * @date 2017/12/11 18:47
 */
public class ExprTest {

    public static void main(String[] args) {
        ANTLRInputStream inputStream = new ANTLRInputStream("1+2+3*4+6/2");
        ExprLexer lexer = new ExprLexer(inputStream);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokenStream);
        ParseTree parseTree = parser.prog();
        MyExprBaseVistor visitor = new MyExprBaseVistor();
        Integer rtn = visitor.visit(parseTree);
        System.out.println("#result#"+rtn);
    }
}
