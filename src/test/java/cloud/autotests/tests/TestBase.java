package cloud.autotests.tests;


import cloud.autotests.helpers.Attach;
import cloud.autotests.helpers.DriverSettings;
import com.codeborne.selenide.Configuration;


import io.qameta.allure.junit5.AllureJunit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;



@ExtendWith({AllureJunit5.class})
public class TestBase {
    @BeforeAll
  static void beforeAll() {
        DriverSettings.configure();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
