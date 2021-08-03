package com.mariamura.tasks.patterns.ChainOfResponsibility;

public class ElectricitySupport extends Support {
    public ElectricitySupport(int urgency) {
        super(urgency);
    }

    @Override
    public void message(String info) {
        System.out.println("Electricity support is needed!");
    }
}
