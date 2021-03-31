package org.stop_lang.stop.symbols;

import org.stop_lang.stop.parser.StopParser;

public class ModelFieldSymbol extends StopFieldSymbol {
    public ModelFieldSymbol(StopParser.FieldContext ctx, String packageName){
        super(ctx, ctx.type().getText(), packageName);
    }
}
