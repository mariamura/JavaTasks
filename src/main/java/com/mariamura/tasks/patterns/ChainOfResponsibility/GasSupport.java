package com.mariamura.tasks.patterns.ChainOfResponsibility;

public class GasSupport extends Support {
    public GasSupport(int urgency) {
        super(urgency);
    }

    @Override
    public void message(String info) {
        System.out.println("Gas support is needed!");
    }
}
