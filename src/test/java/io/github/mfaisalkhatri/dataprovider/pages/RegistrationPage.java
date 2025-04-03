package io.github.mfaisalkhatri.dataprovider.pages;

import io.github.mfaisalkhatri.data.RegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    private final WebDriver driver;

    public RegistrationPage (WebDriver driver) {
        this.driver = driver;
    }

    public void fillRegistrationForm (RegistrationData registrationData) {
        firstNameField ().clear ();
        firstNameField ().sendKeys (registrationData.getFirstName ());
        lastNameField ().clear ();
        lastNameField ().sendKeys (registrationData.getLastName ());
        dobField ().sendKeys (registrationData.getDob ());
        streetField ().clear ();
        streetField ().sendKeys (registrationData.getStreet ());
        postalCodeField ().clear ();
        postalCodeField ().sendKeys (registrationData.getPostalCode ());
        cityField ().clear ();
        cityField ().sendKeys (registrationData.getCity ());
        stateField ().clear ();
        stateField ().sendKeys (registrationData.getState ());
        selectCountryVisibleText (registrationData.getCountry ());
        phoneField ().clear ();
        phoneField ().sendKeys (registrationData.getPhone ());
        emailAddressField ().clear ();
        emailAddressField ().sendKeys (registrationData.getEmailAddress ());
        passwordField ().clear ();
        passwordField ().sendKeys (registrationData.getPassword ());
        registerButton ().click ();
    }

    public String pageHeader () {
        return driver.findElement (By.cssSelector ("app-register h3"))
            .getText ();
    }

    public String passwordAlertMessage () {
        return driver.findElement (By.cssSelector (".alert-danger div"))
            .getText ();
    }

    private WebElement cityField () {
        return driver.findElement (By.id ("city"));
    }

    private WebElement countryField () {
        return driver.findElement (By.id ("country"));
    }

    private WebElement dobField () {
        return driver.findElement (By.id ("dob"));
    }

    private WebElement emailAddressField () {
        return driver.findElement (By.id ("email"));
    }

    private WebElement firstNameField () {
        return driver.findElement (By.id ("first_name"));
    }

    private WebElement lastNameField () {
        return driver.findElement (By.id ("last_name"));
    }

    private WebElement passwordField () {
        return driver.findElement (By.id ("password"));
    }

    private WebElement phoneField () {
        return driver.findElement (By.id ("phone"));
    }

    private WebElement postalCodeField () {
        return driver.findElement (By.id ("postal_code"));
    }

    private WebElement registerButton () {
        return driver.findElement (By.cssSelector (".btnSubmit"));
    }

    private void selectCountryVisibleText (String countryName) {
        //countryField ().click ();
        new Select (countryField ()).selectByVisibleText (countryName);
    }

    private WebElement stateField () {
        return driver.findElement (By.id ("state"));
    }

    private WebElement streetField () {
        return driver.findElement (By.id ("street"));
    }
}
