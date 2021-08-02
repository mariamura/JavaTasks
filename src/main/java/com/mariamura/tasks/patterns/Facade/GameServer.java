package com.mariamura.tasks.patterns.Facade;

public class GameServer {
    public void restart(PlayersTracking playersTracking) {
        playersTracking.status();
        if (playersTracking.isActiveUsers()) {
            System.out.println("Server can not be restarted!");
        } else {
            System.out.println("Server can be restarted!");
        }
    }
}
