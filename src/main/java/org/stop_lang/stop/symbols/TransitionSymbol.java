package org.stop_lang.stop.symbols;

import org.antlr.symtab.Scope;
import org.antlr.symtab.SymbolWithScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stop_lang.stop.parser.StopParser;

public class TransitionSymbol  extends SymbolWithScope {
    private String packageName;
    private String fullName;
    private StopParser.TransitionContext ctx;
    private boolean annotation = false;

    public TransitionSymbol(StopParser.TransitionContext ctx, Scope enclosingScope, String defaultPackageName){
        super(ctx.getText());
        setScope(enclosingScope);
        this.ctx = ctx;
        packageName = defaultPackageName;
        String name = "";

        if (ctx.model_annotation()!= null){
            annotation = true;
            name = ctx.model_annotation().model_type().getText();
        }else if (ctx.model_type()!=null) {
            name = ctx.model_type().getText();
        }

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

    public StopParser.TransitionContext getContext(){
        return ctx;
    }

    public boolean isAnnotation(){
        return annotation;
    }

    private boolean isReference(String name){
        return name.contains(".");
    }

    private ParserRuleContext getRootContext(ParserRuleContext ctx){
        if (ctx.getParent() == null){
            return ctx;
        }
        return getRootContext(ctx.getParent());
    }
}
