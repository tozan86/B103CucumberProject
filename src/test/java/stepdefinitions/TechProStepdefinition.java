package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class TechProStepdefinition {
    @Given("techproeducation sayfasına gidilir")
    public void techproeducationSayfasınaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));
    }

    @When("sayfa basligi yazdirilir")
    public void sayfaBasligiYazdirilir() {
    }

    @Then("sayfa basliginda Bootcamp yazisi oldugu test edilir")
    public void sayfaBasligindaBootcampYazisiOlduguTestEdilir() {
    }

    @And("sayfa kapatilir")
    public void sayfaKapatilir() {
    }
}
