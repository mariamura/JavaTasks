package com.mariamura.tasks.patterns.ChainOfResponsibility;

public abstract class Support {
    private int urgency;
    private Support nextOperator;

    public Support(int urgency) {
        this.urgency = urgency;
    }

    public void setNextOperator(Support nextOperator){
        this.nextOperator = nextOperator;
    }

    public void replyMessage(String message, int urgency) {
        System.out.println("Message: " + message + "\nUrgency: " + urgency);
    }

    public abstract void message(String info);

}
