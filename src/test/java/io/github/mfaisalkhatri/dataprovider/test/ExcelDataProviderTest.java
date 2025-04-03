package io.github.mfaisalkhatri.dataprovider.test;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;

import io.github.mfaisalkhatri.data.RegistrationData;
import io.github.mfaisalkhatri.data.RegistrationDataBuilder;
import io.github.mfaisalkhatri.dataprovider.pages.RegistrationPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProviderTest extends BaseTest {

    @DataProvider
    public Iterator<RegistrationData> getRegistrationData () {
        RegistrationDataBuilder registrationDataBuilder = new RegistrationDataBuilder ();
        return registrationDataBuilder.getRegistrationData ()
            .iterator ();
    }

    @Test (dataProvider = "getRegistrationData")
    public void testRegistrationPasswordAlert (RegistrationData registrationData) {
        RegistrationPage registrationPage = new RegistrationPage (driver);
        driver.get ("https://practicesoftwaretesting.com/auth/register");
        
        assertEquals (registrationPage.pageHeader (), "Customer registration");
        registrationPage.fillRegistrationForm (registrationData);

        assertEquals (registrationPage.passwordAlertMessage (),
            "The given password has appeared in a data leak. Please choose a different password.");
    }
}