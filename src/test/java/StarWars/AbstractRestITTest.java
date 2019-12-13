package StarWars;

import static io.restassured.RestAssured.given;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

abstract class AbstractRestITTest {

    static RequestSpecification getSpecification() {
        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .setBaseUri("https://swapi.co/api")
                .setBasePath("/films/")
                .build();
    }

    OutDtoFilms getFilms(Integer episode) {
        return given()
                .contentType(ContentType.JSON)
                .get(String.valueOf(episode))
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(new TypeRef<OutDtoFilms>() {
                });
    }

    OutDtoPlanets getPlanets(String url) {
        return given()
                .contentType(ContentType.JSON)
                .get(url)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(new TypeRef<OutDtoPlanets>() {
                });
    }

    OutDtoPeople getPeople(String url) {
        return given()
                .contentType(ContentType.JSON)
                .get(url)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(new TypeRef<OutDtoPeople>() {
                });
    }

    OutDtoSpecies getSpecies(String url) {
        return given()
                .contentType(ContentType.JSON)
                .get(url)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(new TypeRef<OutDtoSpecies>() {
                });
    }

    OutDtoStarships getStarships(String url) {
        return given()
                .contentType(ContentType.JSON)
                .get(url)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(new TypeRef<OutDtoStarships>() {
                });
    }

    OutDtoVehicles getVehicles(String url) {
        return given()
                .contentType(ContentType.JSON)
                .get(url)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(new TypeRef<OutDtoVehicles>() {
                });
    }

    Object getWookieName(String url) {
        return given()
                .contentType(ContentType.JSON)
                .get(url + "?format=wookiee")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(new TypeRef<Object>() {
                });
    }
}
