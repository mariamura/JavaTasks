package com.mariamura.tasks.patterns.ChainOfResponsibility;

public class WifiSupport extends Support {

    public WifiSupport(int urgency) {
        super(urgency);
    }


    @Override
    public void message(String info) {
        System.out.println("WifiSupport is needed");
    }


}
