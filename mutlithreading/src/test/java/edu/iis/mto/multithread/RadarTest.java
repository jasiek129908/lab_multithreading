package edu.iis.mto.multithread;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RadarTest {

    @Mock
    private PatriotBattery batteryMock;

    @RepeatedTest(10)
    void launchPatriotOnceWhenNoticesAScudMissle() {
        Executor executor = Runnable::run;
        int rocketCount = 10;
        BetterRadar betterRadar = new BetterRadar(batteryMock, rocketCount, executor);
        Scud enemyMissle = new Scud();
        betterRadar.notice(enemyMissle);
        verify(batteryMock,times(rocketCount)).launchPatriot(enemyMissle);
    }

}
