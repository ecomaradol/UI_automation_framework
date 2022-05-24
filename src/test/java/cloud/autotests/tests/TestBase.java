package cloud.autotests.tests;


import cloud.autotests.config.CredentialsConfig;
import cloud.autotests.helpers.Attach;
import cloud.autotests.helpers.DriverSettings;
import com.codeborne.selenide.Configuration;


import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.junit5.AllureJunit5;

import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static java.lang.String.format;


@ExtendWith({AllureJunit5.class})
public class TestBase {
    @BeforeAll
  static void beforeAll() {
        DriverSettings.configure();

        CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);
        Configuration.remote = format("https://%s:%s@%s",
                credentials.remoteDriverUser(),
                credentials.remoteDriverPassword(),
                System.getProperty("remoteUrl", "selenoid.autotests.cloud/wd/hub"));

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "100");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
            SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

//    String remoteDriverUser = System.getProperty("remoteDriverUser");
//    String remoteDriverPassword = System.getProperty("remoteDriverPassword");
//
//    Configuration.baseUrl = "https://www.dji.com/";
//    Configuration.browserSize = "1920x1080";
//    Configuration.browser = System.getProperty("browser", "chrome");
//
//    Configuration.remote = "https://" + user + ":" + password + "@" + System.getProperty("remoteBrowser");
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
