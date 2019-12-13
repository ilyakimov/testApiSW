package StarWars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
class OutDtoPeople {
    private String name;
    private String birth_year;
    private String eye_color;
    private String gender;
    private String hair_color;
    private String height;
    private String mass;
    private String skin_color;
    private String homeworld;
    private ArrayList<String> films;
    private ArrayList<String> species;
    private ArrayList<String> starships;
    private ArrayList<String> vehicles;
    private String url;
    private String created;
    private String edited;
}
