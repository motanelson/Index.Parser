// Generated from index.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link indexParser}.
 */
public interface indexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link indexParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(indexParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link indexParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(indexParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link indexParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(indexParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link indexParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(indexParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link indexParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(indexParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link indexParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(indexParser.OperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link indexParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(indexParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link indexParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(indexParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link indexParser#subrotina}.
	 * @param ctx the parse tree
	 */
	void enterSubrotina(indexParser.SubrotinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link indexParser#subrotina}.
	 * @param ctx the parse tree
	 */
	void exitSubrotina(indexParser.SubrotinaContext ctx);
}