package org.stop_lang.stop.symbols;

import org.antlr.symtab.FieldSymbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stop_lang.stop.parser.StopParser;

public abstract class StopFieldSymbol extends FieldSymbol {
    protected String typeName;
    protected DynamicModelSymbol dynamicModel;
    protected boolean optional = false;
    protected String packageName;
    protected String fullTypeName;
    protected StopParser.FieldContext context;
    protected boolean annotation = false;

    public StopFieldSymbol(StopParser.FieldContext ctx, String typeName, String packageName){
        super(ctx.ID().getText());
        if (ctx.type()!=null && ctx.type().model_annotation()!=null){
            typeName = ctx.type().model_annotation().model_type().getText();
            this.annotation = true;
        }else if (ctx.collection()!=null && ctx.collection().type()!=null && ctx.collection().type().model_annotation()!=null){
            this.annotation = true;
            typeName = ctx.collection().type().model_annotation().model_type().getText();
        }
        this.packageName = packageName;
        this.context = ctx;
        this.typeName = typeName;

        if (!isReference(typeName) && !isScalar(typeName)) {
            ParseTree p = getRootContext(ctx).getChild(0);
            if (p != null && (p instanceof StopParser.PackageDeclarationContext)) {
                StopParser.PackageDeclarationContext decl = (StopParser.PackageDeclarationContext) p;
                packageName = decl.packageName().getText();
            }

            if (packageName != null) {
                typeName = packageName + "." + typeName;
            }
        }

        fullTypeName = typeName;
    }

    public String getSimpleTypeName(){
        return typeName;
    }

    public String getTypeName(){
        return fullTypeName;
    }

    public void setDynamicModel(DynamicModelSymbol dynamicModelSymbol){
        this.dynamicModel = dynamicModelSymbol;
    }

    public DynamicModelSymbol getDynamicModel() {
        return this.dynamicModel;
    }

    public void setOptional(boolean optional){
        this.optional = optional;
    }

    public boolean isOptional(){
        return this.optional;
    }

    public boolean isAnnotation(){
        return this.annotation;
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

    protected boolean isScalar(String name){
        return Character.isLowerCase(name.charAt(0));
    }
}
