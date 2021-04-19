package edu.iis.mto.multithread;

class RocketStarter implements Runnable {

    private PatriotBattery battery;
    private Scud enemyMissle;
    private int rocketCount;

    RocketStarter(PatriotBattery battery, Scud enemyMissle, int rocketCount) {
        this.battery = battery;
        this.enemyMissle = enemyMissle;
        this.rocketCount = rocketCount;
    }

    @Override
    public void run() {
        for (int i = 0; i < rocketCount; i++) {
            battery.launchPatriot(enemyMissle);
        }
    }
}


