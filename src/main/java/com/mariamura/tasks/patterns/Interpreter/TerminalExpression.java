package com.mariamura.tasks.patterns.Interpreter;

public class TerminalExpression implements Expression {
    private String input;

    public TerminalExpression(String input) {
        this.input = input;
    }

    @Override
    public boolean interpret(String text) {
        return text.contains(input);
    }
}
