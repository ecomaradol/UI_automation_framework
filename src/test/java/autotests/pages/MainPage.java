package autotests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement
            logo = $(".navbar-brand-logo"),
            buttonStore = $(".dui-btn.dui-btn-sm.dui-btn-buy.btn-store.ga-data"),
            leftSideMenu = $(".dui-sidenav"),
            footer = $("#site-footer"),
            groundSystem = $("#ground-based-cinematography-system-nav"),
            aerialSystem = $("#integrated-system-nav"),
            gimbal = $("#camera-gimbal-nav"),
            stabilizer = $("#camera-stabilizer-nav"),
            accessories = $("#professional-accessories-nav"),
            stabilizersLink = $("#camera-stabilizer-nav"),
            userIcon = $(".user-icon"),
            stabilizerList = $("#camera-stabilizer-list"),
            register = $(".register-link.ga-data"),
            login = $(".login-link.ga-data");

    @Step("Open the main page")
    public MainPage openMainPage() {
        open("/products/professional");

        return this;
    }

    @Step("Check that the page has logo")
    public MainPage checkLogo() {
        logo.should(exist);

        return this;
    }

    @Step("Check that the page has 'Store' button")
    public MainPage checkButtonStore() {
        buttonStore.shouldHave(Condition.text("Store"));

        return this;
    }

    @Step("Check that the left-side menu is existed")
    public MainPage checkLeftSideMenu() {
        leftSideMenu.should(exist);

        return this;
    }

    @Step("Check that the footer is existed")
    public MainPage checkFooter() {
        footer.should(exist);

        return this;
    }

    @Step("Check that the left-side menu has links")
    public MainPage checkLeftSideLinks() {
        groundSystem.shouldHave(Condition.text("Bodengest??tztes Kinematografiesystem"));
        aerialSystem.shouldHave(Condition.text("Luftbildkamerasystem"));
        gimbal.shouldHave(Condition.text("Gimbalkameras"));
        stabilizer.shouldHave(Condition.text("Stabilisatoren"));
        accessories.shouldHave(Condition.text("Zubeh??r"));

        return this;
    }

    @Step("Check that the camera stabilizer list is existed")
    public MainPage checkStabilizerList() {
        stabilizersLink.click();
        stabilizerList.should(exist);

        return this;
    }

    @Step("Hover the cursor over the login menu")
    public MainPage hoverToLoginMenu() {
        userIcon.hover();

        return this;
    }

    @Step("Check that the login menu is existed")
    public MainPage checkLoginMenu() {
        login.should(visible);
        register.should(visible);

        return this;
    }
}


