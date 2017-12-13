// Generated from E:/dtantlrlr/src/main/java/org/dantlr\Dql.g4 by ANTLR 4.7
package org.dantlr.gner.cab;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DqlParser}.
 */
public interface DqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DqlParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(DqlParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(DqlParser.BindingContext ctx);
}