package ru.vprok.tests.pages;

import org.junit.jupiter.api.Test;
import ru.vprok.tests.WebSteps;


public class Authorization {

    private static final String BASEURL = "https://www.vprok.ru/";
    private WebSteps steps = new WebSteps ();

    @Test
    public void checkAuthorization(){
        steps.openPage (BASEURL);
        steps.openFormRegistration ();
        steps.enterNumber ();
        steps.enterCode ();
        steps.checkProfile ();

    }

    @Test
    public void getCart(){
        steps.openPage (BASEURL);
        steps.getcart ();


    }


}


