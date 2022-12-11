package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonSearch {
    @Given("Kullanici amazon anasayfasinda.")
    public void kullaniciAmazonAnasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon"));
    }
}
