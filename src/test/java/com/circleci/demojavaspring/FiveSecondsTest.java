package com.circleci.demojavaspring;

import org.junit.Test;

public class FiveSecondsTest {


    @Test
    public void fiveSecondsTest() throws InterruptedException {
        Thread.sleep(5000);
    }
}
