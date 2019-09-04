package org.stop_lang.stop.symbols;

import org.stop_lang.stop.parser.StopParser;

public class ScalarFieldSymbol extends StopFieldSymbol {
    public ScalarFieldSymbol(StopParser.FieldContext ctx){
        super(ctx, ctx.type().scalar_type().getText(), null);
    }
}
