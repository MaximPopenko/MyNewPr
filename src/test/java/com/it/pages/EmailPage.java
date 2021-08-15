package com.it.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends BasePage {
    @FindBy(id = "to")
    private WebElement emailSendTo;

    @FindBy(xpath = "//input[@name='subject']")
    private WebElement inputSub;

    @FindBy(xpath = "//body[@class='Smile']")
    private WebElement emailBody;

    @FindBy(name = "send")
    private WebElement sendEmail;

    public void createEmail (String emailSend, String sub, String body) {
        emailSendTo.clear();
        emailSendTo.sendKeys(emailSend);
        inputSub.clear();
        inputSub.sendKeys(sub);
        driver.switchTo().frame(driver.findElement(By.id("wysiwygtext")));
        emailBody.clear();
        emailBody.sendKeys(body);
        driver.switchTo().defaultContent();
        sendEmail.click();
    }

}
