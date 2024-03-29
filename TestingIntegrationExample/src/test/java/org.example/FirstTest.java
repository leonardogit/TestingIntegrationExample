package restAssured;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class FirstTest {

    @Test
    public void getCall(){

        given()
                .when()
                .get("http://api.zippopotam.us/IN/110001").
                then()
                .assertThat()
                .contentType(ContentType.JSON)
                .body("places[0].'place name'", equalTo("Janpath")).and()
                .body("places[0].'state'", equalTo("New Delhi"));
    }

}
