package org.stop_lang.stop.symbols;

import org.antlr.symtab.SymbolWithScope;
import org.stop_lang.stop.parser.StopParser;

import java.util.HashMap;
import java.util.Map;

public class ValidationSymbol extends SymbolWithScope {
    private Map<String, Object> parameters;

    public ValidationSymbol(String name, StopParser.Validation_statementContext statementContext, String packageName) {
        super(name);

        parameters = new HashMap<>();

        if (statementContext.state_validation()!= null){
            String modelName;
            if (statementContext.state_validation().model_annotation()!= null){
                modelName = statementContext.state_validation().model_annotation().getText();
            }else {
                modelName = statementContext.state_validation().model_type().getText();
            }
            if (!modelName.contains(".") && (packageName!=null)){
                modelName = packageName +"." + modelName;
            }
            parameters.put("kind", modelName);
        }else{
            for ( StopParser.Validation_parameterContext parameterContext
                    : statementContext.validation().validation_parameters().validation_parameter()){
                if (parameterContext.validation_parameter_value().NUMBER()!=null){
                    parameters.put(parameterContext.ID().getText(), Double.valueOf(parameterContext.validation_parameter_value().NUMBER().getText()));
                }else{
                    parameters.put(parameterContext.ID().getText(), parameterContext.validation_parameter_value().STRING().getText());
                }
            }
        }
    }

    public Map<String, Object> getParameters(){
        return parameters;
    }
}
