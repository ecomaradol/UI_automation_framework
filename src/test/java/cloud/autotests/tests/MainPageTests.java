package cloud.autotests.tests;


import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;


public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @Description("Page title has Logo")
    @DisplayName("Page title has Logo")
    void titleTest() {
        mainPage
                .openMainPage()
                .checkLogo();

    }

    @Test
    @Description("Page has 'Store' button")
    @DisplayName("Page has 'Store' button")
    void storeButtonExistTest() {
        mainPage
                .openMainPage()
                .checkButtonStore();

    }

    @Test
    @Description("Page has left-side menu")
    @DisplayName("Page has left-side menu")
    void leftSideExistTest() {

        mainPage
                .openMainPage()
                .checkLeftSideMenu();

    }

    @Test
    @Description("Page has footer")
    @DisplayName("Page has footer")
    void footerExistTest() {
        mainPage
                .openMainPage()
                .checkFooter();

    }

    @Test
    @Description("Left-side menu has links")
    @DisplayName("Left-side menu has links")
    void leftSideLinksTest() {
        mainPage
                .openMainPage()
                .checkLeftSideLinks();

    }

    @Test
    @Description("Camera stabilizer list is existed")
    @DisplayName("Camera stabilizer list is existed")
    void stabilizerListTest() {
        mainPage
                .openMainPage()
                .checkStabilizerList();
    }

    @Test
    @Description("Hover the cursor over the login menu")
    @DisplayName("Hover the cursor over the login menu")
    void hoverOverLoginMenuTest() {
        mainPage
                .openMainPage()
                .hoverToLoginMenu();

    }
}