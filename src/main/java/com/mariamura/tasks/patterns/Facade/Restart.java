package com.mariamura.tasks.patterns.Facade;

public class Restart {
    GameServer gameServer = new GameServer();
    Gaming gaming = new Gaming();
    PlayersTracking playersTracking = new PlayersTracking();

    public void serverRestart() {
        gaming.playGame();
        gameServer.restart(playersTracking);
    }
}
