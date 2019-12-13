package StarWars;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TestApi extends AbstractRestITTest {

    int filmEpisode = 2;

    @Test
    void getNameSpecies() {
        RestAssured.requestSpecification = getSpecification();
        OutDtoFilms outFilms = getFilms(filmEpisode);

        ArrayList<String> speciesName = new ArrayList();

        for (int i = 0; i < outFilms.getSpecies().size(); i++) {
            OutDtoSpecies outSpecies = getSpecies(outFilms.getSpecies().get(i));
            speciesName.add(outSpecies.getName());
            assertEquals(outSpecies.getFilms().get(0), outFilms.getUrl(), "Отсутсвует ссылка на исходный фильм");

            assertTrue(outSpecies.getFilms().);
          System.out.println(outSpecies.getFilms());
        }

        Collections.sort(speciesName);
        System.out.println("Species: " + speciesName);
    }

    @Test
    void getNameVehicles() {
        RestAssured.requestSpecification = getSpecification();
        OutDtoFilms outFilms = getFilms(filmEpisode);

        ArrayList<String> vehiclesName = new ArrayList();
        ArrayList<String> vehiclesNameWookiee = new ArrayList();

        for (int i = 0; i < outFilms.getVehicles().size(); i++) {
            OutDtoVehicles outVehicles = getVehicles(outFilms.getVehicles().get(i));
            vehiclesName.add(outVehicles.getName());
            assertEquals(outVehicles.getFilms().get(0), outFilms.getUrl(), "Отсутсвует ссылка на исходный фильм");

            Object outWookiee = getWookieName(outFilms.getVehicles().get(i));
            vehiclesNameWookiee.add(String.valueOf(outWookiee));
        }

        Collections.sort(vehiclesName);
        System.out.println("Vehicles: " + vehiclesName);
        System.out.println("Wookiee name vehicles" + vehiclesNameWookiee);
    }

    @Test
    void getNameCharacters() {
        RestAssured.requestSpecification = getSpecification();
        OutDtoFilms outFilms = getFilms(filmEpisode);
        ArrayList<String> peopleName = new ArrayList();

        for (int i = 0; i < outFilms.getCharacters().size(); i++) {
            OutDtoPeople outPeople = getPeople(outFilms.getCharacters().get(i));
            peopleName.add(outPeople.getName());
            assertEquals(outPeople.getFilms().get(0), outFilms.getUrl(), "Отсутсвует ссылка на исходный фильм");
        }

        Collections.sort(peopleName);
        System.out.println("Characters: " + peopleName);
    }

    @Test
    void getNameStarships() {
        RestAssured.requestSpecification = getSpecification();
        OutDtoFilms outFilms = getFilms(filmEpisode);
        ArrayList<String> starshipsName = new ArrayList();

        for (int i = 0; i < outFilms.getStarships().size(); i++) {
            OutDtoStarships outStarships = getStarships(outFilms.getStarships().get(i));
            starshipsName.add(outStarships.getName());
            assertEquals(outStarships.getFilms().get(0), outFilms.getUrl(), "Отсутсвует ссылка на исходный фильм");
        }

        Collections.sort(starshipsName);
        System.out.println("Starships: " + starshipsName);
    }

    @Test
    void getNamePlanets() {
        RestAssured.requestSpecification = getSpecification();
        OutDtoFilms outFilms = getFilms(filmEpisode);

        ArrayList<String> planetsName = new ArrayList();
        ArrayList<String> planetsNameWookiee = new ArrayList();

        for (int i = 0; i < outFilms.getPlanets().size(); i++) {
            OutDtoPlanets outPlanets = getPlanets(outFilms.getPlanets().get(i));
            planetsName.add(outPlanets.getName());
            assertEquals(outPlanets.getFilms().get(0), outFilms.getUrl(), "Отсутсвует ссылка на исходный фильм");

            Object outWookiee = getWookieName(outFilms.getPlanets().get(i));
            planetsNameWookiee.add(String.valueOf(outWookiee));
        }

        Collections.sort(planetsName);
        System.out.println("Planets: " + planetsName);
        System.out.println("Wookiee name planets: " + planetsNameWookiee);
    }
}
