package almaz.murzabekov.math.parser.handlers;

import almaz.murzabekov.math.parser.ParseException;

public class MinusOperatorHandler extends BinaryOperatorHandler{
    public static final int PRIORITY = 1;
    public MinusOperatorHandler() {
        super("-", PRIORITY);
    }

    @Override
    protected String execute(String left, String right) throws ParseException {
        try{
            double l = Double.parseDouble(left);
            double r = Double.parseDouble(right);

            return (l - r) + "";
        } catch (NumberFormatException ex){
            throw new ParseException(ex);
        }
    }
}