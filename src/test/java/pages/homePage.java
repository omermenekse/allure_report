package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class homePage {
    public homePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
