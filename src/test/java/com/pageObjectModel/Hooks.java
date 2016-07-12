package com.pageObjectModel;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.bm.Bagi;


import java.io.IOException;

/**
 * Created by Administrator on 8/05/2016.
 */
public class Hooks {
    DriverManager driverManager=new DriverManager();

    @Before
    public void setUp()throws IOException{
        driverManager.openBrowser();
    }

    @After
    public void tearDown(){
        driverManager.closeBrowser();

    }
}
