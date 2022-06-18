package autotests.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import autotests.pages.*;


public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Page title has Logo")
    void titleTest() {
        mainPage
                .openMainPage()
                .checkLogo();
    }

    @Test
    @DisplayName("Page has 'Store' button")
    void storeButtonExistTest() {
        mainPage
                .openMainPage()
                .checkButtonStore();
    }

    @Test
    @DisplayName("Page has left-side menu")
    void leftSideExistTest() {

        mainPage
                .openMainPage()
                .checkLeftSideMenu();
    }

    @Test
    @DisplayName("Page has footer")
    void footerExistTest() {
        mainPage
                .openMainPage()
                .checkFooter();
    }

    @Test
    @DisplayName("Left-side menu has links")
    void leftSideLinksTest() {
        mainPage
                .openMainPage()
                .checkLeftSideLinks();
    }

    @Test
    @DisplayName("Camera stabilizer list is existed")
    void stabilizerListTest() {
        mainPage
                .openMainPage()
                .checkStabilizerList();
    }

    @Test
    @DisplayName("Hover the cursor over the login menu")
    void hoverOverLoginMenuTest() {
        mainPage
                .openMainPage()
                .hoverToLoginMenu()
                .checkLoginMenu();
    }
}