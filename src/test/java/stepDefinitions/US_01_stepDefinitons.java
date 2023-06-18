package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class US_01_stepDefinitons {
    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburada"));
        String actualData= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualData.contains(string));
    }


}
