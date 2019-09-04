package org.stop_lang.stop.symbols;

import org.antlr.symtab.Scope;
import org.antlr.symtab.SymbolWithScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stop_lang.stop.parser.StopParser;

public class EnqueueSymbol extends SymbolWithScope {
    private String fullName;
    private String packageName;
    private StopParser.EnqueueContext ctx;

    public EnqueueSymbol(StopParser.EnqueueContext ctx, Scope enclosingScope, String defaultPackageName){
        super(ctx.model_type().getText());
        setScope(enclosingScope);

        this.ctx =ctx;

        String name = ctx.model_type().getText();
        packageName = defaultPackageName;

        if (!isReference(name)) {
            ParseTree p = getRootContext(ctx).getChild(0);
            if (p != null && (p instanceof StopParser.PackageDeclarationContext)) {
                StopParser.PackageDeclarationContext decl = (StopParser.PackageDeclarationContext) p;
                packageName = decl.packageName().getText();
            }

            if (packageName != null) {
                name = packageName + "." + name;
            }
        }

        fullName = name;
    }

    @Override
    public String getName(){
        return fullName;
    }

    public StopParser.EnqueueContext getContext(){
        return ctx;
    }

    private ParserRuleContext getRootContext(ParserRuleContext ctx){
        if (ctx.getParent() == null){
            return ctx;
        }
        return getRootContext(ctx.getParent());
    }

    protected boolean isReference(String name){
        return name.contains(".");
    }
}
