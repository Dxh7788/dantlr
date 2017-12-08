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
	/**
	 * Enter a parse tree produced by {@link DqlParser#suffix}.
	 * @param ctx the parse tree
	 */
	void enterSuffix(DqlParser.SuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#suffix}.
	 * @param ctx the parse tree
	 */
	void exitSuffix(DqlParser.SuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link DqlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(DqlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(DqlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DqlParser#midl}.
	 * @param ctx the parse tree
	 */
	void enterMidl(DqlParser.MidlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#midl}.
	 * @param ctx the parse tree
	 */
	void exitMidl(DqlParser.MidlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DqlParser#endexpr}.
	 * @param ctx the parse tree
	 */
	void enterEndexpr(DqlParser.EndexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DqlParser#endexpr}.
	 * @param ctx the parse tree
	 */
	void exitEndexpr(DqlParser.EndexprContext ctx);
}