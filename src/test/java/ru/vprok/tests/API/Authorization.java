package ru.vprok.tests.API;

import io.restassured.http.ContentType;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;


public class Authorization {

    @Test
    public void getAuthorization () {
        given ()
                .baseUri ("https://www.vprok.ru/")
                .headers ("Authorization", String.format ("Bearer token"), "Cookie", "")
                .contentType (ContentType.JSON)
                .body ("{\"grant_type\":, \"phone_code\"," +
                        "{\"client_id\":, \"8\"," +
                        "{\"client_secret\":, \"{{client_secret}}\"," +
                        "{\"phone_number\":, \"{{phone_number}}\"," +
                        "{\"pin\":, \"12321\"," +
                        "{\"scope\":, \"\",")
                .when ()
                .post ("/api/v1/oauth/token")
                .then ()
                .statusCode (200)
                .body ("token_type", is ("Bearer"), "expires_in", is ("180000000"), "access_token", (""), "refresh_token", (""));
    }

    @Test
    public void getCart () {
        given ()
                .baseUri ("https://www.vprok.ru/")
                .contentType (ContentType.JSON)
                .formParam ("updatingCart", "true")
                .when ()
                .get ("api/v4/cart")
                .then ()
                .statusCode (200);


    }


}
