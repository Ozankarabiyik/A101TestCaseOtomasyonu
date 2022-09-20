package StepDefinitions;

import Utilities.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {
    @After
    public void after(Scenario scenario)
    {
        System.out.println("Senaryo Sonucu : "+ scenario.getStatus());
        WebDriver.quitDriver();
    }
}
