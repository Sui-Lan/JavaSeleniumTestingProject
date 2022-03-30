package com.example.test;

import com.example.utils.Driver;
import org.junit.After;
import org.junit.BeforeClass;

public class BaseTest {

    @BeforeClass
    public static void setUpClass() {
        Driver.initializeDriver();
    }

    @After
    public void afterTest() {
        sleep(4000);
        Driver.closeDriver();
    }

    private void sleep(long m) {
        try {
            Thread.sleep(m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
