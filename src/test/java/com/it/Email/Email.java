package com.it.Email;

import java.util.Objects;

public class Email {
    public String emailSend;
    public String inputSub;
    public String emailBody;

    public Email(String emailSend, String inputSub, String emailBody) {
        this.emailSend = emailSend;
        this.inputSub = inputSub;
        this.emailBody = emailBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(emailSend, email.emailSend) && Objects.equals(inputSub, email.inputSub) && Objects.equals(emailBody, email.emailBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailSend, inputSub, emailBody);
    }

    @Override
    public String toString() {
        return "Email{" +
                "emailSend='" + emailSend + '\'' +
                ", inputSub='" + inputSub + '\'' +
                ", emailBody='" + emailBody + '\'' +
                '}';
    }
}

