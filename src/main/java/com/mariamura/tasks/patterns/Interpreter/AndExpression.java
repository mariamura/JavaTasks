package com.mariamura.tasks.patterns.Interpreter;

public class AndExpression implements Expression {
    private Expression ex1;
    private Expression ex2;

    public AndExpression(Expression ex1, Expression ex2) {
        this.ex1 = ex1;
        this.ex2 = ex2;
    }

    @Override
    public boolean interpret(String text) {
        return ex1.interpret(text) && ex2.interpret(text);
    }
}
