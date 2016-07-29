// Generated from /Users/canc/Code/java/antlr-example/src/main/resources/MyDateTime.g4 by ANTLR 4.5.3
package example.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyDateTimeParser}.
 */
public interface MyDateTimeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyDateTimeParser#date_time}.
	 * @param ctx the parse tree
	 */
	void enterDate_time(MyDateTimeParser.Date_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDateTimeParser#date_time}.
	 * @param ctx the parse tree
	 */
	void exitDate_time(MyDateTimeParser.Date_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDateTimeParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(MyDateTimeParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDateTimeParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(MyDateTimeParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDateTimeParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(MyDateTimeParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDateTimeParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(MyDateTimeParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDateTimeParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(MyDateTimeParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDateTimeParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(MyDateTimeParser.MonthContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDateTimeParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(MyDateTimeParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDateTimeParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(MyDateTimeParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDateTimeParser#hour}.
	 * @param ctx the parse tree
	 */
	void enterHour(MyDateTimeParser.HourContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDateTimeParser#hour}.
	 * @param ctx the parse tree
	 */
	void exitHour(MyDateTimeParser.HourContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDateTimeParser#zone}.
	 * @param ctx the parse tree
	 */
	void enterZone(MyDateTimeParser.ZoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDateTimeParser#zone}.
	 * @param ctx the parse tree
	 */
	void exitZone(MyDateTimeParser.ZoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDateTimeParser#two_digit}.
	 * @param ctx the parse tree
	 */
	void enterTwo_digit(MyDateTimeParser.Two_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDateTimeParser#two_digit}.
	 * @param ctx the parse tree
	 */
	void exitTwo_digit(MyDateTimeParser.Two_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDateTimeParser#four_digit}.
	 * @param ctx the parse tree
	 */
	void enterFour_digit(MyDateTimeParser.Four_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDateTimeParser#four_digit}.
	 * @param ctx the parse tree
	 */
	void exitFour_digit(MyDateTimeParser.Four_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyDateTimeParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumeric(MyDateTimeParser.AlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyDateTimeParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumeric(MyDateTimeParser.AlphanumericContext ctx);
}