package org.stop_lang.stop.symbols;

import org.antlr.symtab.Scope;
import org.antlr.symtab.SymbolWithScope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stop_lang.stop.parser.StopParser;

public class ThrowSymbol extends SymbolWithScope {
    private String fullName;
    private String packageName;
    private StopParser.Throw_parameterContext ctx;
    private boolean annotation = false;

    public ThrowSymbol(StopParser.Throw_parameterContext ctx, Scope enclosingScope, String defaultPackageName){
        super(ctx.getText());
        setScope(enclosingScope);
        this.ctx = ctx;
        String name = "";
        if (ctx.model_annotation()!= null){
            annotation = true;
            name = ctx.model_annotation().model_type().getText();
        }else if (ctx.model_type()!=null) {
            name = ctx.model_type().getText();
        }
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

    public StopParser.Throw_parameterContext getContext(){
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

    public boolean isAnnotation(){
        return annotation;
    }
}
