package com.mariamura.tasks.patterns.Command;

public class User {
    Command takeBk;
    Command returnBk;
    Command buyBk;

    public User(Command takeBk, Command returnBk, Command buyBk) {
        this.takeBk = takeBk;
        this.returnBk = returnBk;
        this.buyBk = buyBk;
    }

    public void takeRecord(){
        takeBk.execute();
    }
    public void returnRecord(){
        returnBk.execute();
    }

    public void buyRecord() {
        buyBk.execute();
    }
}
