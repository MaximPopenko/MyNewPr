package com.it.helpers;

import com.it.Email.Email;
import com.it.pages.EmailPage;

public class EmailHelper extends EmailPage {
    public void email(Email email) {
        createEmail(email.emailSend, email.inputSub, email.emailBody);
    }
}
