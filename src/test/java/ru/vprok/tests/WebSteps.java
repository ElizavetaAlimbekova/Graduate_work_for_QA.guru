package ru.vprok.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {


    @Step("Open page")
    public WebSteps openPage (String baseurl) {
        open (Configuration.baseUrl);
        return this;
    }

    @Step("Open a form of registration")
    public WebSteps openFormRegistration () {
        $ (".xfnew-header__wrapper--blue").find (".xfnew-header__user-nav-link").click ();
        return this;
    }

    @Step("Enter number, click get code")
    public WebSteps enterNumber () {
        $ (".fo-checkout-form__field").setValue ("9999999999").pressEnter ();
        return this;
    }

    @Step("Enter code")
    public WebSteps enterCode () {
        $ (".xf-pincode__field").setValue ("12321");
        return this;
    }

    @Step("Check opening a profile")
    public WebSteps checkProfile () {
        $ (".xfnew-header__wrapper--blue").find (".xfnew-header__user-nav-link");
        $ (".user_name").click ();
        return this;
    }
    @Step("Get a cart")
    public WebSteps getcart(){
        $(".xfnew-header__cart").click ();
        return this;

    }



}
