package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.DashBoardHelper;
import com.it.helpers.EmailHelper;
import com.it.helpers.LoginHelper;
import com.it.pages.DashBoardPage;

public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashBoardHelper board;
    public EmailHelper email;

    public App() {
        common = new CommonHelper();
        login = new LoginHelper();
        board = new DashBoardHelper();
        email = new EmailHelper();
    }
}
