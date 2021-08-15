package com.it.tests;

import com.it.App;
import com.it.Email.Email;
import com.it.Email.EmailFactory;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    static App app = new App();
    static User validUser = UserFactory.getValidUser();
    static Email validEmail = EmailFactory.getValidEmail();

    @AfterSuite
    public void tearDown() {
        app.common.stopApp();

    }
}
