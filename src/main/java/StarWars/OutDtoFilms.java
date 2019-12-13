package StarWars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
class OutDtoFilms {
    private String title;
    private int episode_id;
    private String opening_crawl;
    private String director;
    private String producer ;
    private Date release_date;
    private ArrayList<String> species;
    private ArrayList<String> starships;
    private ArrayList<String> vehicles;
    private ArrayList<String> characters;
    private ArrayList<String> planets;
    private String url;
    private String created;
    private String edited;
}
