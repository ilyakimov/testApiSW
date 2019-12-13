package StarWars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
class OutDtoSpecies {
    private String name;
    private String classification;
    private String designation;
    private String average_height;
    private String average_lifespan;
    private String eye_colors;
    private String hair_colors;
    private String skin_colors;
    private String language;
    private String homeworld;
    private ArrayList<String> people;
    private ArrayList<String> films;
    private String url;
    private String created;
    private String edited;
}
