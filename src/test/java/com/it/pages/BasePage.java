package com.it.pages;

import com.it.driver.MyDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    static protected MyDriver driver = MyDriver.getInstance();
    protected Logger log = Logger.getLogger(this.getClass().getSimpleName());


    public BasePage() {
        PageFactory.initElements(driver, this);
    }

}
