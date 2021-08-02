package com.mariamura.tasks.patterns.Facade;

public class PlayersTracking {
    private boolean check;
    private int activeUsers;

    public boolean isActiveUsers() {
        return check;
    }

    public void status() {
        if(activeUsers>0) {
            System.out.println(activeUsers + " is online..");
            check = true;
        } else {
            System.out.println(activeUsers + " is online..");
            check = false;
        }
    }

    public void setActiveUsers(int activeUsers) {
        this.activeUsers = activeUsers;
    }
}
