package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.LineNumberReader;

import static support.TestContext.getDriver;

public class ShamnaPStepdefs {
    @Given("SP navigate to URL {string}")
    public void spNavigateToURL(String sURL) {
//    getDriver().get("https://www.google.com/");
        switch (sURL){
            case "Google":
                getDriver().get("https://www.google.com/");
                break;
            case "Portnov School":
                getDriver().get("https://www.portnov.com/");
                break;
            case "Yahoo":
                getDriver().get("https://www.yahoo.com/");
                break;
            case "ASK":
                getDriver().get("http://ask-qa.portnov.com/");
                break;
            default:
                System.out.println("No URL found");

        }

    }

    @Then("SP  get page information")
    public void spGetPageInformation() {
        System.out.println("The page title is "+ getDriver().getTitle());
        System.out.println("The page URL is "+ getDriver().getCurrentUrl());
        System.out.println("Window handle is "+ getDriver().getWindowHandle());
    }

    @Then("SP maximize the window")
    public void spMaximizeTheWindow() {
        getDriver().manage().window().maximize();
    }
}
