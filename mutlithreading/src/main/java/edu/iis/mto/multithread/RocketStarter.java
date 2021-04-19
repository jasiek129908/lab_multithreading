package edu.iis.mto.multithread;

class RocketStarter {

    public Runnable startRockets(PatriotBattery battery, Scud enemyMissle, int rocketCount) {
        return () -> {
            for (int i = 0; i < rocketCount; i++) {
                battery.launchPatriot(enemyMissle);
            }
        };
    }

}


