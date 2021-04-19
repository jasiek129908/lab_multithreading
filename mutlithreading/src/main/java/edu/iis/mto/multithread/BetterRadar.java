package edu.iis.mto.multithread;

import java.util.concurrent.Executor;

public class BetterRadar {

    private int rocketCount;
    private PatriotBattery battery;
    private Executor executor;

    public BetterRadar(PatriotBattery battery, int rocketCount, Executor executor) {
        this.battery = battery;
        this.rocketCount = rocketCount;
        this.executor = executor;
    }

    public void notice(Scud enemyMissle) {
        launchPatriot(enemyMissle, rocketCount);
    }

    private void launchPatriot(Scud enemyMissle, int rocketCount) {
        executor.execute(new RocketStarter(battery,enemyMissle,rocketCount));
    }
}
