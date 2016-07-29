package example;

import example.gen.MyDateTimeBaseListener;
import example.gen.MyDateTimeLexer;
import example.gen.MyDateTimeParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {
        MyDateTimeLexer lexer = new MyDateTimeLexer(new ANTLRInputStream("Fri, 29 Jul 16 18:26:00 EST"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyDateTimeParser parser = new MyDateTimeParser(tokens);
        ParseTree tree = parser.date_time();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new MyDateTimeWalker(), tree );
    }
}

class MyDateTimeWalker extends MyDateTimeBaseListener {

    @Override
    public void enterDate_time(MyDateTimeParser.Date_timeContext ctx) {
        System.out.println("Entering the whole sentence");
    }

    @Override
    public void exitDate_time(MyDateTimeParser.Date_timeContext ctx) {
        System.out.println("Exiting the whole sentence");
    }

    @Override
    public void enterDay(MyDateTimeParser.DayContext ctx) {
        System.out.println("Entering the day part ------- day = " + ctx.getText());
    }

    @Override
    public void enterMonth(MyDateTimeParser.MonthContext ctx) {
        System.out.println("Entering the month part ------- month = " + ctx.getText());
    }

    @Override
    public void enterDate(MyDateTimeParser.DateContext ctx) {
        System.out.println("Entering the date sentence ------- date = " + ctx.getText());
    }
}
