package com.mariamura.tasks.patterns.Interpreter;

public class Main {
    public static void main(String[] args) {
        Expression isAngryAttack = Test.getSkillExpression();
        Expression isMultiCast = Test.getDoubleSkillExpression();

        System.out.println(
                isAngryAttack.interpret("angry attack skill")
                        + ","
                        + isMultiCast.interpret("multi cast skill"));
    }

}
