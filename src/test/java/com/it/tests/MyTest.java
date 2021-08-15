package com.it.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {

    @Test
    public void myTest() {
        app.login.login(validUser);
        Assert.assertEquals(app.board.getLbUserEmail(), validUser.email);
        app.board.BtSendEmailClick();
        app.email.email(validEmail);
    }
}
