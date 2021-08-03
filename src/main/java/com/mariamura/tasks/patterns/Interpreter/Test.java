package com.mariamura.tasks.patterns.Interpreter;

public class Test {

    public static Expression getSkillExpression(){
        Expression angryAttack = new TerminalExpression("angry attack skill");
        Expression multiCast =  new TerminalExpression("multi cast skill");
        return new OrExpression(angryAttack, multiCast);
    }

    public static Expression getDoubleSkillExpression(){
        Expression angryAttack = new TerminalExpression("angry attack skill");
        Expression multiCast =  new TerminalExpression("multi cast skill");
        return new AndExpression(angryAttack, multiCast);
    }
}
